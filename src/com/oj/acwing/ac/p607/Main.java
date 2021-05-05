package com.oj.acwing.ac.p607;

import java.util.Scanner;

//607
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            System.out.printf("MEDIA = %.1f", (a * 2 + b * 3 + c * 5) / (10));
            System.out.println();
        }

    }

}
