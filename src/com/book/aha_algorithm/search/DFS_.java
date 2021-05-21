package com.book.aha_algorithm.search;

import java.util.Scanner;

public class DFS_ {
    static int a[] = new int[10], book[] = new int[10], n;

    static void dfs(int step) {
        int i;
        //如果站在第n+1个盒子面前,则表示前n个盒子已经放好扑克牌
        if (step == n + 1) {
            //输出一种排列 (1-n号盒子中的扑克牌编号)
            for (i = 1; i <= n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            //返回之前的一步(最近一次调用dfs函数的地方)
            return;
        }
        //此时站在第step个盒子面前,应放哪张牌呢?
        //按照1,2,3...n的顺序一一尝试
        for (i = 1; i <= n; i++) {
            //判断扑克牌i是否还在手上
            //book[i] == 0 说明i号扑克牌在手上
            if (book[i] == 0) {
                //开始尝试使用扑克牌i
                //将i号扑克牌放入到第step步个盒子中
                a[step] = i;
                //将book[i]设为1,表示i号扑克牌已经不再手上

                //第step个盒子已经放好扑克牌,接下来需要走到下一个盒子面前
                //这里通过函数的递归调用来实现(自己调用自己)
                dfs(step + 1);
                //这是非常重要的一步,一定要将刚才尝试的扑克牌收回,才能进行下一个尝试
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            dfs(1);
        }
    }
}
