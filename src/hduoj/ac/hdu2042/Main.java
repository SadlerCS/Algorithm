package hduoj.ac.hdu2042;

import java.util.Scanner;

//hdu2042
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int sum = 3;
            for (int i = 1; i <= n; i++) {
                sum = (sum - 1) * 2;
            }
            System.out.println(sum);
        }
    }
}
