package com.oj.luogu.ac.p5706;

import java.util.Scanner;

//p5706
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int b = scanner.nextInt();
        System.out.printf("%.3f", a / (double) b);
        System.out.println();
        System.out.println(b * 2);
    }

}
