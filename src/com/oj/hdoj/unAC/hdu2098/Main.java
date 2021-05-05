package com.oj.hdoj.unAC.hdu2098;

import java.util.Scanner;

//hdu2098
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int count = 0;
            for (int i = 2; i < n / 2; i++) {
                if (isPrime(i) && isPrime(n - i)) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }

    //    判断质数
    static boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if (n % 6 != 1 && n % 6 != 5) return false;
        int tmp = (int) Math.sqrt(n);
        for (int i = 5; i <= tmp; i++) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;


    }

}
