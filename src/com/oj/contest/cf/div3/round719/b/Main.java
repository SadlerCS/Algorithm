package com.oj.contest.cf.div3.round719.b;

import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;


public class Main {
    static int numBit(int n, int bit) {
        return n / (int) (Math.pow(n, (bit - 1))) % 10;
    }

    //把解决方案放这里
    public static void solveCom() {
        FastReader sc = new FastReader();
        int n = sc.nextInt();

    } // solve fn ends

    public static void solveSub() {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            int len = n.length();
            if (len == 1) {
                System.out.println(n);
                continue;
            }
            int res = (len - 1) * 9;
            int idx = numBit(Integer.parseInt(n), len);
            res += idx - 1;
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < len; i++) s.append("1");
            int count = idx * Integer.parseInt(s.toString());
            if (Integer.parseInt(n) >= count) res += 1;
            System.out.println(res);
        }


    } // solve fn ends


    public static void solveScan() {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {

        }

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