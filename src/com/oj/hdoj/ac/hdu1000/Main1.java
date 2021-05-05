package com.oj.hdoj.ac.hdu1000;

import java.util.Scanner;

//hdu1000
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a, b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(sum(a, b));
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
