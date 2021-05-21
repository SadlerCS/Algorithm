package com.book.aha_algorithm.search;

import java.util.Scanner;

//迷宫搜索
public class DFS_2 {
    static final int N = 51;
    static int a[][] = new int[N][N], book[][] = new int[N][N];
    static int p, q, n, m, min = 999999999;
    static int next[][] = {
            {0, 1},//右走
            {1, 0},//下走
            {0, -1},//左走
            {-1, 0}//上走
    };

    static void dfs(int x, int y, int step) {
        int next[][] = {
                {0, 1},//右走
                {1, 0},//下走
                {0, -1},//左走
                {-1, 0}//上走
        };
        int tx, ty, k;
        //判断是否达到了小哈的位置
        if (x == p && y == q) {
            //更新最小值
            if (step < min) {
                min = step;
            }
            return;
        }

        for (k = 0; k < 4; k++) {
            //计算下一个点的位置
            tx = x + next[k][0];
            ty = y + next[k][1];
            //判断是否越界
            if (tx < 1 || tx > n || ty < 1 || ty > m) continue;
            //判断该点是否为障碍物或者已经在路径中
            if (a[tx][ty] == 0 && book[tx][ty] == 0) {
                book[tx][ty] = 1;//标记这个点已经走过
                dfs(tx, ty, step + 1);//开始尝试下一个点
                book[tx][ty] = 0;//尝试结束，取消这个点的标记
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, startx, starty;
        while (scanner.hasNext()) {
            //读入 n和m , n 为行 ,m为列
            n = scanner.nextInt();
            m = scanner.nextInt();
            //读入迷宫
            for (i = 1; i <= n; i++)
                for (j = 1; j <= m; j++)
                    a[i][j] = scanner.nextInt();

            //读入起点和终点坐标
            startx = scanner.nextInt();
            starty = scanner.nextInt();
            p = scanner.nextInt();
            q = scanner.nextInt();

            //从起点开始搜索
            book[startx][starty] = 1;//标记起点已经在路径中,防止后面重复走
            //第一个参数是起点的x坐标,第二个参数是起点的y坐标,第三个参数是初始步数为0
            dfs(startx, starty, 0);

            //输出最短步数
            System.out.println(min);
        }
    }
}
