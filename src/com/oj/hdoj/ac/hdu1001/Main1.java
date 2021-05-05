package com.oj.hdoj.ac.hdu1001;

import java.util.Scanner;

//hdu1001
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(sum(1, n));
            System.out.println();
        }
    }

    //    累加
    public static int sum(int firstNum, int lastNum) {
        return (firstNum + lastNum) * (lastNum - firstNum + 1) / 2;
    }

}
