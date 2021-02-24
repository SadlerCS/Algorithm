package luogu.cf1A;

import java.util.Scanner;

//cf1A
// n/a和m/a向上取整再相乘就行,注意10的9次方要有64位才行,输出格式得变
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n, m, a;
        n = scanner.nextInt();
        m = scanner.nextInt();
        a = scanner.nextInt();
        System.out.printf("%.0f", (Math.ceil(n / a) * Math.ceil(m / a)));
    }


}
