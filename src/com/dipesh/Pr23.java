package com.dipesh;

public class Pr23 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}

class ExceptionHandling {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in main: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed in main.");
        }
    }

    public static void throwException() throws ArithmeticException {
        try {
            int num = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in throwException: " + e.getMessage());
            throw e; // This line propagates the exception up the call stack
        } finally {
            System.out.println("This block is always executed in throwException.");
        }
    }
}

class CustomException extends Exception {
    public CustomException(String errorMessage) {
        super(errorMessage);
    }
}

class CustomExceptionHandling {
    public static void validateInput(int input) throws CustomException {
        if (input < 0) {
            throw new CustomException("Invalid input! Input cannot be negative.");
        }
    }

    public static void main(String[] args) {
        try {
            validateInput(-5);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}