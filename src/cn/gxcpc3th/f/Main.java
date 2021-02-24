package cn.gxcpc3th.f;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            while (x < 1) {
                x++;
            }
            while (x > 100) {
                x--;
            }

            while (x % 7 == 0) {
                x++;
            }
            while (x / 10 == 7) {
                x++;
            }
            int y = x + 1;
            while (y % 7 == 0) {
                y++;
            }
            while (y / 10 == 7) {
                y++;
            }

            System.out.println(y);
        }
    }
}
