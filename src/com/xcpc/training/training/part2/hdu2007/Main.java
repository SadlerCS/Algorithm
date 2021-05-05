package com.xcpc.training.training.part2.hdu2007;

import java.util.Scanner;

//hdu2007
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
//            判断start>end情况
            if (start > end) {
                int temp = start;
                start = end;
                end = temp;
            }
            int evenSum = 0;
            int oddSum = 0;
            for (int i = start; i <= end; i++) {
//                偶数
                if (i % 2 == 0) {
                    evenSum += Math.pow(i, 2);
//                奇数
                } else {
                    oddSum += Math.pow(i, 3);
                }

            }
            System.out.println(evenSum + " " + oddSum);
        }
    }
}
