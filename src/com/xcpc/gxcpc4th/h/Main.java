package com.xcpc.gxcpc4th.h;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int sum = 0;
            String[] str = new String[7];
            for (int i = 0; i < 7; i++) {
                str[i] = scanner.next();
            }

            for (int i = 0; i < n; i++) {
                if (str[2].charAt(3 + 7 * i) == '#') {
                    sum += 1;
                    continue;
                }
                if (str[1].charAt(5 + 7 * i) == '#' && str[2].charAt(4 + 7 * i) == '#' && str[4].charAt(2 + 7 * i) == '#' && str[5].charAt(1 + 7 * i) == '#') {

                    sum += 2;
                    continue;
                }
                if (str[1].charAt(5 + 7 * i) == '#' && str[3].charAt(3 + 7 * i) == '#' && str[5].charAt(1 + 7 * i) == '#') {
                    sum += 3;
                    continue;
                }
                if (str[1].charAt(1 + 7 * i) == '#' && str[3].charAt(3 + 7 * i) == '#' && str[5].charAt(1 + 7 * i) == '#') {

                }

                String s = "|..###..||.......|";

                String s1 = s.substring(i * 6, i * 6 + 7);
//               s1.indexOf()


            }

        }
    }
}
