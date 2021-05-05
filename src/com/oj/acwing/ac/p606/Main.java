package com.oj.acwing.ac.p606;

import java.util.Scanner;

//p606,AC
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.printf("MEDIA = %.5f", ((a * 3.5 + b * 7.5) / 11));
        }
    }

}
