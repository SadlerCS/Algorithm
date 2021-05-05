package com.oj.acwing.ac.p786;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) tokenizer = new StringTokenizer(reader.readLine());
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {return Integer.parseInt(next());}

}

//
public class Main {
    static int q[] = new int[100010];
    static int k, n;

    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        n = Reader.nextInt();
        k = Reader.nextInt();
        for (int i = 0; i < n; i++) {
            q[i] = Reader.nextInt();
        }
        quick_sort(q, 0, n - 1);
        System.out.println(q[k - 1]);
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
