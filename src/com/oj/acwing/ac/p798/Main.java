package com.oj.acwing.ac.p798;

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
    static int n, m, q, a[][] = new int[N][N], b[][] = new int[N][N];

    static void insert(int x1, int y1, int x2, int y2, int c) {
        b[x1][y1] += c;
        b[x2 + 1][y1] -= c;
        b[x1][y2 + 1] -= c;
        b[x2 + 1][y2 + 1] += c;
    }

    public static void main(String[] args) throws IOException {
        sc.init(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) a[i][j] = sc.nextInt();
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) insert(i, j, i, j, a[i][j]);

        while (q-- > 0) {
            int x1, y1, x2, y2, c;
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            c = sc.nextInt();
            insert(x1, y1, x2, y2, c);
        }
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++) b[i][j] += b[i - 1][j] + b[i][j - 1] - b[i - 1][j - 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
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