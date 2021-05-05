package com.oj.hdoj.ac.hdu1000;//package com.oj.hdoj.ac.hdu1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main2 {

    public static void main(String[] args) throws Exception {
        String str[], str2;
        int a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            //读取一行字符串
            str = br.readLine().split(" ");
            System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
//            str2 = br.readLine();
//            //将字符转化为整型
//            a = Integer.parseInt(str);
//            b = Integer.parseInt(str2);
//            System.out.println(a+b);
        }

    }
}




