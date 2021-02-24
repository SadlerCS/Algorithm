package training.part3.hdu2104;

import java.util.Scanner;

//hdu2104,判断互质,写个gcd算法判断一下是否互质,AC
/*
* 题目词不达意，每个句子都有语法错误。
连个基本意思都表达不清楚还写英文，完全不知道怎么想的。
题目本质就是问n个人一圈，按照m-1个间隔，能否遍历到每一个人。
* 比如 n=4(A,B,C,D),m=2
* 那么找的是A(2-1),然后隔一个框找的下一个就是C,以此类推就是A,C,A,C这是找不完的
*
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n == -1 && m == -1) {
                break;
            }
            if (isRelativelyPrime(n, m)) {
                System.out.println("YES");
            } else {
                System.out.println("POOR Haha");
            }

        }


    }

    //辗转相除法
    /*
    * 用欧几里德算法（辗转相除法）求两个数的最大公约数的步骤如下：
先用小的一个数除大的一个数，得第一个余数；
再用第一个余数除小的一个数，得第二个余数；
又用第二个余数除第一个余数，得第三个余数；
这样逐次用后一个数去除前一个余数，直到余数是0为止。那么，最后一个除数就是所求的最大公约数（如果最后的除数是1，那么原来的两个数是互质数）。 */
    public static boolean isRelativelyPrime(int num1, int num2) {
        int d1, d2, d3 = 1;
//        将小数放到d1中
        if (num1 <= num2) {
            d1 = num1;
            d2 = num2;

        } else {
            d1 = num2;
            d2 = num1;
        }

        while (d3 != 0) {
            d3 = d2 % d1;
            d2 = d1;
            d1 = d3;
        }
        if (d2 == 1) {
            return true;
        } else {
            return false;
        }
    }

}
