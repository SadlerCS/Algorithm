package com.xcpc.training.training.part3.hdu2734;

import java.util.Scanner;

//hdu2734,AC
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (s.equals("#")) {
                break;
            }
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i)) == true) {
                    sum += (i + 1) * (int) (s.charAt(i) - 64);
                } else {
                    sum += 0;
                }
            }
            System.out.println(sum);
        }
    }
}
