package com.xcpc.training.homework0202;

public class Example05 {
    public static void main(String[] args) {
//        声明一个字符串
        String s1 = "Starter";
        String s2 = "St";
        System.out.println("判断是否以字符串 St 开头: " + s1.startsWith("St"));
        System.out.println("判断是否以字符串 er 结尾: " + s1.endsWith("er"));
        System.out.println("判断是否包含字符串 ar :" + s1.contains("ar"));
        System.out.println("判断字符串是否为空: " + s1.isEmpty());
        System.out.println("判断两个字符串是否相等: " + s1.equals(s2));

    }
}
