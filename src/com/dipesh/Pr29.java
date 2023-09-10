package com.dipesh;

import java.awt.*;

public class Pr29 {
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setSize(400, 300);
        fr.setVisible(true);

    }
    static class MyFrame extends Frame {
        Button btn;
        Label l;
        TextField tf;
        MyFrame() {
            super("UI Components");

            btn = new Button("Click me");
            l = new Label("I'm a Label");
            tf = new TextField(40);

            setLayout(new FlowLayout());

            add(l);
            add(tf);
            add(btn);
        }
    }
}
