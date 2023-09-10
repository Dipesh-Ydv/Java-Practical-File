package com.dipesh;

import java.awt.*;

public class Pr29 {
    public static void main(String[] args) {
        // creating reference of MyFrame
        MyFrame fr = new MyFrame();
        // setting the dimensions of frame
        fr.setSize(400, 300);
        // making frame visible
        fr.setVisible(true);

    }
    static class MyFrame extends Frame {
        // creating reference for various UI components
        Button btn;
        Label l;
        TextField tf;
        MyFrame() {
            // calling constructor of Frame class to set title
            super("UI Components");

            // creating various UI components
            btn = new Button("Click me");
            l = new Label("I'm a Label");
            tf = new TextField(40);

            // setting the layout for the frame window
            setLayout(new FlowLayout());

            // adding components to the frame window
            add(l);
            add(tf);
            add(btn);
        }
    }
}
