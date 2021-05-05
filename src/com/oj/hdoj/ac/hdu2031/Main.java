package com.oj.hdoj.ac.hdu2031;

import java.util.Scanner;

//hdu2031,进制转换输出,AC
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int radix = scanner.nextInt();
            String s = Integer.toString(num, radix);
            System.out.println(s.toUpperCase());
        }
    }

}
