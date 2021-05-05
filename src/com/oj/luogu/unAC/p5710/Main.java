package com.oj.luogu.unAC.p5710;

import java.util.Scanner;

//p
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            boolean flag1 = n % 2 == 0;
            boolean flag2 = (n > 4 || n <= 12);
            if (flag1 && flag2) System.out.print("1 ");
            else System.out.print("0 ");
            if (flag1 || flag2) System.out.print("1 ");
            else System.out.print("0 ");
            if (!flag1 == flag2) System.out.print("1 ");
            else System.out.print("0 ");
            if (!flag1 && !flag2) System.out.println("1");
            else System.out.println("0");
        }
    }

}
