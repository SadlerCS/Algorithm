package com.模板.输出;

public class Main {

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    static void printArrs(int arr[][]) {
        for (int k = 0; k < arr.length; k++) {
            printArr(arr[k]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 34, 55, 3};
        printArr(arr);
        int arr12[][] = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        printArrs(arr12);
        System.out.print("rstgsdffg");
    }


}
