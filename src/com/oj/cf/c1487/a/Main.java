package com.oj.cf.c1487.a;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {


    //把解决方案放这里
    public static void solveCom() {
        FastReader sc = new FastReader();
        int n = sc.nextInt();


        out.flush();
    } // solve fn ends

    public static void solveSub() {
        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] f = new int[200];
            int[] a = new int[n];
            ArrayList<Integer> e = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                f[a[i]]++;
                if (f[a[i]] == 1) {
                    e.add(a[i]);
                }
            }
            Collections.sort(e);
            if (e.size() == 1) {
                System.out.println(0);
            } else {
                int g = e.size();
                long sum = 0;
                for (int i = g - 1; i >= 1; i--) {
                    sum += f[e.get(i)];
                }
                System.out.println(sum);
            }


        }

        out.flush();
    } // solve fn ends


    public static void solveScan() {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {

        }


        out.flush();
    }

    public static void main(String[] args) throws Exception {
        //调用solve方法,好处是有多个题解可以写n个solve方法
//        solveCom();
        solveSub();
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

