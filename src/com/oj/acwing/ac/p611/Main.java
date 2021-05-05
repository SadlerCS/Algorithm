package com.oj.acwing.ac.p611;

import java.util.Scanner;

//611
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            double sum = 0;

            for (int i = 0; i < 2; i++) {
                int n = scanner.nextInt();
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                sum += a * b;
            }
            System.out.printf("VALOR A PAGAR: R$ %.2f", sum);
            System.out.println();

        }
    }

}
