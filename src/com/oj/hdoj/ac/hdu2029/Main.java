package com.oj.hdoj.ac.hdu2029;

import java.util.Scanner;

//hdu2029
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (scanner.hasNext()) {
            String s = scanner.next();
            boolean flag = true;
            for (int i = 0; i < s.length() / 2; i++) {
                if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
