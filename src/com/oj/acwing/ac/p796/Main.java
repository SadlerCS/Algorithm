package com.oj.acwing.ac.p796;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

//
public class Main {
    static final int N = 1010;
    static int n, m, q, a[][] = new int[N][N], s[][] = new int[N][N];

    public static void main(String[] args) throws IOException {
        sc.init(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) a[i][j] = sc.nextInt();
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++) s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i][j];
        while (q-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println(s[x2][y2] - s[x1 - 1][y2] - s[x2][y1 - 1] + s[x1 - 1][y1 - 1]);
        }


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