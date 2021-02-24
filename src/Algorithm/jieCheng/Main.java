package Algorithm.jieCheng;


import java.math.BigInteger;
import java.util.Scanner;

//大整数求阶乘
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            //String s = f(n).toString();
            //System.out.println(s.length());
            System.out.println(f(n));
        }
    }

    public static BigInteger f(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        } else {
            return f(n - 1).multiply(BigInteger.valueOf(n));
        }
    }
}
