package hduoj.ac.hdu2008;

import java.util.Scanner;

//hdu2008
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int negative = 0;
            int zero = 0;
            int positive = 0;

            double arr[] = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextDouble();
                if (arr[i] > 0) {
                    positive++;
                } else if (arr[i] == 0) {
                    zero++;
                } else if (arr[i] < 0) {
                    negative++;
                }
            }
            System.out.println(negative + " " + zero + " " + positive);

        }
    }
}
