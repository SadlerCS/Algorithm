package training.part4.hdu2024;

import java.util.Scanner;

//hdu2024
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {

            String str = scanner.nextLine();
//            下划线95,大写字母65-90,小写字母97-122,数字48-57,空格32
//            首字符不是下划线,大写字母,小写字母,输出no
            if (!(Character.isLetter(str.charAt(0)) || str.charAt(0) == '_')) {
                System.out.println("no");
                continue;
            }
            boolean isIdentifier = true;
            for (int i = 1; i < str.length(); i++) {

                //剩余字符不是下划线,大写字母,小写字母,数字,输出no,打断
                if (!(str.charAt(i) == '_' || Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)))) {
                    isIdentifier = false;
                    break;
                }
            }
            if (isIdentifier) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        scanner.close();


    }
}
