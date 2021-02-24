package hduoj.ac.hdu2001;

import java.util.Scanner;

//hdu2001
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double res = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            System.out.printf("%.2f", res);
            System.out.println();
        }

    }
}
