package training.part3.hdu1170;

import java.util.Scanner;

/*
 * 1170,AC
 * 注意除法除数不等于0,输出格式,换行
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        char c[] = new char[]{'+', '-', '*', '/'};
        while (t-- > 0) {
            char op = scanner.next().charAt(0);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (op == c[0]) {
                System.out.println(a + b);
            } else if (op == c[1]) {
                System.out.println(a - b);
            } else if (op == c[2]) {
                System.out.println(a * b);
            } else if (op == c[3]) {
                if (b == 0) {
                    break;
                } else if (a % b == 0) {
                    System.out.println(a / b);
                } else {
//                    souf要么\n\n换行,要么在下面写个sout,不然会展示错误
                    System.out.printf("%.2f", (double) a / (double) b);
                    System.out.println();
                }
            }
        }
    }
}
