package com.oj.acwing.ac.p785;

import java.util.Scanner;

//
public class Main {
    static int q[] = new int[100010], n;

    public static void main(String[] args) {
        if (n == 1) System.out.println("dfsgsxd");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                q[i] = scanner.nextInt();
            }
            quick_sort(q, 0, n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(q[i] + " ");
            }
        }

    }

    private static void quick_sort(int[] q, int l, int r) {
        if (l >= r) return;
        int x = q[l], i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) {
                int t = q[i];
                q[i] = q[j];
                q[j] = t;
            }
        }

        quick_sort(q, l, j);
        quick_sort(q, j + 1, r);
    }

}
