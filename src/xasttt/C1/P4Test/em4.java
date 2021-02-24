package xasttt.C1.P4Test;

import java.util.Scanner;

/*梯形上底a，下底b，高h，求梯形面积*/
public class em4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int h = sc.nextInt();
            System.out.println("梯形面积=" + (a + b) * h / 2);
        }


    }
}
