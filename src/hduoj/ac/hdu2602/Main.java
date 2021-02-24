package hduoj.ac.hdu2602;

import java.util.Scanner;

/*
 *1
 * 5 10
 * 5 4 6 1 2//物品价值
 * 0 2 4 0 0//物品体积
 * 18
 *
 *
 * */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int n = input.nextInt();//物品个数
            int v = input.nextInt();//背包体积
            int[] valN = new int[n + 1];//物品价值
            int[] volN = new int[n + 1];//物品体积
            for (int i = 1; i < valN.length; i++) {
                valN[i] = input.nextInt();
            }
            for (int i = 1; i < volN.length; i++) {
                volN[i] = input.nextInt();
            }

            int[][] dp = new int[n + 1][v + 1];
            for (int j = 1; j <= v; j++) {
                if (j >= volN[1]) {
                    dp[0][j - 1] = valN[1];
                }
            }
            for (int i = 1; i < dp.length; i++) {
                for (int j = 0; j < dp[i].length; j++) {
                    //列数与当前物品体积比较
                    if (j >= volN[i]) {//小于
                        dp[i][j] = Math.max(dp[i - 1][j], valN[i] + dp[i - 1][j - volN[i]]);
                    } else {
                        dp[i][j] = dp[i - 1][j];

                    }
                }
            }
//             遍历数组
//            for (int i = 0; i < dp.length; i++) {
//                for (int j = 0; j < dp[i].length; j++) {
//                    System.out.print(dp[i][j] + " ");
//                }
//                System.out.println();
//
//            }
            System.out.println(dp[n][v]);

        }
    }
}
