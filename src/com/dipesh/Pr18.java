package com.dipesh;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Pr18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of different data types separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            try {
                int intValue = Integer.parseInt(token);
                System.out.println("Integer value: " + intValue);
            } catch (NumberFormatException e) {
                // ignore
            }

            try {
                double doubleValue = Double.parseDouble(token);
                System.out.println("Double value: " + doubleValue);
            } catch (NumberFormatException e) {
                // ignore
            }

            if (token.equalsIgnoreCase("true") || token.equalsIgnoreCase("false")) {
                boolean booleanValue = Boolean.parseBoolean(token);
                System.out.println("Boolean value: " + booleanValue);
            } else if (token.length() == 1) {
                System.out.println("Character value: " + token);
            } else {
                System.out.println("String value: " + token);
            }
        }
    }
}
