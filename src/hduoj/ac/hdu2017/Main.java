package hduoj.ac.hdu2017;

import java.util.Scanner;

//hdu2017
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String str = scanner.next();
            char c[] = new char[str.length()];
            int sum = 0;
            for (int i = 0; i < c.length; i++) {
                c[i] = str.charAt(i);
                if (c[i] >= 48 && c[i] <= 57) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
