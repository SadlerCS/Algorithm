package com.training.Main02;

import java.util.Scanner;

/*
 * 输入一个数字n，然后输入n个整数，打印出最大值
 * 比如：
 * 2
 * 1 5
 * 5
 *
 * */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);/*必须要的，定义变量in，在Scanner控制台里*/
        System.out.print("请输入n的值：");
        while (in.hasNext()) {
            int n = in.nextInt();//定义变量n，在变量in的下一个整数
            int max = 0;
            for (int i = 0; i < n; i++) {//可以输入n个数值在控制台
                int j = in.nextInt();
                if (i == 0) {
                    max = j;
                } else if (j > max) {
                    max = j;
                }
            }
            System.out.println("最大值是：" + max);//打印出变量n
        }
    }
}
