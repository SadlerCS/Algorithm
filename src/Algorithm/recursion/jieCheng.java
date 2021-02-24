package Algorithm.recursion;

import java.util.Scanner;

//阶乘
public class jieCheng {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            System.out.println(f(n));
        }
    }

    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 1) * n;
        }
    }
}
