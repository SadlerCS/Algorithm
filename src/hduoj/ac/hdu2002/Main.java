package hduoj.ac.hdu2002;

import java.util.Scanner;

//hdu2002
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.1415927;
        while (scanner.hasNext()) {
            double r = scanner.nextDouble();
            double res = PI * Math.pow(r, 3) * 4 / 3;
            System.out.printf("%.3f", res);
            System.out.println();
        }
    }
}
