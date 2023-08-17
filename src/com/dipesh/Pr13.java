package com.dipesh;

import java.util.Scanner;

public class Pr13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to check palindrome: ");
        String word = sc.next();

        if (isPalindrome(word)) {
            System.out.println("Given word is Palindrome");
        } else {
            System.out.println("Given word is not Palindrome");
        }
    }

    static boolean isPalindrome(String str) {
        // converting string to lowercase to ignore case sensitivity
        str = str.toLowerCase();

        //
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equals(str);
    }
}
