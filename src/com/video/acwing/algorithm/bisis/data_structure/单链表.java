package com.video.acwing.algorithm.bisis.data_structure;

import java.math.BigDecimal;
import java.util.Scanner;

//数组模拟链表
public class 单链表 {
    static final int N = 100010;

    //head 表示头结点的下标
    //e[i] 表示结点i的值
    //ne[i] 表示结点i的next指针是多少
    //idx 存储当前已经用到了哪个点

    static int head, e[] = new int[N], ne[] = new int[N], idx;

    //初始化
    static void init() {
        head = -1;
        idx = 0;
    }


    //将x插到头结点
    static void add_to_head(int x) {
        e[idx] = x;
        ne[idx] = head;
        head = idx;
        idx++;
    }

    //将x插到下标是k的点后面
    static void add(int k, int x) {
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx;
        idx++;
    }

    //将下标是k的点后面的点删掉
    static void remove(int k) {
        ne[k] = ne[ne[k]];
    }

    //循环链表
    static void printArr(int e[]) {
        for (int i = head; i != 1; i = ne[i]) {
            System.out.print(e[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        init();
        int m = scanner.nextInt();
        while (m-- > 0) {
            char c = scanner.next().charAt(0);
            int x, k;
            if (c == 'H') {//添加头结点
                x = scanner.nextInt();
                add_to_head(x);
            } else if (c == 'D') {//删除第k个
                k = scanner.nextInt();
                if (k == 0) head = ne[head];
                else remove(k - 1);
            } else {//在第k个的下一个添加x
                k = scanner.nextInt();
                x = scanner.nextInt();
                add(k - 1, x);
            }

        }
        printArr(e);

    }

}
