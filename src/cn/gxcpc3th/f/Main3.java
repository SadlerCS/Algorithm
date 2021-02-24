package cn.gxcpc3th.f;

import java.util.Scanner;

//3th-GXCPC-F
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        int t = scanner.nextInt();
        while (t-- > 0) {
            x = scanner.nextInt();

//能被7整除，十位数出现7，个位数出现7，x<1,x>100
            if (x % 7 == 0 || x / 10 == 7 || x % 10 == 7 || x < 1 || x > 100) {
                break;
            }

            y = x;
//能被7整除，十位数出现7，个位数出现7，y＜＝x,y为负数
            while (y % 7 == 0 || y / 10 == 7 || y % 10 == 7 || y <= x || y <= 0) {
                y++;
            }
            System.out.println(y);

        }
    }
}
