package com.oj.hdoj.ac.hdu1094;

import java.util.Scanner;

//hdu1094
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int arr[] = new int[n + 1];
            arr[0] = 0;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                arr[0] += arr[i];
            }
            System.out.println(arr[0]);
        }
    }
}
