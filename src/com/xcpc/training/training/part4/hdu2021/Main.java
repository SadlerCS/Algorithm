package com.xcpc.training.training.part4.hdu2021;

import java.util.Scanner;

//hdu2021
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money[] = {100, 50, 10, 5, 2, 1};
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 0;
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < money.length; j++) {
                    sum += arr[i] / money[j];
                    arr[i] = arr[i] % money[j];
                }
            }
            System.out.println(sum);

        }
    }
}
