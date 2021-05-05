package com.模板.素数;

public class Main {


    //    判断质数
    static boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if (n % 6 != 1 && n % 6 != 5) return false;
        int tmp = (int) Math.sqrt(n);
        for (int i = 5; i <= tmp; i++) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
