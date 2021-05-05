package com.oj.acwing.ac.p614;

import java.util.Scanner;

//614
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int max = (a + b + Math.abs(a - b)) / 2;
            max = (max + c + Math.abs(max - c)) / 2;
            System.out.printf("%d eh o maior", max);
            System.out.println();
        }

    }

}
