package homework0202;

import java.util.Scanner;

// contains() 不错,接下来就是找规律的问题了
public class H2 {
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

            for (int i = 0; i < n; i++) {
                String compare1 = str[1].substring(0 + 7 * i, 7 + 7 * i);
                String compare3 = str[3].substring(0 + 7 * i, 7 + 7 * i);
//                匹配1
                if (compare3.contains("###")) {//匹配第3行
                    sum += 1;
                    continue;
                }
//                匹配2,3
                if (compare1.contains("....#")) {//匹配第一行包含".#"
                    if (compare3.contains("#")) {//匹配第三行
//                        成立则为3
                        sum += 3;
                        continue;
                    } else {
//                        否则为2
                        sum += 2;
                        continue;
                    }
                }
//                  匹配4,6
                if (compare1.contains("##")) {//匹配第一行包含"##"
                    if (compare3.contains("##")) {//第三行包含"##"
//                      成立为6
                        sum += 6;
                        continue;
                    } else {
//                        否则为4
                        sum += 4;
                        continue;
                    }
                }

                if (compare1.contains("#...#")) {
                    sum += 5;
                    continue;
                }


//
            }
            System.out.println(sum);
        }
    }
}
