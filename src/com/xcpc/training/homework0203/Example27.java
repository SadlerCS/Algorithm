package com.xcpc.training.homework0203;

import java.util.Arrays;

public class Example27 {
    public static void main(String[] args) {
        int arr[] = {9, 8, 3, 5, 2};
        System.out.print("排序前: ");
        printArray(arr);
//        调用Arrays的sort()方法排序
        Arrays.sort(arr);
        System.out.print("排序后: ");
        printArray(arr);
    }

    //    定义打印数组元素方法
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }
}
