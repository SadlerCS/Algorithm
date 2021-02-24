package Algorithm.Main07;
/*
 * 暴力匹配
 * 字符串
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kt = new Scanner(System.in);
        while (kt.hasNext()) {
            String str1 = kt.next();
            String str2 = kt.next();
            char[] s1 = str1.toCharArray();//str1字符串一个个存到字符中去，成数组
            char[] s2 = str2.toCharArray();

            int i = 0;//指向s1
            int j = 0;//指向s2
            int idx;//结果
            while (j < s2.length && i < s1.length) {
                if (s1[i] == s2[j]) {
                    i++;
                    j++;
                } else {
                    j = 0;
                    i = i - j + 1;
                }
            }
            if (j == s2.length) {
                idx = i - j;
            } else {
                idx = -1;
            }
            System.out.println(idx);
/*        for (int i=0;i<s1.length;i++){
            System.out.print(s1[i]);
        }*/
        }
    }
}
