package com.oj.hdoj.ac.hdu1009;

import java.util.Scanner;

//1009第二种
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double sum = 0;
            //猫粮个数
            double m = sc.nextDouble();
            //房间数组
            int n = sc.nextInt();
            if (m == -1 && n == -1) {
                break;
            }
            double[][] room = new double[n][2];
            //性价比数组
            double[][] costPerformance = new double[n][2];

            for (int i = 0; i < room.length; i++) {
                for (int j = 0; j < room[i].length; j++) {
                    room[i][j] = sc.nextDouble();
                }
                costPerformance[i][0] = (room[i][0] / room[i][1]);
                costPerformance[i][1] = i;

            }
            for (int i = 0; i < costPerformance.length - 1; i++) {
                for (int j = 0; j < costPerformance.length - 1 - i; j++) {
                    if (costPerformance[j][0] < costPerformance[j + 1][0]) {
                        double tem = costPerformance[j][0];
                        costPerformance[j][0] = costPerformance[j + 1][0];
                        costPerformance[j + 1][0] = tem;
                        double tem2 = costPerformance[j][1];
                        costPerformance[j][1] = costPerformance[j + 1][1];
                        costPerformance[j + 1][1] = tem2;
                    }
                }
            }

            for (int i = 0; i < costPerformance.length; i++) {
                if (m >= room[(int) costPerformance[i][1]][1]) {
                    m -= room[(int) costPerformance[i][1]][1];
                    sum += room[(int) costPerformance[i][1]][0];
                } else {
                    sum += m * costPerformance[i][0];
                    break;
                }
            }
            System.out.printf("%.3f", sum);
            System.out.println();


        }
    }
}

