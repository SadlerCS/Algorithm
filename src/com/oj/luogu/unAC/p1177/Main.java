package com.oj.luogu.unAC.p1177;

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

//    static double nextDouble() throws IOException {return Double.parseDouble(next());}
//    static long nextLong() throws IOException {return Long.parseLong(next());}
//    static boolean nextBoolean() throws IOException {return Boolean.parseBoolean(next());}
//    static BigInteger nextBigInteger() throws IOException {return new BigInteger(next());}
//    static BigDecimal nextBigDecimal() throws IOException {return new BigDecimal(next());}
}

//p
public class Main {

    static final int N = 100000010;
    static int q[] = new int[N], tmp[] = new int[N], n;

    static void quick_sort(int q[], int l, int r) {
        if (l >= r) return;
        int x = q[(int) (Math.random() * (r - l + 1)) + l], i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) {
                int t = q[i];
                q[i] = q[j];
                q[i] = t;
            }
        }
        quick_sort(q, l, j);
        quick_sort(q, j + 1, r);
    }

    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        n = Reader.nextInt();
        for (int i = 0; i < n; i++) q[i] = Reader.nextInt();
        quick_sort(q, 0, n - 1);
        for (int i = 0; i < n; i++) System.out.print(q[i] + " ");
//        System.out.println(q[n - 1]);
    }

}
