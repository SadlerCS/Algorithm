package training.part4.hdu2026;

import java.util.Scanner;

//hdu2026
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
//            65==A  97==a   -32

            for (int i = 0; i < s.length(); i++) {
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    System.out.print((char) (s.charAt(i) - 32));
                    continue;
                }
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}
