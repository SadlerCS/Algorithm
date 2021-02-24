package hduoj.ac.hdu2602;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt(), v = in.nextInt();
            int jiaZhi[] = new int[n];
            int tiJi[] = new int[n];
            for (int i = 0; i < n; i++) jiaZhi[i] = in.nextInt();
            for (int i = 0; i < n; i++) tiJi[i] = in.nextInt();
            int dp[][] = new int[n][v + 1];
            for (int j = 0; j <= v; j++) {//0-背包数
                if (j >= tiJi[0]) {
                    dp[0][j] = jiaZhi[0];
                }
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j <= v; j++) {
                    if (j >= tiJi[i])
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - tiJi[i]] + jiaZhi[i]);
                    else
                        dp[i][j] = dp[i - 1][j];
                }
            }
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[i].length; j++) {
                    System.out.print(dp[i][j]);
                }
                System.out.println();

            }
            System.out.println(dp[n - 1][v]);
        }
    }
}