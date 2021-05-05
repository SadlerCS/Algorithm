package com.xcpc.training.homework0203;

import java.util.Arrays;

public class Example28 {
    public static void main(String[] args) {
        int arr[] = {9, 8, 3, 5, 2};
//        对数组进行排序
        Arrays.sort(arr);
//        查找指定元素3
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("元素3的索引是: " + index);
    }
}
