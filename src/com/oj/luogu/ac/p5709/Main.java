package com.oj.luogu.ac.p5709;

import java.util.Scanner;

//p
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int t = scanner.nextInt();
            int s = scanner.nextInt();
            if (t == 0 | s == 0 || s / t > m) {
                System.out.println(0);

            } else if (s % t == 0) {
                m -= s / t;
                System.out.println(m);
            } else {
                m -= (s / t) + 1;
                System.out.println(m);
            }

        }
    }

}
