package com.oj.hdoj.ac.hdu2000;

import java.util.Scanner;

//hdu2000
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
//            输入字符串
            String string = scanner.next();
            char c[] = new char[3];
//            字符串转字符数组
            for (int i = 0; i < 3; i++) {
                c[i] = string.charAt(i);
            }

//            冒泡排序
            for (int i = 0; i < c.length - 1; i++) {
                for (int j = 0; j < c.length - 1 - i; j++) {
                    if (c[j] > c[j + 1]) {
                        char temp = c[j];
                        c[j] = c[j + 1];
                        c[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < c.length - 1; i++) {
                System.out.print(c[i] + " ");
            }
            System.out.println(c[c.length - 1]);
        }
    }
}
