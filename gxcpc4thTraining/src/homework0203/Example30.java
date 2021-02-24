package homework0203;

import java.util.Arrays;

public class Example30 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
//        用8替换数组中的每个元素
        Arrays.fill(arr, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ":" + arr[i]);
        }
    }
}
