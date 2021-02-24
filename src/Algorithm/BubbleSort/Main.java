package Algorithm.BubbleSort;

import java.util.Scanner;

//冒泡排序
//输入n,然后输入n个数,进行排序大
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int[] arr = new int[n];
            //数组输入的写法
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }

            //冒泡排序
            int max = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {//循环n-1次
                for (int j = 0; j < arr.length - i - 1; j++) {//每次累减i次
                    if (arr[j] < arr[j + 1]) {
                        //交换赋值算法
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            //遍历数组
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
