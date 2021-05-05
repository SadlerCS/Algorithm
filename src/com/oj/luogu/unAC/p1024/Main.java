package com.oj.luogu.unAC.p1024;

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

//p
public class Main {
    static double a, b, c, d, eps = 1e-4;

    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int n = Reader.nextInt();
        System.out.println(n % 100000);
    }

}
