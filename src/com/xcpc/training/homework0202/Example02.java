package com.xcpc.training.homework0202;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        输入数组
        String s = scanner.next();

        System.out.println("字符串的长度为: " + s.length());
        System.out.println("字符串中的第一个字符: " + s.charAt(0));
        System.out.println("字符c第一次出现的位置: " + s.indexOf('c'));
        System.out.println("字符c最后一个出现的位置: " + s.lastIndexOf('c'));
        System.out.println("子字符串第一次出现的位置: " + s.indexOf("ab"));
        System.out.println("子字符串最后一次出现的位置:" + s.indexOf("ab"));


    }
}
