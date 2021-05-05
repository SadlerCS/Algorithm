package com.oj.hdoj.unAC.hdu2034;

import java.util.ArrayList;
import java.util.Scanner;

//hdu2034
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            ArrayList list1 = new ArrayList();
            ArrayList list2 = new ArrayList();
            for (int i = 0; i < n; i++) {
                list1.add(scanner.nextInt());
            }

            for (int i = 0; i < m; i++) {
                list2.add(scanner.nextInt());
            }
            list1.removeAll(list2);
            if (list1.size() == 0) {
                System.out.println("NULL");
            }
            for (int i = 0; i < list1.size(); i++) {
                System.out.print(list1.get(i) + " ");
            }
            System.out.println();


        }

    }

}
