package hduoj.ac.hdu1720;

import java.util.Scanner;

//hdu1720,十六进制加法,AC
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt(16);
            int b = scanner.nextInt(16);
            System.out.println(a + b);
        }
    }
}
