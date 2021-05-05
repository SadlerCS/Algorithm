package com.模板.二分法;

public class 整数 {
    public static void main(String[] args) {

    }

    // 检查x是否满足某种性质
    static boolean check(int x) {
        return true;
        /* ... */
    }

    // 区间[l, r]被划分成[l, mid]和[mid + 1, r]时使用：
    static int bsearch_1(int l, int r) {
        while (l < r) {
            int mid = l + r >> 1;
            if (check(mid)) r = mid;    // check()判断mid是否满足性质
            else l = mid + 1;
        }
        return l;
    }

    // 区间[l, r]被划分成[l, mid - 1]和[mid, r]时使用：
    static int bsearch_2(int l, int r) {
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (check(mid)) l = mid;
            else r = mid - 1;
        }
        return l;
    }


}
