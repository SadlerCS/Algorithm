package com.xcpc.training.training.part4.hdu2054;

import java.math.BigDecimal;
import java.util.Scanner;

//hdu2054
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            BigDecimal a = scanner.nextBigDecimal();
            BigDecimal b = scanner.nextBigDecimal();
            if (a.compareTo(b) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
