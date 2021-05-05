package com.training.algorithm.recursion;

import java.util.Scanner;

public class RecursionTest {
    public static void main(String[] args) {
        //通过打印问题,回顾递归通用机制
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            test(n);
        }
    }

    public static void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n=" + n);
    }

}
