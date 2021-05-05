package com.oj.hdoj.ac.hdu2015;

import java.util.ArrayList;
import java.util.Scanner;

//hdu2015
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
//            存储输出平均值
            ArrayList list = new ArrayList();

//            n<m的情况
            if (n < m) {
//                用的sn通项公式(sn=n*n+n),a1为2,d为2
                double sum = (n * n + n) / n;
                System.out.println(sum);
            }

//            num[]存储2起始的数列,可以用int,我为了防止错误用的double,结果发现想太多
            double num[] = new double[n];
//            sum用来做累加
            double sum = 0;
//            count用来做记数
            int count = 0;

            for (int i = 0; i < n; i++) {

                num[i] = (i + 1) * 2;
//                累加值到sum
                sum += num[i];
//                记数
                count++;
//                当count==m ,存sum/m 进list里
                if (count == m) {
//                    list添加平均值即可
                    list.add(sum / m);
//                    存储完之后需要清空sum,count,进行下一次的累加和记数
                    sum = 0;
                    count = 0;
                }
            }

//            要是有 n%m != 0,只需添加 sum/count到list即可
            if (n % m != 0) {
                list.add(sum / count);
            }

//            输出list
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.printf("%.0f ", list.get(i));
            }
            System.out.printf("%.0f", list.get(list.size() - 1));
            System.out.println();


        }
    }
}
