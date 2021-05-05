package com.xcpc.training.homework0202;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        输入数组
        String str = scanner.next();
        char charArray[] = str.toCharArray();
        System.out.print("将字符串转为字符数组的遍历结果:");

        for (int i = 0; i < charArray.length; i++) {
            if (i != charArray.length - 1) {
//                如果不是数组的最后一个元素,在元素后面加逗号
                System.out.print(charArray[i] + ",");
            } else {
//                数组的最后一个元素后面不加逗号
                System.out.println(charArray[i]);
            }
        }

        System.out.println("将int值转换为String类型之后的结果:" + String.valueOf(12));
        System.out.println("将字符串转换为大写之后的结果: " + str.toUpperCase());

    }
}
