package com.oj.hdoj.ac.hdu2013;

import java.util.Scanner;

//hdu2013
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int sum = 1;
            for (int i = 0; i < n - 1; i++) {
                sum = (sum + 1) * 2;
            }
            System.out.println(sum);
        }
    }
}
