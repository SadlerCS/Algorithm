package com.training.Main03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kzt = new Scanner(System.in);
        while (kzt.hasNext()) {
            int n = kzt.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kzt.nextInt();

            }
            int max = arr[0];
            for (int j = 1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }

            System.out.println(max);
        }
    }

}

