package com.xcpc.training.training.part4.hdu2055;

import java.util.Scanner;

//hdu2055
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            char c = scanner.next().charAt(0);
            int n = scanner.nextInt();
//            c属于大写字母
            if (c >= 65 && c <= 90) {
                System.out.println((c - 64) + n);
//                c属于小写字母
            } else if (c >= 97 && c <= 122) {
                System.out.println(-((c - 96)) + n);
            }
        }
    }
}
