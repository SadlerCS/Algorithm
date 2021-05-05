package com.oj.luogu.ac.p1421;

import java.util.Scanner;

//p
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            float f = Float.parseFloat(a + "." + b);
            System.out.println((int) (f / 1.9));
        }

    }

}
