package training.part4.hdu2018;

import java.util.Scanner;

//hdu2018
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            System.out.println(f(num));
        }
    }

    public static int f(int num) {
        if (num <= 4) {
            return num;
        } else {
            return f(num - 1) + f(num - 3);
        }
    }
}
