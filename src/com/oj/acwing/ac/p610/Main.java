package com.oj.acwing.ac.p610;

import java.util.Scanner;

//610
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String name = scanner.next();
            if (name.length() > 10) {
                break;
            }
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.printf("TOTAL = R$ %.2f", (a + b * 0.15));
            System.out.println();
        }

    }

}
