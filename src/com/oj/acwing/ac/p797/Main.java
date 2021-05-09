package com.oj.acwing.ac.p797;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

//
public class Main {
    static void insert(int l, int r, int c) {
        b[l] += c;
        b[r + 1] -= c;
    }

    static final int N = 100010;
    static int n, m, a[] = new int[N], b[] = new int[N];

    public static void main(String[] args) throws IOException {
        sc.init(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
        for (int i = 1; i <= n; i++) insert(i, i, a[i]);
        while (m-- > 0) {
            int l, r, c;
            l = sc.nextInt();
            r = sc.nextInt();
            c = sc.nextInt();
            insert(l, r, c);
        }
        for (int i = 1; i <= n; i++) b[i] += b[i - 1];
        for (int i = 1; i <= n; i++) System.out.print(b[i] + " ");
        System.out.println();
    }

}

class sc {
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

    static double nextDouble() throws IOException {return Double.parseDouble(next());}

    static long nextLong() throws IOException {return Long.parseLong(next());}

    static boolean nextBoolean() throws IOException {return Boolean.parseBoolean(next());}

    static BigInteger nextBigInteger() throws IOException {return new BigInteger(next());}

    static BigDecimal nextBigDecimal() throws IOException {return new BigDecimal(next());}
}