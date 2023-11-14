package com.dipesh;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Pr20 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    static class MyFrame extends JFrame implements MouseListener, MouseMotionListener {

        JLabel l1, l2;

        MyFrame() {
            super("Mouse Event Handling");
            l1 = new JLabel();
            l2 = new JLabel();

            setLayout(null);

            l1.setBounds(100, 100, 200, 30);
            l2.setBounds(100, 130, 200, 30);

            add(l1);
            add(l2);

            addMouseListener(this);
            addMouseMotionListener(this);
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            l1.setText("Mouse Clicked");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            l1.setText("Mouse Pressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            l1.setText("Mouse Released");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            l1.setText("Mouse Entered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            l1.setText("Mouse Exited");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            l1.setText("Mouse Dragged");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            l1.setText("Mouse Moved");
            l2.setText("(" + e.getX() + ", " + e.getY() + ")");
        }
    }
}
