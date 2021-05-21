package com.video.acwing.algorithm.bisis.data_structure;

public class 双链表 {
    static final int N = 100010;
    static int m;
    static int e[] = new int[N], l[] = new int[N], r[] = new int[N], idx;

    static int numBit(int num, int bit) {
        return num / (int) Math.pow(10, bit - 1) % 10;
    }

    static void init() {
        //0表示左端点,1表示右端点
        r[0] = 1;
        l[1] = 0;
        idx = 2;
    }

    //在下标是k的点的右边,插入x
    static void add_right(int k, int x) {
        e[idx] = x;
        r[idx] = r[k];
        l[idx] = k;
        l[r[k]] = idx;
        r[k] = idx;
    }

    //在下标是k的点的左边,插入x
    static void add_left(int k, int x) {
        add_right(l[k], x);
    }

    //删除第k个点
    static void remove(int k) {
        r[l[k]] = r[k];
        l[r[k]] = l[k];
    }

}
