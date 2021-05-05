package com.模板.快速幂;

public class Main {


    //    O(log n),long可以改成double（要求底数为小数时候用），分治
    static long fastPow2(long a, int n) {
        if (n == 1) return a;
        long tmp = fastPow2(a, n / 2);
        if (n % 2 == 1) return tmp * tmp * a;
        else return tmp * tmp;
    }


    //    非递归版本,位运算，O(log n)
    static long fastPow1(long a, int n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) ans *= a;
            a *= a;
            n >>= 1;
        }
        return ans;
    }

    //    快速幂取余1
    static long fastPow_mod1(long a, long n, int c) {//快速幂 a的b次方对c取余
        a = a % c;
        long res = 1;
        while (true) {
            if (n == 0) break;
            if (n % 2 == 1) res = (res * a) % c;
            a = (a * a) % c;
            n /= 2;
        }
        return res;
    }

    //    快速幂取余2
    static int fastPow_mod2(int a, int n, int c) {
        int ans = 1;
        int base = a % c;
        while (n > 0) {
            if ((n & 1) == 1) ans = (ans * base) % c;
            base = (base * base) % c;
            n >>= 1;
        }
        return ans;
    }


}
