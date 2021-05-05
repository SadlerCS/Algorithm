package com.oj.hdoj.unAC.hdu1088;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hr = new String("--------------------------------------------------------------------------------");
        int count = 0;
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] strArr = s.split("\\s");
            for (int i = 0; i < strArr.length; i++) {
                if (80 - count > strArr[i].length()) {
                    if (strArr[i].equals("<br>")) {
                        System.out.println();
                        count = 0;
                    } else if (strArr[i].equals("<hr>")) {
                        if (count != 0) System.out.println();
                        System.out.println(hr);
                        count = 0;
                    } else if (!strArr[i].equals("")) {
                        if (count != 0) {
                            System.out.print(" " + strArr[i]);
                            count += strArr[i].length() + 1;
                        } else {
                            System.out.print(strArr[i]);
                            count += strArr[i].length();
                        }
                    }
                } else {
                    System.out.println();
                    count = 0;
                    System.out.print(strArr[i]);
                    count += strArr[i].length();
                }
                if (count == 80) {
                    System.out.println();
                    count = 0;
                }
            }
        }
        System.out.println();
        scanner.close();
    }
}

