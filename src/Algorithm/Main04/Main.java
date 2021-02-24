package Algorithm.Main04;
/*
 * n*n
 * 的星星
 *
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kt = new Scanner(System.in);
        System.out.print("请输入n的值:");
        int n = kt.nextInt();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
