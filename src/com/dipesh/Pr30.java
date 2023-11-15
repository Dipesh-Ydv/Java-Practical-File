package com.dipesh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class Pr30 {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(600, 800);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setVisible(true);
    }

    static class MyFrame extends JFrame {
        JList fileList;
        JScrollPane sp, textSp;
        JTextArea ta;
        MyFrame() {
            super("File Reader");
            final String PATH = "/Users/dipeshyadav/Desktop";
            File files = new File(PATH);

            String[] allFiles = files.list();
            fileList = new JList<>(allFiles);

            sp = new JScrollPane(fileList);

            ta = new JTextArea();
            textSp = new JScrollPane(ta);

            fileList.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        int selectedIndex = fileList.getSelectedIndex();
                        String fileName = PATH + "/" + fileList.getModel().getElementAt(selectedIndex);
                        try {
                            BufferedReader br = new BufferedReader(new FileReader(fileName));
                            ta.read(br, null);
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                }
            });

            add(sp, BorderLayout.NORTH);
            add(textSp, BorderLayout.CENTER);
        }
    }
}
