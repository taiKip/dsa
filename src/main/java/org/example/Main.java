package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        swap(3, 2);
        int[] numbers = {3, 4, 5, 6};
        sumArray(numbers, numbers.length);

        int[][] a = {{1, 3, 2},
                {2, 4, 7}};
        //  printMatrix(a);
        int[][] b = {{0, 1, 5}, {3, -2, 8}};
        sumMatrix(a,b);

    }

    private static void sumArray(int[] numbers, int count) {
        int s = 0;
        for (int i = 0; i < count; i++) {
            s += numbers[i];
        }
        System.out.println(String.format("sum = %d ", s));
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(String.format("a : %d ; b : %d", a, b));
    }

    private static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void sumMatrix(int[][] mat1,int[][]mat2){
        int [][] sum = {{0,0,0},{0,0,0}};
        for (int i =0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
               sum[i][j] =mat1[i][j]+mat2[i][j];
            }
        }
        printMatrix(sum);
    }
}