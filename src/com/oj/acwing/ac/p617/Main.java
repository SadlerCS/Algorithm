package com.oj.acwing.ac.p617;

import java.util.Scanner;

//617
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double l = scanner.nextDouble();
            System.out.printf("%.0f minutos", l / 30.0 * 60.0);
        }

    }

}
