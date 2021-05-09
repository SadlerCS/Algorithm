package com.oj.hdoj.unAC.hdu2072;

import java.util.HashSet;
import java.util.Scanner;

//hdu
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (s.equals("#")) break;
            String a[] = s.split("\\s+");
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < a.length; i++) {
                if (a[i].trim() != null)
                    set.add(a[i].trim());
            }
            System.out.println(set.size());

        }
    }

}
