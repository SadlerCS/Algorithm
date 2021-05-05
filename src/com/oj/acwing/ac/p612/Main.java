package com.oj.acwing.ac.p612;

import java.util.Scanner;

//612
public class Main {
    public static void main(String[] args) {

        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int r = scanner.nextInt();
            System.out.printf("VOLUME = %.3f", (pi * Math.pow(r, 3) * 4 / 3));
            System.out.println();
        }

    }

}
