package com.dipesh;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Pr7 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("2+3-1*8/4", "+-*/");
        int[] operand = new int[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            operand[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        System.out.println(Arrays.toString(operand));
    }
}
