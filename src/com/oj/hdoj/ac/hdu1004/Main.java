package com.oj.hdoj.ac.hdu1004;

import java.util.Scanner;

//1004,AC
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            } else {
                int[] arr = new int[num];
                String[] color = new String[num];
                for (int i = 0; i < color.length; i++) {
                    color[i] = input.next();
                }
                int max = 0;
                int location = 0;//位置
                int sum = 0;
                for (int j = 0; j < color.length; j++) {
                    for (int k = 0; k < color.length; k++) {
                        if (color[j].equals(color[k])) {
                            sum++;
                        }
                    }
                    if (sum > max) {
                        max = sum;
                        location = j;
                    }
                    sum = 0;
                }
                System.out.println(color[location]);
            }
        }
        input.close();
    }

}
