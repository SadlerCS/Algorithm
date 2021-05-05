package com.oj.hdoj.ac.hdu1106;

import java.util.Arrays;
import java.util.Scanner;

//hdu1106
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            String[] strings = s.split("5");
            Integer arr[] = new Integer[strings.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(strings[i]);
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[arr.length - 1]);
        }
    }
}
