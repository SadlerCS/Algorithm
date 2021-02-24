package luogu.p1009;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * p1009 阶乘,用大数
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger p = BigInteger.ONE;//p赋值常量1
        BigInteger res[] = new BigInteger[50];
//        BigInteger res = BigInteger.ONE;//p赋值常量1

        for (int i = 2; i <= n; i++) {
            p = p.multiply(BigInteger.valueOf(i));//p = p * i //累乘

        }
        System.out.println(p);
        System.out.println(res);

    }


}
