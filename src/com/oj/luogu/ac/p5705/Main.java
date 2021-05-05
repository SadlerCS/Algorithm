package com.oj.luogu.ac.p5705;

import java.util.Scanner;

//p5705
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        String s = String.valueOf(a);
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

    }

}
