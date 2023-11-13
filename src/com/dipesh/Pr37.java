package com.dipesh;

import javax.swing.*;
import java.awt.*;

public class Pr37 extends JFrame {

    public Pr37() {
        setTitle("Smiley Face");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
        // Set background color
        getContentPane().setBackground(Color.WHITE);

        // Draw face
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 200, 200);

        // Draw eyebrows
        g.setColor(Color.BLACK);
        g.drawLine(145, 145, 175, 165);
        g.drawLine(235, 165, 265, 145);

        // Draw eyes
        g.setColor(Color.BLUE);
        g.fillOval(155, 175, 20, 20);
        g.fillOval(225, 175, 20, 20);

        // Draw nose
        g.setColor(Color.RED);
        g.fillOval(190, 225, 20, 20);

        // Draw smile
        g.setColor(Color.GREEN);
        g.drawArc(150, 175, 100, 100, 200, 140);
    }

    public static void main(String[] args) {
//        SwingUtilities.invokeLater(Pr37::new);
        new Pr37();
    }

}