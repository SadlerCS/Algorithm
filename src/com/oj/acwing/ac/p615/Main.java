package com.oj.acwing.ac.p615;

import java.util.Scanner;

//p615
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.printf("%.3f km/l", a / b);
            System.out.println();
        }
    }

}
