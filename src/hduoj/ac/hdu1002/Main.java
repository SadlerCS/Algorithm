package hduoj.ac.hdu1002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int plus = 0;
        int[] arr = new int[2 * n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 1; i <= arr.length / 2; i++) {
            System.out.printf("case %d : \n", i);
            System.out.println(arr[plus] + " + " + arr[plus + 1] + " = " + (arr[plus] + arr[plus + 1]));
            plus += 2;
        }
    }
}
