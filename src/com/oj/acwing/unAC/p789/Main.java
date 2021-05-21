package com.oj.acwing.unAC.p789;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    static final int N = 100010;
    static int q[] = new int[N];


    //把解决方案放这里
    public static void solveCom() {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) q[i] = sc.nextInt();
        while (m-- > 0) {
            int x = sc.nextInt();
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r + 1 >> 1;
                if (q[mid] <= x) l = mid;
                else r = mid - 1;
            }
            if (q[l] != x) {
                System.out.println("-1 -1");
                continue;
            }
            System.out.print(l + " ");
            l = 0;
            r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (x <= q[mid]) r = mid;
                else l = mid + 1;
            }
            System.out.println(l);
        }


    } // solve fn ends

    public static void solveSub() {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {

        }


    } // solve fn ends


    public static void solveScan() {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {

        }

    }

    public static void main(String[] args) throws Exception {
        //调用solve方法,好处是有多个题解可以写n个solve方法
        solveCom();
//        solveSub();
//        solveScan();

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