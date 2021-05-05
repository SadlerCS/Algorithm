package com.xcpc.training.homework0202;

public class Example06 {
    public static void main(String[] args) {
        String str = "2021-2-2";
//        下面是字符串截取操作
        System.out.println("从第6个字符截取到末尾的结果: " + str.substring(5));
        System.out.println("从第6个字符截取到第7个字符的结果" + str.substring(5, 7));

//        下面是字符串分割操作
        System.out.println("分割后的字符串数组中的元素依次为:");
//        通过横线连接符"-"将字符串转换为字符串数组
        String strArray[] = str.split("-");
//        循环输出数组中的元素
        for (int i = 0; i < strArray.length - 1; i++) {
            System.out.println(strArray[i] + "、");
        }
        System.out.println(strArray[strArray.length - 1]);

    }
}
