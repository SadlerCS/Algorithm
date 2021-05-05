package com.oj.acwing.ac.p604;

import java.util.Scanner;

//p604,AC
public class Main {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double r = scanner.nextDouble();
            System.out.printf("A=%.4f", pi * Math.pow(r, 2));
        }
    }
}
