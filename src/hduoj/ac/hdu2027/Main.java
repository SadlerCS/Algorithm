package hduoj.ac.hdu2027;

import java.util.Scanner;

//hdu2027
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            int a = 0;
            int e = 0;
            int i = 0;
            int o = 0;
            int u = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a') {
                    a++;
                } else if (s.charAt(j) == 'e') {
                    e++;
                } else if (s.charAt(j) == 'i') {
                    i++;
                } else if (s.charAt(j) == 'o') {
                    o++;
                } else if (s.charAt(j) == 'u') {
                    u++;
                }
            }
            System.out.println("a:" + a);
            System.out.println("e:" + e);
            System.out.println("i:" + i);
            System.out.println("o:" + o);
            System.out.println("u:" + u);
            if (t != 0) {
                System.out.println();
            }
        }
    }
}
