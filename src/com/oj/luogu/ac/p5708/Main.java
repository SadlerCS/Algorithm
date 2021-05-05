package com.oj.luogu.ac.p5708;

import java.util.Scanner;

//p
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double p = (a + b + c) / 2;
            double res = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("%.1f", res);
            System.out.println();
        }

    }

}
