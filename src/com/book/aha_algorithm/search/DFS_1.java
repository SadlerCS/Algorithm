package com.book.aha_algorithm.search;

public class DFS_1 {
    static final int N = 10;
    static int a[] = new int[N], book[] = new int[N], total = 0;

    //step 表示现在站在第几个盒子里面
    static void dfs(int step) {
        if (step == 10) {
            if ((a[1] * 100 + a[2] * 10 + a[3]) + (a[4] * 100 + a[5] * 10 + a[6]) == (a[7] * 100 + a[8] * 10 + a[9])) {
                total++;
                System.out.printf("%d%d%d+%d%d%d=%d%d%d", a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8], a[9]);
                System.out.println();
            }
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if (book[i] == 0) {
                a[step] = i;
                book[i] = 1;
                dfs(step + 1);
                book[i] = 0;
            }
        }
        return;
    }

    public static void main(String[] args) {
        dfs(1);
        System.out.println("total=" + total / 2);
    }

}
