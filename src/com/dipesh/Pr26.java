package com.dipesh;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Pr26 extends Applet implements ActionListener {

    private TextField input1TextField, input2TextField, resultTextField;
    private Button addButton, subtractButton, multiplyButton, divideButton;

    public void init() {
        setLayout(new FlowLayout());

        input1TextField = new TextField(5);
        add(input1TextField);

        input2TextField = new TextField(5);
        add(input2TextField);

        addButton = new Button("Add");
        addButton.addActionListener(this);
        add(addButton);

        subtractButton = new Button("Subtract");
        subtractButton.addActionListener(this);
        add(subtractButton);

        multiplyButton = new Button("Multiply");
        multiplyButton.addActionListener(this);
        add(multiplyButton);

        divideButton = new Button("Divide");
        divideButton.addActionListener(this);
        add(divideButton);

        resultTextField = new TextField(10);
        resultTextField.setEditable(false);
        add(resultTextField);
    }

    public void actionPerformed(ActionEvent e) {
        double num1, num2, result;

        try {
            num1 = Double.parseDouble(input1TextField.getText());
            num2 = Double.parseDouble(input2TextField.getText());
        } catch (NumberFormatException ex) {
            resultTextField.setText("Invalid input. Please enter a number.");
            return;
        }

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            if (num2 == 0) {
                resultTextField.setText("Cannot divide by zero.");
                return;
            }
            result = num1 / num2;
        } else {
            return;
        }

        resultTextField.setText(Double.toString(result));
    }
}
