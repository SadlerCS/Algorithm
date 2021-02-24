package training.part2.hdu2011;

import java.util.Scanner;

//hdu2011
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            double arr[] = new double[n + 1];
            arr[1] = 1;
            double sum = arr[1];
            for (int i = 2; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr[i] = -(1 / (double) i);
                } else {
                    arr[i] = 1 / (double) i;
                }
                sum += arr[i];
            }
            System.out.printf("%.2f", sum);
            System.out.println();
        }


    }
}
