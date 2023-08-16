package com.dipesh;

import java.util.Scanner;

public class Pr9 {
    public static void main(String[] args) {
        int[][] matrix = inMatrix();

        System.out.println("----Given matrix----");
        printMatrix(matrix);

        System.out.println("----Transpose of the matrix----");
        matrixTranspose(matrix);

    }

    static int[][] inMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns for the matrix: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter the element for index (%d, %d): ", i+1, j+1);
                int element = sc.nextInt();
                matrix[i][j] = element;
            }
        }

        return matrix;
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void matrixTranspose(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
