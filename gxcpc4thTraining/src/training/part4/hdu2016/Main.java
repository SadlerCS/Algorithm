package training.part4.hdu2016;

import java.util.Scanner;

//hdu2016
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();

            }
            int min = arr[0];
            int index = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }

            }
            int temp = arr[0];
            arr[0] = arr[index];
            arr[index] = temp;
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[arr.length - 1]);
        }
    }
}
