package com.oj.luogu.ac.p2433;

import java.util.Scanner;

//p2433
//别写对java不友好
public class Main {
    public static void main(String[] args) {
        double PI = 3.141593;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("I love Luogu!");
        } else if (n == 2) {
            System.out.println("6 4");
        } else if (n == 3) {
            System.out.println("3");
            System.out.println("12");
            System.out.println("2");
        } else if (n == 4) {
            System.out.println("166.667");
        } else if (n == 5) {
            System.out.println("15");
        } else if (n == 6) {
            System.out.println("10.8167");
        } else if (n == 7) {
            System.out.println("110");
            System.out.println("90");
            System.out.println("0");
        } else if (n == 8) {

            System.out.printf("%.4f", PI * 10);
            System.out.println();
            System.out.printf("%.4f", PI * 25);
            System.out.println();
            System.out.printf("%.3f", PI * 5 * 5 * 5 * 4 / 3);
            System.out.println();
        } else if (n == 9) {
            System.out.println("22");
        } else if (n == 10) {
            System.out.println("9");
        } else if (n == 11) {
            System.out.println("33.3333");
        } else if (n == 12) {
            System.out.println("13");
            System.out.println("R");
        } else if (n == 13) {
            double V1 = 4 * PI * 64 / 3.0, V2 = 4 * PI * 1000 / 3.0;
            System.out.println((int) Math.pow(V1 + V2, 1 / 3.0));
        } else if (n == 14) {
            System.out.println("50");
        }


    }

}
