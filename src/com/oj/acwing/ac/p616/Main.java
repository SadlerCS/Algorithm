package com.oj.acwing.ac.p616;

import java.util.Scanner;

//p616,ac
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            System.out.printf("%.4f", (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
            System.out.println();
        }
    }

}
