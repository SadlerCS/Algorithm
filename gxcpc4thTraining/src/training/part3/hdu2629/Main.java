package training.part3.hdu2629;

import java.util.Scanner;

//hdu2629,AC
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            String address = s.substring(0, 2);
            switch (address) {
                case "33":
                    System.out.print("He/She is from Zhejiang,");
                    break;
                case "11":
                    System.out.print("He/She is from Beijing,");
                    break;
                case "71":
                    System.out.print("He/She is from Taiwan,");
                    break;
                case "81":
                    System.out.print("He/She is from Hong Kong,");
                    break;
                case "82":
                    System.out.print("He/She is from Macao,");
                    break;
                case "54":
                    System.out.print("He/She is from Tibet,");
                    break;
                case "21":
                    System.out.print("He/She is from Liaoning,");
                    break;
                case "31":
                    System.out.print("He/She is from Shanghai,");
                    break;
            }
            String day = s.substring(12, 14);
            String month = s.substring(10, 12);
            String year = s.substring(6, 10);
            System.out.printf("and his/her birthday is on %s,%s,%s based on the table.", month, day, year);
            System.out.println();
        }
    }
}
