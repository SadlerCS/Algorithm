package com.xcpc.training.training.part4.hdu2028;

import java.util.Scanner;

//hdu2028
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
//            lcm=num1/gcd*num2;
            int lcm = arr[0];

            if (n == 1) {
                System.out.println(lcm);
                continue;
            }
            for (int i = 1; i < n; i++) {
                lcm = lcm / gcd(lcm, arr[i]) * arr[i];
            }
            System.out.println(lcm);
        }
    }


    //    最大公约数
    public static int gcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }

        }
        return num1;
    }

}
