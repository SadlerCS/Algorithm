package com.oj.acwing.unAC.p799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

//
public class Main {
    static final int N = 100010;
    static int n, a[] = new int[N], s[] = new int[N];


    public static void main(String[] args) throws IOException {
        sc.init(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int res = 0;
        for (int i = 0, j = 0; i < n; i++) {
            s[a[i]]++;
            while (s[a[i]] > 1) {
                s[a[j]]--;
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        System.out.println(res);
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

    static String nextLine() throws IOException {return reader.readLine();}

    static double nextDouble() throws IOException {return Double.parseDouble(next());}

    static long nextLong() throws IOException {return Long.parseLong(next());}

    static boolean nextBoolean() throws IOException {return Boolean.parseBoolean(next());}

    static BigInteger nextBigInteger() throws IOException {return new BigInteger(next());}

    static BigDecimal nextBigDecimal() throws IOException {return new BigDecimal(next());}
}