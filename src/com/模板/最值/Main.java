package com.模板.最值;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxNum(new int[]{1, 52, 145, 12}));
    }

    //    最大值
    static int maxNum(int arr[]) {
        int max = arr[arr.length / 2];
        for (int i = 0; i < arr.length / 2; i++) {
            max = Math.max(max, Math.max(arr[i], arr[arr.length - i - 1]));
        }
        return max;
    }

    //    最小值
    static int minNum(int arr[]) {
        int min = arr[arr.length / 2];
        for (int i = 0; i < arr.length / 2; i++) {
            min = Math.min(min, Math.min(arr[i], arr[arr.length - i - 1]));
        }
        return min;
    }

}
