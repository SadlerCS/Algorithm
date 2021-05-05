package com.xcpc.training.homework0203;

import java.util.ArrayList;

public class Example24 {
    public static void main(String[] args) {
//        创建 ArrayList 集合, 使用泛型
        ArrayList<String> list = new ArrayList<String>();
//        添加字符串对象
        list.add("String");
        list.add("Collection");
//        遍历集合,可以直接指定颜色类型
        for (String str : list
        ) {
            System.out.println(str);
        }
    }
}
