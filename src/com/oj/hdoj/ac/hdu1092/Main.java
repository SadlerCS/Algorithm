package com.oj.hdoj.ac.hdu1092;

import java.util.Scanner;

//hdu1092
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int sum = 0;
            if (n == 0) {
                break;
            }
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }
            System.out.println(sum);

        }
    }
}
