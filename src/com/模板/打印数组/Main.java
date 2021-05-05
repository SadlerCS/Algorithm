package com.模板.打印数组;

public class Main {
    public static void main(String[] args) {
        printArr(new int[]{1, 2, 4, 5, 6});
        System.out.println();
        print_2DArray(new int[][]{
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9, 10, 11}
        });
    }


    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    static void print_2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(arr[i][arr[i].length - 1]);
        }
    }
}
