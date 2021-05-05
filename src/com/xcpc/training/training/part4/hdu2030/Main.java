package com.xcpc.training.training.part4.hdu2030;

import java.util.Scanner;

//hdu2030
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) > 127) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
