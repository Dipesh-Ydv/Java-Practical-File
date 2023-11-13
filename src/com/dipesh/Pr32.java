package com.dipesh;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Pr32 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
    static class MyFrame extends Frame implements ItemListener, ActionListener {
        Label l, l2, l3, lch, lcb, lrb;
        Checkbox c1, c2, c3, c4, c5, c6;
        CheckboxGroup cbg;
        Choice ch;

        public MyFrame() {
            lcb = new Label("------------------CHECKBOX-------------------");
            l = new Label("Nothing is selected");
            c1 = new Checkbox("Java");
            c2 = new Checkbox("Python");
            c3 = new Checkbox("C++");

            c1.addItemListener(this);
            c2.addItemListener(this);
            c3.addItemListener(this);

            lrb = new Label("----------------RADIO BUTTON----------------");
            l2 = new Label("Select any one");
            cbg = new CheckboxGroup();
            c4 = new Checkbox("Android", false, cbg);
            c5 = new Checkbox("Front End", false, cbg);
            c6 = new Checkbox("Back End", false, cbg);

            lch = new Label("-------------------CHOICE-------------------");
            l3 = new Label("Choose a branch: ");
            ch = new Choice();
            ch.add("CSE");
            ch.add("ECE");
            ch.add("ME");
            ch.add("Civil");

            setLayout(new FlowLayout());

            add(lcb);
            add(l);
            add(c1);
            add(c2);
            add(c3);
            add(lrb);
            add(l2);
            add(c4);
            add(c5);
            add(c6);
            add(lch);
            add(l3);
            add(ch);

        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            String str = "";
            if (c1.getState()) {
                str = str + "  " + c1.getLabel();
            }
            if (c2.getState()) {
                str = str + "  " + c2.getLabel();
            }
            if (c3.getState()) {
                str = str + "  " + c3.getLabel();
            }

            l.setText("Selected: " + str);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String str = ch.getItem(ch.getSelectedIndex());
            l3.setText(str);
        }
    }
}
