package com.video.acwing.algorithm.bisis.data_structure;

import java.util.Scanner;

@SuppressWarnings({"all"})
public class 单调栈 {
    static final int N = 100010;
    static int n, stk[] = new int[N], tt;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            tt = 0;//初始化栈顶
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                while (tt > 0 && stk[tt] >= x) tt--;//tt > 0 说明栈里一定有元素 stk[tt] >= x 说明栈顶元素大于等于 x 的数 , 就抛出
                if (tt > 0) System.out.print(stk[tt]);
                else System.out.print("-1 ");
                stk[++tt] = x;
            }
            System.out.println();
        }
    }
}
