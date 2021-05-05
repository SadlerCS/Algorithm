package com.xcpc.training.training.part2.hdu2004;

import java.util.Scanner;

//hdu2004
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n <= 100 && n >= 90) {
                System.out.println("A");
            } else if (n <= 89 && n >= 80) {
                System.out.println("B");
            } else if (n <= 79 && n >= 70) {
                System.out.println("C");
            } else if (n <= 69 && n >= 60) {
                System.out.println("D");
            } else if (n <= 59 && n >= 0) {
                System.out.println("E");
            } else {
                System.out.println("Score is error!");
            }
        }
    }
}
