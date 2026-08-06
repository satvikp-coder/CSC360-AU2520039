import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * CSC360 - Project 2
 * A triangle that continuously zooms in and out.
 *
 * Core idea (FK Chapter 2 - Geometric Transformations / Animation-Interpolation):
 * We keep a "scale" variable that oscillates between MIN_SCALE and MAX_SCALE.
 * On every timer tick we:
 *   1. Update scale (bounce between min/max like a ping-pong)
 *   2. Build an AffineTransform: translate to center, then scale
 *   3. Repaint
 *
 * Order of transforms matters: we translate to the canvas center FIRST,
 * then scale, so the triangle zooms in/out around its own center rather
 * than around the top-left corner of the window.
 */
public class ZoomingTriangle extends JPanel {

    private final Path2D.Double triangle;

    private double scale = 1.0;
    private double scaleStep = 0.02;   // how much scale changes per tick
    private static final double MIN_SCALE = 0.4;
    private static final double MAX_SCALE = 2.5;

    public ZoomingTriangle() {
        setBackground(Color.WHITE);

        // Triangle defined around origin (0,0), base size
        triangle = new Path2D.Double();
        triangle.moveTo(0, -50);
        triangle.lineTo(-45, 40);
        triangle.lineTo(45, 40);
        triangle.closePath();

        // Timer fires every 30ms (~33 fps) - this drives the animation
        Timer timer = new Timer(30, e -> {
            scale += scaleStep;
            // Bounce back when we hit either limit (ping-pong / interpolation)
            if (scale >= MAX_SCALE || scale <= MIN_SCALE) {
                scaleStep = -scaleStep;
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int cx = getWidth() / 2;
        int cy = getHeight() / 2;

        // Translate to center FIRST, then scale, so zoom happens about the center
        AffineTransform at = new AffineTransform();
        at.translate(cx, cy);
        at.scale(scale, scale);

        Shape transformed = at.createTransformedShape(triangle);

        g2.setColor(new Color(220, 90, 60));
        g2.fill(transformed);
        g2.setColor(Color.BLACK);
        g2.draw(transformed);

        g2.setColor(Color.GRAY);
        g2.drawString("Zoom driven by Swing Timer + AffineTransform.scale()", 15, 25);
        g2.drawString(String.format("scale = %.2f", scale), 15, 45);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("CSC360 Project 2 - Zooming Triangle");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ZoomingTriangle());
            frame.setSize(600, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
