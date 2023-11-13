package com.dipesh;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class Pr39 {
    public static void main(String[] args) {

        ActionListener taskPerformer = evt -> {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            timeLabel.setText(dateFormat.format(date));
        };

        // Create a frame to hold the time label
        JFrame frame = new JFrame("System Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a label to display the time
        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        frame.add(timeLabel);

        // Create a timer to schedule the update of the time label
        Timer timer = new Timer(1000, taskPerformer);
        timer.start();

        // Display the frame
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    static JLabel timeLabel;
}
