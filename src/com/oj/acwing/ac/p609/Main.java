package com.oj.acwing.ac.p609;

import java.util.Scanner;

//p609,ac
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double c = scanner.nextDouble();
            System.out.printf("NUMBER = %d", a);
            System.out.println();
            System.out.printf("SALARY = U$ %.2f", ((double) b * c));
            System.out.println();
        }

    }

}
