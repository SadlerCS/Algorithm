package com.oj.hdoj.ac.hdu2019;

import java.util.Scanner;

//hdu2019
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int index = 0;
            if (n == 0 && m == 0) {
                break;
            }
            int arr[] = new int[n];
            int newArr[] = new int[n + 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                if (m >= arr[i]) {
                    index = i + 1;
                }
            }
            newArr[index] = m;
            int j = 0;

            for (int i = 0; i < arr.length; i++) {
                if (i < index) {
                    newArr[j++] = arr[i];
                } else {
                    newArr[++j] = arr[i];
                }
            }


            for (int i = 0; i < newArr.length - 1; i++) {
                System.out.print(newArr[i] + " ");
            }
            System.out.println(newArr[newArr.length - 1]);


        }
    }
}
