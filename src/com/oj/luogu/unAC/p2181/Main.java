package com.oj.luogu.unAC.p2181;

import java.math.BigInteger;
import java.util.Scanner;

//p
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger r = a.multiply(a.subtract(BigInteger.valueOf(1))).multiply(a.subtract(BigInteger.valueOf(2)).multiply(a.subtract(BigInteger.valueOf(3)).divide(BigInteger.valueOf(24))));

//        long n = scanner.nextLong();
//        long res = n * (n - 1) / 2 * (n - 2) / 3 * (n - 3) / 4;
        System.out.println(r);

    }

}
