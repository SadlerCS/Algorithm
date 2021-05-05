package com.training.Main07;

import java.util.Scanner;

/*
 * 暴力匹配
 * 匹配字符串,匹配成功输出索引号,不成功输出-1
 * */
public class ViolenceMatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        System.out.println(voilenceMatch(str1, str2));
    }

    public static int voilenceMatch(String str1, String str2) {
        //字符串转字符数组
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        //读出字符数组的长度
        int s1len = s1.length;
        int s2len = s2.length;

        //数组下标
        int i = 0;
        int j = 0;

        while (i < s1len && j < s2len) {//小于其长度内可以一直循环
            //开始匹配
            if (s1[i] == s2[j]) {//如果匹配成功
                //则一起匹配下一个
                i++;
                j++;
            } else {//匹配失败
                //复位到i-j+1,且j=0
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == s2len) {//匹配成功
            //返回索引值
            return i - j;
        } else {//不成功
            //返回-1
            return -1;
        }

    }
}
