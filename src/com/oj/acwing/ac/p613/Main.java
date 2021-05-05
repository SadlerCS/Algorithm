package com.oj.acwing.ac.p613;

import java.util.Scanner;

//613
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        while (scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            System.out.printf("TRIANGULO: %.3f", (a * c) / 2);
            System.out.println();

            System.out.printf("CIRCULO: %.3f", (pi * Math.pow(c, 2)));
            System.out.println();

            System.out.printf("TRAPEZIO: %.3f", ((a + b) * c / 2));
            System.out.println();

            System.out.printf("QUADRADO: %.3f", (Math.pow(b, 2)));
            System.out.println();

            System.out.printf("RETANGULO: %.3f", (a * b));
            System.out.println();

        }
    }

}
