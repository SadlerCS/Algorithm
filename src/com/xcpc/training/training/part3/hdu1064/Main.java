package com.xcpc.training.training.part3.hdu1064;

import java.util.Scanner;

//hdu1064,AC
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            double n = scanner.nextDouble();
            sum += n;
        }
        double avg = sum / 12;
        System.out.printf("$%.2f", avg);
        System.out.println();
    }
}