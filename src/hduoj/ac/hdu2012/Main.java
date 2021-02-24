package hduoj.ac.hdu2012;

import java.util.Scanner;

//hdu2012
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            boolean flag = true;
            for (int i = x; i <= y; i++) {
                int res = i * i + i + 41;
//                判断不是质数
                if (!isPrime(res)) {
                    System.out.println("Sorry");
                    flag = false;
                    break;
                }
            }
//            如果flag=true,说明有偶数
            if (flag) {
                System.out.println("OK");
            }
        }
    }


    /**
     * 判断是否为素数/质数的最有效方法
     * 1.小于5的2和3
     * 2.大于等于5的素数一定和6的倍数相邻，例如5和7，11和13,17和19等等。
     *
     * @param num
     * @return
     */
    public static boolean isPrime(int num) {
        //两个较小数另外处理
        if (num == 2 || num == 3) {
            return true;
        }

        //不在6的倍数两侧的一定不是素数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }

        int tmp = (int) Math.sqrt(num);//获取平方根
        //在6的倍数两侧的也可能不是素数
        for (int i = 5; i <= tmp; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
