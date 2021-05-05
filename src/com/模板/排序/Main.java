package com.模板.排序;//package com.模板.排序;


import java.util.Scanner;

public class Main {
    static final int N = 1000010;
    static int q[] = new int[N], tmp[] = new int[N];
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                q[i] = scanner.nextInt();
            }

            merge_sort(q, 0, n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println();
        }
    }

    //归并排序模板
    static void merge_sort(int[] q, int l, int r) {
        //判断当前区间只有一个数或者没有数的话,返回
        if (l >= r) return;
        //mid 整个区间的中点
        int mid = l + r >> 1;

        merge_sort(q, l, mid);//递归排序左边
        merge_sort(q, mid, r);//递归排序右边

        //这部分就是归并的过程,把两个有序的序列归并成一个有序的序列,然后结果放到tmp里面去
        //k为tmp数组下标,指针的话i指向左半边区间的一个起点, j 指向右半边的一个起点
        int k = 0, i = l, j = mid + 1;
        //循环 当我们指针i不超出左半边区间 且 指针j不超出 右半边区间 的时候
        while (i <= mid && j <= r) {
            //然后判断每次把小的那个值放到tmp[]里面,且那个指针往后移
            if (q[i] <= q[j]) tmp[k++] = q[i++];
            else tmp[k++] = q[j++];
        }
        //如果某一个指针超出当前区间的时候,把另一个指针后面的值全部放到tmp[]里面去
        while (i <= mid) tmp[k++] = q[i++];
        while (j <= r) tmp[k++] = q[j++];
        //最后把我们临时数组 tmp[] 的值存回我们原数组 q[] 中去
        for (i = l, j = 0; i <= r; i++, j++) q[i] = tmp[j];
    }


    //快排模板
    static void quick_sort(int q[], int l, int r) {
        if (l >= r) return;
        int x = q[l], i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            if (i < j) {
                int t = q[i];
                q[i] = q[j];
                q[j] = t;
            }
        }
        quick_sort(q, l, j);
        quick_sort(q, j + 1, r);
    }

    //快排 O(nlogn)
    static void quick_sort1(int q[], int l, int r) {
        //处理边界情况
        if (l >= r) return;
        //定义边界值x=q[l]或者q[r]或者q[q.length/2],i指针的边界情况,循环之前先往里移动一格后判断
        int x = q[l], i = l - 1, j = r + 1;
        //每次迭代算一次交换,这个循环是为了求出以 x分成两区间的数组
        while (i < j) {
            //找出i >=x 的数停下来,同理找出 j<=x 的数停下来
            do i++; while (q[i] < x);
            do j--; while (q[j] > x);
            //交换i,j指向的值
            if (i < j) {
                int t = q[i];
                q[i] = q[j];
                q[j] = t;
            }
        }
        quick_sort1(q, l, j);//左部分区间处理
        quick_sort1(q, j + 1, r);//右部分区间处理
    }


}
