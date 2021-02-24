package Algorithm.Main06;

import java.util.Scanner;

/*
 * 冒泡排序
 * */
public class Main {
    public static void main(String[] args) {
/*        Scanner kt=new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n=kt.nextInt();

        int[]arr=new int[n];

        for (int i=0;i<arr.length;i++){
            arr[i]=kt.nextInt();
        }

//        排序
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/


        Scanner kt = new Scanner(System.in);
        System.out.println("请输入n的值:");
        while (kt.hasNext()) {
            int n = kt.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = kt.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
