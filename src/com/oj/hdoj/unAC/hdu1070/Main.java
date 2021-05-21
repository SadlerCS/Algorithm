package com.oj.hdoj.unAC.hdu1070;


import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;


public class Main {
    static final int N = 110;
    static String s[] = new String[N];
    static int a[][] = new int[N][5];

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
            int min = Integer.MAX_VALUE, idx = 0, vol = 0;
            for (int i = 0; i < n; i++) {
                s[i] = sc.next();
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
                if (a[i][1] >= 200) {
                    //5天需要买多少瓶
                    if (a[i][1] / 200 >= 5) {
                        a[i][2] = 1;
                    } else {
                        int count = a[i][1] / 200;
                        a[i][2] = (int) Math.ceil(5.0 / (double) count);
                    }
                    a[i][3] = a[i][2] * a[i][0];//5天需要的价格
                    a[i][4] = a[i][2] * a[i][1];//总共的毫升
                    if (a[i][3] < min) {
                        min = a[i][3];
//                        vol = a[i][4];
                        vol = a[i][1];
                        idx = i;
                    } else if (a[i][3] == min) {
                        if (vol < a[i][4]) {
                            min = a[i][3];
//                            vol=a[i][4];
                            vol = a[i][1];
                            idx = i;
                        }
                    }
                }
            }
            System.out.println(s[idx]);


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

class item {
    String name;
    int pri;
    int vol;
    double avg;
}