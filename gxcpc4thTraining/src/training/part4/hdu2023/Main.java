package training.part4.hdu2023;

import java.util.Scanner;

//hdu2023
//                    注意不能为了方便用 除m的方式+到对应位置,会错误答案,这题真坑,得老老实实加完成绩之后算平均分,而不是算arr[][]/m的形式加进去
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            double arr[][] = new double[n + 1][m + 1];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scanner.nextDouble();
//                    第i行的最后一列存储学生平均成绩
                    arr[i][m] += arr[i][j];
//                    arr[i][m] += arr[i][j] / m;
//                    第j列的最后一行存储课程平均成绩
                    arr[n][j] += arr[i][j];
//                    arr[n][j] += arr[i][j] / n;

//                    注意不能为了方便用 除m的方式+到对应位置,会错误答案,这题真坑
                }
            }


            for (int i = 0; i < n; i++) {
                arr[i][m] /= m;
                if (i != n - 1) {
                    System.out.printf("%.2f ", arr[i][m]);
                } else {
                    System.out.printf("%.2f", arr[i][m]);
                    System.out.println();
                }
            }

            for (int j = 0; j < m; j++) {
                arr[n][j] /= n;
                if (j != m - 1) {
                    System.out.printf("%.2f ", arr[n][j]);
                } else {
                    System.out.printf("%.2f", arr[n][j]);
                    System.out.println();
                }
            }

//            for (int i = 0; i < n - 1; i++) {
//                System.out.printf("%.2f ", arr[i][m]);
//            }
//            System.out.printf("%.2f", arr[n - 1][m]);
//            System.out.println();
//
//            for (int j = 0; j < m - 1; j++) {
//                System.out.printf("%.2f ", arr[n][j]);
//            }
//            System.out.printf("%.2f", arr[n][m - 1]);
//            System.out.println();

            for (int i = 0; i < n; i++) {
                int count = m;
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] < arr[n][j]) {
                        break;
                    }
                    count--;
                }
                if (count == 0) {
                    sum++;
                }
            }
            System.out.println(sum);
            System.out.println();

        }
    }
}
