package com.dipesh;

import java.util.Arrays;

public class Pr4 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1, 0, -3};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
