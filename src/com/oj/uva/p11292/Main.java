package com.oj.uva.p11292;

import java.util.Scanner;

public class Main {
    static void quick_sort(int q[], int l, int r) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n == 0 && m == 0) break;
            int[] n_arr = new int[n];
            int[] m_arr = new int[m];
            for (int i = 0; i < n; i++) {
                n_arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++) {
                m_arr[i] = scanner.nextInt();
            }
            quick_sort(n_arr, 0, n - 1);
            quick_sort(m_arr, 0, m - 1);
            int i = 0, j = 0;
            while (n_arr[i] < m_arr[j]) {
                j++;
            }
            int res = (m_arr.length - j) - (n_arr.length - i);
            int sum = 0;
            if (res >= 0 && m >= n) {

                for (int k = j; k < m - n + 1; k++) {
                    sum += m_arr[k];
                }
                System.out.println(sum);
            } else {
                System.out.println("Loowater is doomed!");
            }

        }
    }
}
