package com.oj.hdoj.ac.hdu2072;

import java.util.Scanner;

//hdu2072
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (s.equals("#")) {
                break;
            }
            int count = 0;
            int sum = 0;
            String arr[] = s.split(" ");
            for (int i = 0; i < arr.length; i++) {
                count = 0;
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j].equals(arr[j + 1])) {
                        count++;
                    }
                }
                if (count == arr.length - 1) {
                    sum++;
                }
            }

            System.out.println(sum);

        }
    }

}
