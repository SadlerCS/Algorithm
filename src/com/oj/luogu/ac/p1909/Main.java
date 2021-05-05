package com.oj.luogu.ac.p1909;

import java.util.Scanner;

//p
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int arr[][] = new int[3][2];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = scanner.nextInt();
                }

            }
            int min = ((int) (Math.ceil(((double) n / (double) arr[0][0]))) * arr[0][1]);
            int tmp = min;
            for (int i = 1; i < arr.length; i++) {
                min = Math.min(((int) (Math.ceil(((double) n / (double) arr[i][0]))) * arr[i][1]), tmp);
                tmp = min;
            }
            System.out.println(min);


        }

    }

}
