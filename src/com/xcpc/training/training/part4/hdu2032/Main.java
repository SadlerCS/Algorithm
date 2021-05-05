package com.xcpc.training.training.part4.hdu2032;

import java.util.Scanner;

//hdu2032
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int arr[][] = new int[n][];
            for (int i = 0; i < n; i++) {
                arr[i] = new int[i + 1];
            }
            for (int i = 0; i < n; i++) {
                arr[i][0] = arr[i][i] = 1;
            }

            for (int i = 1; i < arr.length; i++) {
                for (int j = 1; j < arr[i].length - 1; j++) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length - 1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(arr[i][arr[i].length - 1]);
            }
            System.out.println();
        }
    }
}
