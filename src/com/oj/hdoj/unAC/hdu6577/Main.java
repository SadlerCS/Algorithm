package com.oj.hdoj.unAC.hdu6577;

import java.util.Scanner;

//hdu
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = (x + y) / 2;
            int b = x - a;

            System.out.println(a * b);
        }

    }

}
