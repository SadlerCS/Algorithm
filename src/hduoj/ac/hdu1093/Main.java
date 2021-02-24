package hduoj.ac.hdu1093;

import java.util.Scanner;

//hdu1093
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
