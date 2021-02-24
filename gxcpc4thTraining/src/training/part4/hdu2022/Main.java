package training.part4.hdu2022;

import java.util.Scanner;

//hdu2022
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int arr[][] = new int[m][n];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            int res = arr[0][0];
            int col = 0;
            int row = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (Math.abs(arr[i][j]) > Math.abs(res)) {
                        res = arr[i][j];
                        col = i;
                        row = j;
                    }
                }
            }

            System.out.println((col + 1) + " " + (row + 1) + " " + res);


        }
    }
}
