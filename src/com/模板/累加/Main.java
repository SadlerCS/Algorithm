package com.模板.累加;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = scanner.nextInt();
            System.out.println(sum(1, n));
            System.out.println();

        }
    }

    //    O(n)
    static long sum1(long a, long b) {
        long sum = 0;
        for (long i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    //    O(1),求a-b的累加
    static long sum(long a, long b) {
        return (a + b) * (b - a + 1) / 2;
    }

}
