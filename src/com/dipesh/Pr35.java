package com.dipesh;

import java.util.Arrays;
import java.util.Scanner;

public class Pr35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.next();

        int len = str.length();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len - i; j++) {
                if (charArray[j] < charArray[j-1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j-1];
                    charArray[j-1] = temp;
                }
            }
        }

        StringBuilder ans = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            ans.append(charArray[i]);
        }

        System.out.print("Alphabetical order of the given string is: ");
        System.out.println(ans);
    }


}
