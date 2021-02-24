package Algorithm.violenceMatch;

import java.util.Scanner;

public class ViolenceMatch {
    public static void main(String[] args) {
        Scanner kt = new Scanner(System.in);
        while (kt.hasNext()) {
            String str1 = kt.next();
            String str2 = kt.next();
            int index = violenceMatch(str1, str2);
            System.out.println("index=" + index);
        }
    }

    //    暴力匹配算法实现
    public static int violenceMatch(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        int s1len = s1.length;
        int s2len = s2.length;

        int i = 0;/*i索引指向s1*/
        int j = 0;/*j索引指向s2*/
        while (i < s1len && j < s2len) {/*保证匹配时，不越界*/

            if (s1[i] == s2[j]) {/*匹配成功*/
                i++;
                j++;
            } else {/*匹配失败*/
                i = i - j + 1;
                j = 0;
            }

        }

//    判断是否匹配成功
        if (j == s2len) {
            return i - j;
        } else {
            return -1;
        }
    }
}
