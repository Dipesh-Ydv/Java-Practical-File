package com.dipesh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pr33 extends JFrame implements ActionListener {
    static JFrame f;
    public static void main(String[] args)
    {
        f = new JFrame("Frame for Dialog Box");
        Pr33 s = new Pr33();

        JPanel p = new JPanel();
        JButton b = new JButton("Click");

        b.addActionListener(s);

        p.add(b);
        f.add(p);

        f.setSize(400, 400);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("click")) {
            JDialog d = new JDialog(f, "Dialog Box");

            JLabel l = new JLabel("This is a dialog box");

            d.setLayout(new FlowLayout());
            d.add(l);
            d.setSize(200, 200);
            d.setVisible(true);
        }
    }
}