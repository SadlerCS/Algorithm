package com.oj.luogu.ac.p1009;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static BigInteger[] biArr = new BigInteger[51];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        biArr[1] = BigInteger.valueOf(1);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            factorial(n);
            System.out.println(sum(biArr, n));
        }
    }

    static BigInteger factorial(int n) {
        BigInteger res = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
            biArr[i] = res;
        }

        return res;
    }

    static BigInteger sum(BigInteger arr[], int n) {
        BigInteger res = new BigInteger("0");
        for (int i = 1; i <= n; i++) {
            res = res.add(biArr[i]);
        }
        return res;
    }
}