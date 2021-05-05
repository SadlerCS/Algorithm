package com.oj.hdoj.ac.hdu2028;

import java.util.Scanner;

//hdu2028
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(lcmArr(arr));

        }
    }

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
        for (int i = 2; i < arr.length; i++) {
            int tmp = gcd(res, arr[i]);
            res = tmp;
        }
        return res;
    }

    //    n个数的lcm
    static int lcmArr(int arr[]) {
        int lcm = arr[0];
        if (arr.length == 1) return lcm;
        for (int i = 1; i < arr.length; i++) lcm = lcm / gcd(lcm, arr[i]) * arr[i];
        return lcm;
    }


}
