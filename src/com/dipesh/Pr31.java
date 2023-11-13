package com.dipesh;

import javax.swing.*;
import java.awt.*;

public class Pr31 {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(600, 600);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setVisible(true);
    }
    static class MyFrame extends JFrame {
        JButton b1, b2, b3;

        MyFrame() {
            super("Colored Frame");

            b1 = new JButton("Red");
            b2 = new JButton("Green");
            b3 = new JButton("Blue");

            b1.setForeground(Color.RED);
            b2.setForeground(Color.GREEN);
            b3.setForeground(Color.BLUE);

            setLayout(null);

            b1.setBounds(140, 40, 80, 40);
            b2.setBounds(260, 40, 80, 40);
            b3.setBounds(380, 40, 80, 40);

            b1.addActionListener(e -> getContentPane().setBackground(Color.RED));
            b2.addActionListener(e -> getContentPane().setBackground(Color.GREEN));
            b3.addActionListener(e -> getContentPane().setBackground(Color.BLUE));

            add(b1);
            add(b2);
            add(b3);
        }
    }
}
