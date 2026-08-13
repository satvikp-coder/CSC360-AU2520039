package com.example;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class App extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set the brush color to Blue
        g.setColor(Color.BLUE);
        
        // Draw a solid square: (x_position, y_position, width, height)
        g.fillRect(150, 100, 200, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Maven Square Project");
        App panel = new App();
        
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
