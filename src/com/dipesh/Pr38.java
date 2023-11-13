package com.dipesh;

import javax.swing.*;

public class Pr38 {

    public static void main(String[] args) {

        // Create a new frame
        JFrame frame = new JFrame("Student Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        // Create the components and add them to the panel
        JLabel nameLabel = new JLabel("Name: ");
        panel.add(nameLabel);

        JTextField nameField = new JTextField(20);
        panel.add(nameField);

        JLabel ageLabel = new JLabel("Age: ");
        panel.add(ageLabel);

        JTextField ageField = new JTextField(20);
        panel.add(ageField);

        JLabel idLabel = new JLabel("ID: ");
        panel.add(idLabel);

        JTextField idField = new JTextField(20);
        panel.add(idField);

        // Create a button and add it to the panel
        JButton button = new JButton("Submit");
        panel.add(button);

        JLabel name = new JLabel("Name : ");
        panel.add(name);
        JLabel age = new JLabel("Age : ");
        panel.add(age);
        JLabel id = new JLabel("ID : ");
        panel.add(id);

        nameLabel.setBounds(20, 20, 50, 30);
        nameField.setBounds(80, 20, 300, 30);

        ageLabel.setBounds(20, 70, 50, 30);
        ageField.setBounds(80, 70, 300, 30);

        idLabel.setBounds(20, 120, 50, 30);
        idField.setBounds(80, 120, 300, 30);

        button.setBounds(150, 170, 100, 30);

        name.setBounds(20, 230, 300, 30);
        age.setBounds(20, 280, 300, 30);
        id.setBounds(20, 330, 300, 30);

        button.addActionListener(e -> {
            name.setText("Name : " + nameField.getText());
            age.setText("Age : " + ageField.getText());
            id.setText("ID : " + idField.getText());
        });

        // Display the frame
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}