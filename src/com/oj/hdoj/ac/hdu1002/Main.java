package com.oj.hdoj.ac.hdu1002;

import java.math.BigInteger;
import java.util.Scanner;

//1002 大数相加BigInteger,AC
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 1;
        while (n-- > 0) {
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            System.out.println("Case " + count++ + ":");
            System.out.println(a + " + " + b + " = " + bigAdd(a, b));
            if (n != 0) {
                System.out.println();
            }
        }
    }

    public static BigInteger bigAdd(BigInteger a, BigInteger b) {
        return a.add(b);
    }
}
