package com.oj.acwing.ac.p654;

import java.util.Scanner;

//654
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int hours = n / 3600;
            int minutes = n / 60 % 60;
            int seconds = n % 60;
            System.out.printf("%d:%d:%d", hours, minutes, seconds);
            System.out.println();
        }

    }

}
