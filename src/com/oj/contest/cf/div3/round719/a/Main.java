package com.oj.contest.cf.div3.round719.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main {

    //把解决方案放这里
    public static void solveCom() {
        FastReader sc = new FastReader();
        int n = sc.nextInt();


    } // solve fn ends

    public static void solveSub() {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean flag = false;
            int j = 0, k = 0;
            for (int i = 0; i < n; i++) {
                for (k = i + 1; k < n; k++) {
                    if (s.charAt(i) != s.charAt(k)) {
                        j = k;
                        break;
                    }
                }
                if (k >= n) break;
                String str = s.substring(j);
                if (str.indexOf(s.charAt(i)) != -1 && i != j) {
                    flag = true;
                    break;
                }
                i = j;
            }

            if (flag) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }


    } // solve fn ends

    public static void solveTrue() {
        FastReader sc = new FastReader();
        while (true) {

        }


    } // solve fn ends

    public static void main(String[] args) throws Exception {
        //调用solve方法,好处是有多个题解可以写n个solve方法
//        solveCom();
        solveSub();
//        solveTrue();

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