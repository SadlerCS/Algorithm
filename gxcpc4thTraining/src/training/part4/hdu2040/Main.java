package training.part4.hdu2040;

import java.util.Scanner;

//hdu2040
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        while (m-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (sum(a) == sum(b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }

    //    因数
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                sum += n / i;
            }
        }
        return sum;
    }
}
