package Algorithm.Main05;
/*
 * 输入奇数n，打印菱形
 * 举例
 * 7
 *     *
 *    ***
 *   *****
 *  *******
 *   *****
 *    ***
 *     *
 *
 *
 *
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入n的值：");
        while (input.hasNext()) {
            int n = input.nextInt();

            for (int i = 0; i < (n + 1) / 2; i++) {//打印出上半部分的行数,为4行
                for (int k = 0; k < (n - 1) / 2 - i; k++) {//打印出空格数
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {//打印出星星数
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < (n - 1) / 2; i++) {//打印出下半部分行数，为3行

                for (int k = 0; k < i + 1; k++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < n - (i + 1) * 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}

