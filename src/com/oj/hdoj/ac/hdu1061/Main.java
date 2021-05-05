package com.oj.hdoj.ac.hdu1061;

import java.util.Scanner;

//hdu1061
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextInt();
            long res = fastpow1(n, n, 10);
            System.out.println(res);
        }
    }

    //    非递归版本,位运算，O(log n)
//    static long fastpow1(long a, long n) {
//        long ans = 1;
//        while (n > 0) {
//            if ((n & 1) == 1) ans *= a;
//            a *= a;
//            n >>= 1;
//        }
//        return ans;
//    }

    //    取余版本
    static long fastpow1(long a, long n, int c) {//快速幂 a的b次方对c取余
        a = a % c;
        long sum = 1;
        while (true) {
            if (n == 0) {
                break;
            }
            if (n % 2 == 1) {
                sum = (sum * a) % c;
            }
            a = (a * a) % c;
            n /= 2;
        }
        return sum;
    }

}
