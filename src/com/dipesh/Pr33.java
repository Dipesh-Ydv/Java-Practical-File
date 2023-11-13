package com.dipesh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Pr33 {
    public static void main(String[] args) {
        new FlowLayoutExample();
        new BorderLayoutExample();
        new GridLayoutExample();
        new CardLayoutDemo();
    }

    static class FlowLayoutExample {

        FlowLayoutExample() {
            JFrame frame = new JFrame("Flow Layout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JPanel panel = new JPanel(new FlowLayout());
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            for (int i = 0; i < 10; i++) {
                JButton button = new JButton("Button " + (i + 1));
                panel.add(button);
            }

            frame.getContentPane().add(panel);
            frame.setVisible(true);
        }
    }

    static class BorderLayoutExample {
        BorderLayoutExample() {
            JFrame frame = new JFrame("Border Layout Example");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel northPanel = new JPanel();
            northPanel.add(new JLabel("North"));

            JPanel southPanel = new JPanel();
            southPanel.add(new JLabel("South"));

            JPanel eastPanel = new JPanel();
            eastPanel.add(new JLabel("East"));

            JPanel westPanel = new JPanel();
            westPanel.add(new JLabel("West"));

            JPanel centerPanel = new JPanel();
            centerPanel.add(new JLabel("Center"));

            frame.add(northPanel, BorderLayout.NORTH);
            frame.add(southPanel, BorderLayout.SOUTH);
            frame.add(eastPanel, BorderLayout.EAST);
            frame.add(westPanel, BorderLayout.WEST);
            frame.add(centerPanel, BorderLayout.CENTER);

            frame.setVisible(true);
        }
    }

    static class GridLayoutExample {
        GridLayoutExample() {
            JFrame frame = new JFrame("Grid Layout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JPanel panel = new JPanel(new GridLayout(3, 3));
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            for (int i = 0; i < 9; i++) {
                JButton button = new JButton("Button " + (i + 1));
                panel.add(button);
            }

            frame.getContentPane().add(panel);
            frame.setVisible(true);
        }
    }

    static class CardLayoutDemo {

        CardLayoutDemo() {

            JFrame frame = new JFrame("Card Layout Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JPanel cards = new JPanel(new CardLayout());

            JPanel panel1 = new JPanel();
            panel1.add(new JLabel("Panel 1"));

            JPanel panel2 = new JPanel();
            panel2.add(new JLabel("Panel 2"));

            JPanel panel3 = new JPanel();
            panel3.add(new JLabel("Panel 3"));

            cards.add(panel1);
            cards.add(panel2);
            cards.add(panel3);

            frame.add(cards);

            frame.add(new JButton(new AbstractAction("Switch Panel") {
                private int count = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    CardLayout cl = (CardLayout) (cards.getLayout());
                    cl.show(cards, "" + (++count % 3));
                }
            }), BorderLayout.SOUTH);

            frame.setVisible(true);
        }
    }
}
