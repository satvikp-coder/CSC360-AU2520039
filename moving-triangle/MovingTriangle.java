import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

/**
 * CSC360 - Project 1
 * A triangle that follows the mouse cursor.
 *
 * Core idea (FK Chapter 2 - Geometric Transformations):
 * We define the triangle ONCE around the origin (0,0), then every time
 * the mouse moves we build a new AffineTransform that TRANSLATES the
 * triangle so its centroid sits at the current mouse position, and
 * apply that transform inside paintComponent() before drawing.
 *
 * This is the cleanest way to explain "transformation" to the professor:
 * the shape's own coordinates never change - only the transform matrix does.
 */
public class MovingTriangle extends JPanel implements MouseMotionListener {

    // Triangle defined around origin (0,0). Size ~ 60px.
    private final Path2D.Double triangle;

    // Current mouse position (where we want the triangle's centroid to be)
    private int mouseX = 300;
    private int mouseY = 300;

    public MovingTriangle() {
        setBackground(Color.WHITE);
        addMouseMotionListener(this);

        // Build an equilateral-ish triangle centered at (0,0)
        triangle = new Path2D.Double();
        triangle.moveTo(0, -40);     // top vertex
        triangle.lineTo(-35, 30);    // bottom-left vertex
        triangle.lineTo(35, 30);     // bottom-right vertex
        triangle.closePath();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Build a fresh transform each frame: translate to mouse position
        AffineTransform at = new AffineTransform();
        at.translate(mouseX, mouseY);

        // Apply transform to a COPY of the path (never mutate the original shape)
        Shape transformed = at.createTransformedShape(triangle);

        g2.setColor(new Color(70, 130, 220));
        g2.fill(transformed);
        g2.setColor(Color.BLACK);
        g2.draw(transformed);

        g2.setColor(Color.GRAY);
        g2.drawString("Move the mouse - triangle follows via AffineTransform.translate()", 15, 25);
    }

    // ---- MouseMotionListener callbacks ----
    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint(); // triggers paintComponent() again with new position
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseMoved(e); // treat drag the same as move
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("CSC360 Project 1 - Moving Triangle");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new MovingTriangle());
            frame.setSize(600, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
