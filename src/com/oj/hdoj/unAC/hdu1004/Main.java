package com.oj.hdoj.unAC.hdu1004;


import java.util.Scanner;

//hdu
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) break;
            String s[] = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = scanner.next();
            }
//            HashMap<String, Integer> map = new HashMap<>();
            int count = 0;
            int max = -1;
            int index = -1;

            for (int i = 0; i < n; i++) {
                count = 0;
                for (int j = 0; j < n; j++) {
                    if (s[i].equals(s[j])) {
                        count++;
                    }
                }
                if (count > max) {
                    index = i;
                    max = count;
                }
            }


            System.out.println(s[index]);

        }

    }

}
