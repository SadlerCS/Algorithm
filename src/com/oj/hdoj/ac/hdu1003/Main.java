package com.oj.hdoj.ac.hdu1003;

import java.util.Scanner;
/*测试案例：
4 0 0 2 0 —— 2 1 3
6 2 7 -9 5 4 3 —— 12 1 6
4 0 0 -1 0 —— 0 1 1
7 -1 -2 -3 -2 -5 -1 -2 —— -1 1 1
6 -1 -2 -3 1 2 3 —— 6 4 6
*
*
*1003,AC
* */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            int sum = 0;//定义累加值为0
            int[] cunChu = {-1001, 0, 0};//把最大连续子序和与其起始位置与末尾位置放在一起
            int startNext = 1;//因为起始位置是一直变化的，所以需要放入一个临时值
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = input.nextInt();
            }

            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];//累加
                if (sum > cunChu[0]) {//累加值与子序和值比较
                    cunChu[0] = sum;//大于则赋值给它
                    cunChu[1] = startNext;//考虑到起始值是动态的，需要用一个临时值来储存，要用
                    cunChu[2] = j + 1;//为当前值
                }

                if (sum < 0) {//累加值小于0
                    sum = 0;//说明不符合条件，需要与下一个开始重新计算
                    startNext = j + 2;//因为累加值小于0，startNext需要变化为下一个值才行
                }
            }

            System.out.println("Case " + i + ":");
            System.out.println(cunChu[0] + " " + cunChu[1] + " " + cunChu[2]);
            if (t != i) {
                System.out.println();
            }


        }


    }
}
