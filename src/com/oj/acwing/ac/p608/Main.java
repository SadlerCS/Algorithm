package com.oj.acwing.ac.p608;

import java.util.Scanner;

//p608,ac
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            System.out.printf("DIFERENCA = %d", (a * b - c * d));
        }
    }

}
