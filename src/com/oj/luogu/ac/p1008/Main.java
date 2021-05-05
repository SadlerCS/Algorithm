package com.oj.luogu.ac.p1008;

/**
 * 判断是否含有九个数字
 */
public class Main {


    public static boolean legal(int a, int b, int c) {
        String str = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
        if (str.contains("1") && str.contains("2") && str.contains("3") && str.contains("4")
                && str.contains("5") && str.contains("6") && str.contains("7") && str.contains("8")
                && str.contains("9"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int b, c;
        for (int a = 123; a <= 329; a++) {
            b = 2 * a;
            c = 3 * a;
            if (legal(a, b, c))
                System.out.println(a + " " + b + " " + c);
        }
    }
}
