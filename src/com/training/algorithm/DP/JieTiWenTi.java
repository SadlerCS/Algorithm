package com.training.algorithm.DP;

import java.util.Scanner;
/*
 * 一只青蛙一次可以跳一级台阶，也可以一次跳两级台阶，现在有 n 级台阶，问青蛙一共有多少种跳法？
 * 递归
 * */

public class JieTiWenTi {
    public static int jumpFloor(int target) {
        if (target <= 2) {
            return target;
        } else {
            int sum = jumpFloor(target - 1) + jumpFloor(target - 2);
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int target = input.nextInt();
            System.out.println(jumpFloor(target));
        }
    }
}


