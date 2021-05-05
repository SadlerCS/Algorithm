package com.training.algorithm.violenceMatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kt = new Scanner(System.in);
        while (kt.hasNext()) {
            /*第一步定义字符创s1和s2*/
            String str1 = kt.next();
            String str2 = kt.next();

            /*第二步字符串转字符数组*/
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            /*第三步读出s1和s2的长度*/
            int s1len = s1.length;
            int s2len = s2.length;

            /*第四步定义下标i和j*/
            int i = 0;
            int j = 0;

            /*第五步：开始比较*/
            while (i < s1len && j < s2len) {/*在限定范围内才能运行*/
                if (s1[i] == s2[j]) {/*要是字符数组s1的第i个等于s2的第j个，则i++，j++*/
                    i++;
                    j++;
                } else {/*要是不等于，则j等于0；i=i-j+1*/
//                    这部是为了让j归位，以及i回溯到特定位置适合比较
                    i = i - j + 1;
                    j = 0;
                }
            }
            int index = i - 1;
            System.out.println(index);


        }

    }
}
