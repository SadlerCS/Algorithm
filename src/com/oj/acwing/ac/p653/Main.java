package com.oj.acwing.ac.p653;

import java.util.Scanner;

//653
public class Main {
    public static void main(String[] args) {
        int money[] = {100, 50, 20, 10, 5, 2, 1};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(n);
            for (int i = 0; i < money.length; i++) {
                int count = 0;
                count = n / money[i];
                System.out.printf("%d nota(s) de R$ %d,00", count, money[i]);
                System.out.println();
                n = n % money[i];
            }
        }
    }

}
