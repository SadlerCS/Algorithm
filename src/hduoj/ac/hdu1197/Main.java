package hduoj.ac.hdu1197;


//hdu1197,AC,进制加法判断是否相同
public class Main {
    public static void main(String[] args) {
        for (int i = 2992; i < 10000; i++) {
            if (isSameSum(i)) {
                System.out.println(i);
            }
        }
    }

    //    判断10,12,16进制的各位加法是否相同
    public static boolean isSameSum(int num) {
        int a = decSum(num, 10);
        int b = decSum(num, 12);
        int c = decSum(num, 16);
        if (a == b && b == c & a == c) {
            return true;
        }
        return false;
    }

    //    进制每一位的加法
    public static int decSum(int num, int radix) {
        int sum = 0;
//        输入值大于0
        while (num > 0) {
//            将num模进制的值赋给sum
            sum += num % radix;
//            改变num值
            num /= radix;
        }
        return sum;
    }
}
