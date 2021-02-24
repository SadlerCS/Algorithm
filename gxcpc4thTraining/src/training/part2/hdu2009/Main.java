package training.part2.hdu2009;

import java.util.Scanner;

//hdu2009
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double n = scanner.nextDouble();
            double m = scanner.nextDouble();
            double sum = n;
            for (int i = 0; i < m - 1; i++) {
                n = Math.sqrt(n);
                sum += n;
            }
            System.out.printf("%.2f", sum);
            System.out.println();
        }
    }
}
