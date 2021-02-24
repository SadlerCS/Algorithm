package homework0202;

import java.util.Scanner;

//indexOf(),匹配
public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int sum = 0;

            int n = scanner.nextInt();
            String str[] = new String[7];
            for (int i = 0; i < str.length; i++) {
                str[i] = scanner.next();
            }
//        创建判断字符串

//        骰子1
            String _One2 = "|..#..|";
            String _One3 = "|.###.|";
            String _One4 = "|..#..|";

//        骰子2
            String _Two1 = "|....#|";
            String _Two2 = "|...#.|";
            String _Two4 = "|.#...|";
            String _Two5 = "|#....|";

//        骰子3
            String _Three1 = "|....#|";
            String _Three3 = "|..#..|";
            String _Three5 = "|#....|";

//        骰子4
            String _Four1 = "|##.##|";
            String _Four2 = "|##.##|";
            String _Four4 = "|##.##|";
            String _Four5 = "|##.##|";

//        骰子5
            String _Five1 = "|#...#|";
            String _Five3 = "|..#..|";
            String _Five5 = "|#...#|";

//        骰子6
            String _Six1 = "|##.##|";
            String _Six3 = "|##.##|";
            String _Six5 = "|##.##|";


            for (int i = 0; i < n; i++) {
//                截取第i部分的列数
                String str1 = str[1].substring(0 + 7 * i, 7 + 7 * i);
                String str2 = str[2].substring(0 + 7 * i, 7 + 7 * i);
                String str3 = str[3].substring(0 + 7 * i, 7 + 7 * i);
                String str4 = str[4].substring(0 + 7 * i, 7 + 7 * i);
                String str5 = str[5].substring(0 + 7 * i, 7 + 7 * i);
//                  1
//                indexOf()查找
                int one2 = str2.indexOf(_One2);
                int one3 = str3.indexOf(_One3);
                int one4 = str4.indexOf(_One4);
                if (one2 != -1 && one3 != -1 && one4 != -1) {
                    sum += 1;
                    continue;
                }
//                  2
                int two1 = str1.indexOf(_Two1);
                int two2 = str2.indexOf(_Two2);
                int two4 = str4.indexOf(_Two4);
                int two5 = str5.indexOf(_Two5);
                if (two1 != -1 && two2 != -1 && two4 != -1 && two5 != -1) {
                    sum += 2;
                    continue;
                }
//                  3
                int three1 = str1.indexOf(_Three1);
                int three3 = str3.indexOf(_Three3);
                int three5 = str5.indexOf(_Three5);
                if (three1 != -1 && three3 != -1 && three5 != -1) {
                    sum += 3;
                    continue;
                }
//                  4
                int four1 = str1.indexOf(_Four1);
                int four2 = str2.indexOf(_Four2);
                int four4 = str4.indexOf(_Four4);
                int four5 = str5.indexOf(_Four5);
                if (four1 != -1 && four2 != -1 && four4 != -1 && four5 != -1) {
                    sum += 4;
                    continue;
                }
//                  5
                int five1 = str1.indexOf(_Five1);
                int five3 = str3.indexOf(_Five3);
                int five5 = str5.indexOf(_Five5);
                if (five1 != -1 && five3 != -1 && five5 != -1) {
                    sum += 5;
                    continue;
                }
//                  6
                int six1 = str1.indexOf(_Six1);
                int six3 = str3.indexOf(_Six3);
                int six5 = str5.indexOf(_Six5);
                if (str1.indexOf(_Six1) != -1 && str3.indexOf(_Six3) != -1 && str5.indexOf(_Six5) != -1) {
                    sum += 6;
                    continue;
                }


            }
            System.out.println(sum);

        }
    }
}