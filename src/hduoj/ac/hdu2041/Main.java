package hduoj.ac.hdu2041;

import java.util.Scanner;

//2041
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int col = input.nextInt();

            System.out.println(f(col));


        }
    }

    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return f(n - 2) + f(n - 1);
        }
    }
}

