package training.part2.hdu2005;

import java.util.Scanner;

//hdu2005
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
//            字符串分割
            String str[] = scanner.next().split("/");
//            将字符串转int
            int year = Integer.parseInt(str[0]);
            int month = Integer.parseInt(str[1]);
            int days = Integer.parseInt(str[2]);
            int sum = 0;
            int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//            判断闰年
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                arr[1] = 29;
            } else {
                arr[1] = 28;
            }

            for (int i = 0; i < month - 1; i++) {
                sum += arr[i];
            }
            sum += days;
            System.out.println(sum);
        }
    }
}
