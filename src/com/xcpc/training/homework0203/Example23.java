package com.xcpc.training.homework0203;

import java.util.ArrayList;

public class Example23 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//        添加字符串对象
        list.add("String");
        list.add("Collection");
//        添加Integer对象
        list.add(1);

//        不能转换要用泛型
        for (Object obj : list) {
//            强制转换成 String 类型
            String str = (String) obj;
            System.out.println(str);

        }
    }
}
