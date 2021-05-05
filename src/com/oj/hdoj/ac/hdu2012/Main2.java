package com.oj.hdoj.ac.hdu2012;

import java.util.Scanner;

//hdu2012
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            int count = 0;
            for (int i = x; i <= y; i++) {
                int res = i * i + i + 41;
                if (isPrime(res)) {
                    count++;
                }
            }
            if (count == (y - x + 1)) {
                System.out.println("OK");
            } else {
                System.out.println("Sorry");
            }
        }
    }

    //    判断质数
    static boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if (n % 6 != 1 && n % 6 != 5) return false;
        int tmp = (int) Math.sqrt(n);
        for (int i = 5; i <= tmp; i++) if (n % i == 0 || n % (i + 2) == 0) return false;
        return true;
    }
}
