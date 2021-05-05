package com.oj.luogu.ac.p1425;

import java.util.Scanner;

//p1425
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (d - b < 0) {
            System.out.print(c - a - 1 + " ");
            System.out.println(d + 60 - b);
        } else {
            System.out.print(c - a + " ");
            System.out.println(d - b);
        }

    }

}
