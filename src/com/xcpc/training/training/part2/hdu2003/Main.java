package com.xcpc.training.training.part2.hdu2003;

import java.util.Scanner;

//hdu2003
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double res = scanner.nextDouble();
            System.out.printf("%.2f", Math.abs(res));
            System.out.println();
        }
    }
}
