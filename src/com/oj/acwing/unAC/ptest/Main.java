package com.oj.acwing.unAC.ptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;

//
public class Main {


    public static void main(String[] args) throws IOException {
        sc.init(System.in);
        String s = sc.nextLine();
        char str[] = s.toCharArray();
        int n = str.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && str[j] != ' ') j++;
            // 这道题的具体逻辑
            for (int k = i; k < j; k++) System.out.print(str[k]);
            if (i != j) System.out.println();
            i = j;
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

    static String nextLine() throws IOException {return reader.readLine();}

    static int nextInt() throws IOException {return Integer.parseInt(next());}

    static double nextDouble() throws IOException {return Double.parseDouble(next());}

    static long nextLong() throws IOException {return Long.parseLong(next());}

    static boolean nextBoolean() throws IOException {return Boolean.parseBoolean(next());}

    static BigInteger nextBigInteger() throws IOException {return new BigInteger(next());}

    static BigDecimal nextBigDecimal() throws IOException {return new BigDecimal(next());}
}