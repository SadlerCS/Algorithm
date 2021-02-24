package homework0203;

import java.util.Arrays;

public class Example29 {
    public static void main(String[] args) {
        int arr[] = {9, 8, 3, 5, 2};
//        拷贝一个指定范围的数组
        int copied[] = Arrays.copyOfRange(arr, 1, 7);
        for (int i = 0; i < copied.length; i++) {
            System.out.print(copied[i] + " ");
        }
    }
}
