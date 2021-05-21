package com.oj.acwing.ac.p786;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main {
    static final int N = 100010;
    static int q[] = new int[N], n, k;

    static int quick_sort(int q[], int l, int r, int k) {
        if (l >= r) return q[l];
        int x = q[l], i = l - 1, j = r + 1;
        while (i < j) {
            while (q[++i] < x) ;
            while (q[--j] > x) ;
            if (i < j) {
                int t = q[i];
                q[i] = q[j];
                q[j] = t;
            }
        }
        int sl = j - l + 1;
        if (k <= sl) return quick_sort(q, l, j, k);
        return quick_sort(q, j + 1, r, k - sl);
    }


    //把解决方案放这里
    public static void solve() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; i++) q[i] = sc.nextInt();
        System.out.println(quick_sort(q, 0, n - 1, k));


    } // solve fn ends

    public static void mul() {
        while (true) {
            solve();
        }
    }


    public static void main(String[] args) throws Exception {
        //调用solve方法,好处是有多个题解可以写n个solve方法
        mul();
//        solve();
    }

    //输出
    static PrintWriter out;

    //输入类
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        BigInteger nextBigInteger() {return new BigInteger(next());}

        BigDecimal nextBigDecimal() {return new BigDecimal(next());}

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
