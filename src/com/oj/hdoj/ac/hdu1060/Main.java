package com.oj.hdoj.ac.hdu1060;

import java.util.Scanner;

//hdu1060
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(initailNum(n, n));


        }

    }

    /*log10N^N = N*log10N = M = a.b(a是整数部分，0.b是小数部分)
所以10^M = 10^a.b = N^N(即N^N为a位数)
10^b向下取整即为首位数
举个例子：3^3=27, 3log3 = 1.431364, 10^0.431364 = 2.70000……*/
    static int initailNum(long a, long n) {
        double m = (double) n * Math.log10((double) n);
        double g = m - (long) m;
        g = Math.pow(10, g);
        return (int) g;
    }

}
