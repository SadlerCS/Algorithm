package com.xcpc.training.training.part4.hdu2025;

//import java.util.ArrayList;

import java.util.Scanner;

//hdu2025
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String insert = "(max)";
        while (scanner.hasNext()) {
            String s = scanner.next();
            String newS = "";
//            StringBuilder s1=new StringBuilder(s);
//            ArrayList list = new ArrayList();
            char max = s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) >= max) {
                    max = s.charAt(i);
                }
            }

            for (int i = 0; i < s.length(); i++) {
                newS += s.charAt(i);
                if (s.charAt(i) == max) {
//                    list.add(i+1);
                    newS += insert;
                }
            }

            System.out.println(newS);

//            for (int i = 0; i < list.size(); i++) {
//                s1.insert((Integer) list.get(i+5*i), insert);
//            }
//            System.out.println(s1);


        }
    }
}
