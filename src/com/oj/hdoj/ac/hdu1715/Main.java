package com.oj.hdoj.ac.hdu1715;

import java.math.BigInteger;
import java.util.Scanner;

//hdu1715
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(fib(n));
        }
    }

    static BigInteger fib(int n) {
        BigInteger res = new BigInteger("1");
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        for (int i = 3; i <= n; i++) {
            res = a.add(b);
            a = b;
            b = res;
        }
        return res;
    }
}
