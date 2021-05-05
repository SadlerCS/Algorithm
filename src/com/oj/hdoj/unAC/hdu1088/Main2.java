package com.oj.hdoj.unAC.hdu1088;

import java.util.Scanner;

class gong {
    static void print() {
        for (int i = 0; i < 80; i++)
            System.out.print("-");
        System.out.println();
    }

    static void Print() {
        System.out.println();
    }
}

class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        String result = new String("");
        while (in.hasNext()) {
            str = in.next();
            if (str.compareTo("") == 0) continue;
            if (str.compareTo("<br>") == 0) {
                System.out.println(result);
                result = "";
            } else if (str.compareTo("<hr>") == 0) {
                if (result.compareTo("") != 0) System.out.println(result);
                gong.print();
                result = "";
            } else {
                String temp = result;
                if ((temp + " " + str).length() < 80)
                    if (result.compareTo("") != 0)
                        result += " " + str;
                    else result = str;
                else {
                    System.out.println(result);
                    result = str;
                }

            }

        }
        if (result.compareTo("") != 0)
            System.out.println(result);
    }
}
