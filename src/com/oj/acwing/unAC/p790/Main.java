package com.oj.acwing.unAC.p790;

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

    static double nextDouble() throws IOException {return Double.parseDouble(next());}
//    static long nextLong() throws IOException {return Long.parseLong(next());}
//    static boolean nextBoolean() throws IOException {return Boolean.parseBoolean(next());}
//    static BigInteger nextBigInteger() throws IOException {return new BigInteger(next());}
//    static BigDecimal nextBigDecimal() throws IOException {return new BigDecimal(next());}
}

public class Main {

    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        double n = Reader.nextDouble();


        double l = 0, r = n;
        if (r < 0) {
            double t = l;
            l = r;
            r = t;
        }
        if (n > -1 && n < 1)
            while (r - l > 1e-8) {
                double mid = (l + r) / 2;
                if (mid * mid * mid >= n) r = mid;
                else l = mid;
            }
        System.out.printf("%.6f", l);

    }
}
