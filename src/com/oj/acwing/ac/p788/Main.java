package com.oj.acwing.ac.p788;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main {
    static final int N = 100010;
    static int n, q[] = new int[N], tmp[] = new int[N];

    static long merge_sort(int q[], int l, int r) {
        if (l >= r) return 0;
        int mid = l + r >> 1;
        long res = merge_sort(q, l, mid) + merge_sort(q, mid + 1, r);
        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) tmp[k++] = q[i++];
            else {
                tmp[k++] = q[j++];
                res += mid - i + 1;
            }
        }
        while (i <= mid) tmp[k++] = q[i++];
        while (j <= r) tmp[k++] = q[j++];
        for (i = l, j = 0; i <= r; i++, j++) q[i] = tmp[j];
        return res;
    }

    //把解决方案放这里
    public static void solve() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) q[i] = sc.nextInt();
        System.out.println(merge_sort(q, 0, n - 1));
    } // solve fn ends


    public static void main(String[] args) throws Exception {
        //调用solve方法,好处是有多个题解可以写n个solve方法
        solve();

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
