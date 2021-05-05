package com.模板.gcd;

public class Main {


    //    辗转相除法，O(log n)
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    //    最小公倍数
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    //    n个数的最大公约数,大于2个数的时候用
    static int gcdArr(int arr[]) {
        int res = gcd(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) res = gcd(res, arr[i]);
        return res;
    }

    //n个数的lcm
    static int lcmArr(int arr[]) {
        int lcm = arr[0];
        if (arr.length == 1) return lcm;
        for (int i = 1; i < arr.length; i++) lcm = lcm / gcd(lcm, arr[i]) * arr[i];
        return lcm;
    }

    //是否为互质数(isRelativelyPrimerNumber)
    static boolean isRpn(int a, int b) {
        if (a == b) return false;
        return gcd(a, b) == 1;
    }


}
