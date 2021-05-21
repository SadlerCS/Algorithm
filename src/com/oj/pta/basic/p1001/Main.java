package com.oj.pta.basic.p1001;

import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;


public class Main {


    //把解决方案放这里
    public static void solveCom() {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int cnt = 0;
        while (n != 1) {
            if (n % 2 == 0) n >>= 1;
            else n = (3 * n + 1) >> 1;
            cnt++;
        }
        out.println(cnt);


        out.flush();
    } // solve fn ends

    public static void solveSub() {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {

        }

        out.flush();
    } // solve fn ends


    public static void solveScan() {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int cnt = 0;
            while (n != 1) {
                if (n % 2 == 0) n >>= 1;
                else n = (3 * n + 1) >> 1;
                cnt++;
            }
            System.out.println(cnt);

        }


        out.flush();
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
