package cn.gxcpc3th.f;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = 0;

            if (x < 0 || x % 7 == 0 || x / 10 == 7 || x % 10 == 7) {
                break;
            }
            y = ++x;
            for (; ; ) {
                if (y % 7 == 0 || y / 10 == 7 || y % 10 == 7) {
                    y++;
                } else {
                    break;
                }
            }


            while (y % 7 == 0 || y / 10 == 7 || y % 10 == 7) {
                y++;
            }
            System.out.println(y);
        }
    }
}
