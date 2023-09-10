package com.dipesh;

import java.awt.*;

public class Pr27 {
    public static void main(String[] args) {
        Drawing d = new Drawing();
        d.setTitle("Drawing using Graphics");
        d.setSize(600, 400);
        d.setVisible(true);
    }

    static class Drawing extends Frame {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            // setting red color for line
            g.setColor(Color.RED);
            // setting the stroke of line
            g2.setStroke(new BasicStroke(4));
            // setting co-ordinates to draw line
            g.drawLine(50, 50, 200, 200);

            // setting orange color for rectangle
            g.setColor(Color.ORANGE);
            // drawing rectangle
            g.fillRect(50, 250, 200, 120);

            // setting yellow color for oval
            g.setColor(Color.YELLOW);
            // drawing oval
            g.fillOval(300, 50, 200, 120);

            // setting darkGray color for line
            g.setColor(Color.DARK_GRAY);
            // setting a font type, style, and size
            g.setFont(new Font("Roman", Font.BOLD, 40));
            // drawing text
            g.drawString("Hello World", 300, 300);
        }
    }
}
