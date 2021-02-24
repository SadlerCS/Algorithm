package hduoj.ac.hdu1003;

import java.util.Scanner;

//1003
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        int count = 1;
        while (line-- > 0) {// 2行
            int col = input.nextInt();
            int colStart = 1;
            int colStartTemp = 1;
            int colEnd = 1;
            int maxSum = -1001;
            int sum = 0;

            int[] arr = new int[col];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
                sum += arr[i];

                // 当前sum合计大于最大值,sum赋值给maxSum
                if (sum > maxSum) {
                    maxSum = sum;
                    colEnd = i + 1;// ,结束列更新到当前位置
                    colStart = colStartTemp;// 临时开始列赋值给开始列
                }
                // 当前sum相加<0,则start在下一位置开始算
                if (sum < 0) {
                    sum = 0;
                    colStartTemp = i + 2;// 当前位置
                }

            }
            System.out.println("Case " + count++ + ":");
            System.out.println(maxSum + " " + colStart + " " + colEnd);
            if (line > 0) {
                System.out.println();
            }
        }
    }

}

