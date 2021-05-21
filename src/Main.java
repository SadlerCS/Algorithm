import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;


public class Main {
    static final int N = 1000010;
    static int[] q = new int[N];  // 队列数组, 其中存放 arr的下标值
    static int[] arr = new int[N];
    static int hh = 0, tt = -1;  // tt指向栈顶元素

    //把解决方案放这里
    public static void solveCom() {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int a[] = {5, 4, 5, 3, 2, 1};
        TreeSet<Integer> st = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            st.add(a[i]);
        }
        System.out.println(st);

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
