package com.oj.hdoj.ac.hdu2039;

import java.util.Scanner;

//hdu2039
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
