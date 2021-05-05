package com.oj.acwing.ac.p788;


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

//
public class Main {
    static final int N = 100010;
    static int q[] = new int[N], tmp[] = new int[N], n;

    static long merge_sort(int q[], int l, int r) {
        if (l >= r) return 0;
        int mid = l + r >> 1;
        long res = merge_sort(q, l, mid) + merge_sort(q, mid + 1, r);
        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) {
                tmp[k++] = q[i++];
            } else {
                tmp[k++] = q[j++];
                res += mid - i + 1;
            }
        }
        while (i <= mid) tmp[k++] = q[i++];
        while (j <= r) tmp[k++] = q[j++];
        for (i = l, j = 0; i <= r; i++, j++) q[i] = tmp[j];
        return res;
    }

    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        n = Reader.nextInt();
        for (int i = 0; i < n; i++) q[i] = Reader.nextInt();
        System.out.println(merge_sort(q, 0, n - 1));
    }

}
