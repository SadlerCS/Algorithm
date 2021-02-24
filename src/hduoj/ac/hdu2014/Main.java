package hduoj.ac.hdu2014;

import java.util.Arrays;
import java.util.Scanner;

//hdu2014
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            double arr[] = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextDouble();
            }
            Arrays.sort(arr);
            double sum = 0;
            for (int i = 1; i < arr.length - 1; i++) {
                sum += arr[i];
            }
            sum /= (n - 2);
            System.out.printf("%.2f", sum);
            System.out.println();
        }
    }
}
