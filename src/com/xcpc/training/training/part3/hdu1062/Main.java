package com.xcpc.training.training.part3.hdu1062;

import java.util.Scanner;

//hdu1062,AC
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            StringBuilder res = new StringBuilder();
            StringBuilder temp = new StringBuilder();
            int j = 0;
            for (int i = 0; i < s.length(); i = j) {
                temp.setLength(0);
//                遍历遇到空格前的字符串
                for (j = i; j < s.length(); j++) {
//                    遇到空格,跳出内层for,同时j自增,将空格插入单词的第一个字符前
                    if (s.charAt(j) == ' ') {
                        temp.insert(0, " ");
                        j++;
                        break;
                    }
//                    记录已经经过遍历的单词字符串
                    temp.append(s.charAt(j));
                }
//                将变量过的单词字符串进行翻转,并保存在 res 变量里面,等待输出
                res.append(temp.reverse());

            }
            System.out.println(res);
        }
        scanner.close();
    }
}
