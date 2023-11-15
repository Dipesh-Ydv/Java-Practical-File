package com.dipesh;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Pr8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the arithmetic expression: ");
        String expression = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);
        int totalTokens = tokenizer.countTokens();

        double result = 0;
        double firstOperand = Double.parseDouble(tokenizer.nextToken());
        String op = tokenizer.nextToken().trim();
        double secondOperand = Double.parseDouble(tokenizer.nextToken());

        for (int i = 0; i < totalTokens; i++) {

            result = switch (op) {
                case "+" -> firstOperand + secondOperand;
                case "-" -> firstOperand - secondOperand;
                case "*" -> firstOperand * secondOperand;
                case "/" -> firstOperand / secondOperand;
                default -> result;
            };
            if (tokenizer.hasMoreTokens()) {

                op = tokenizer.nextToken().trim();
                firstOperand = result;
                secondOperand = Double.parseDouble(tokenizer.nextToken());
            }
        }

        System.out.println("The result of the arithmetic operation is: " + result);
    }
}