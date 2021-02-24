package training.part2.hdu2010;

import java.util.ArrayList;
import java.util.Scanner;

//hdu2010
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            ArrayList list = new ArrayList();
            for (int i = m; i <= n; i++) {
                int singetDigit = (int) Math.pow(i % 10, 3);
                int tensDigit = (int) Math.pow(i / 10 % 10, 3);
                int hundredsDigit = (int) Math.pow(i / 100 % 10, 3);
//                判断水仙花
                if (hundredsDigit + tensDigit + singetDigit == i) {
                    list.add(i);
                }
            }

            if (list.size() == 0) {
                System.out.println("no");
            } else {
                for (int i = 0; i < list.size() - 1; i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println(list.get(list.size() - 1));
            }
        }
    }
}
