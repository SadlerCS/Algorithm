package training.part2.hdu2006;

import java.util.Scanner;

//hdu2006
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            int sum = 1;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] % 2 == 0) {
                    arr[i] = 1;
                }
                sum *= arr[i];
            }
            System.out.println(sum);
        }
    }
}
