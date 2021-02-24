import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            int maxSum = arr[1];//f(n+1)
            int sum = 0;//累加
            int fin = 0;//f(n)
            int start = 1;
            int startTemp = 1;
            int end = 1;
            for (int i = 2; i < arr.length; i++) {
                sum += arr[i];
                if (maxSum >= 0) {
                    fin = maxSum + arr[i];//f(n)=f(n-1)+a(n)

                    maxSum = fin;
                    start = startTemp;
                    end = i;

                } else {
                    fin = arr[i];//f(n)=a(n)
                    maxSum = fin;
                    sum = 0;
                    startTemp = i + 1;
                }
            }
            System.out.println(fin + " " + start + " " + end);

        }
    }
}
