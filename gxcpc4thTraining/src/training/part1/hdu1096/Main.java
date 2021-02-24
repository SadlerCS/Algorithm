package training.part1.hdu1096;

import java.util.Scanner;

//hdu1096
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int arr[] = new int[n + 1];
            arr[0] = 0;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                arr[0] += arr[i];
            }
            System.out.println(arr[0]);
            if (t != 0) {
                System.out.println();
            }

        }
    }
}
