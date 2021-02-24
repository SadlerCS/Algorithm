package xasttt.C1.P4Test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        if (a > max) {
            max = a;
        } else if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
