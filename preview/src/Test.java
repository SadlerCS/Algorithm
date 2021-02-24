import java.util.Scanner;

public class Test {


    public static int f(int n) {
        if (n == 1) {
            return a(1);
        }
        if (f(n - 1) < 0) {
            return a(n);
        } else if (f(n - 1) > 0) {
            return f(n - 1) + a(n);
        }

        return 0;
    }

    static int n = 0;
    static int[] b = new int[n + 1];

    public static int a(int n) {

        return b[n];

    }

    public static void main(String[] args) {
//        Test t = new Test();
//        System.out.println(t.f(3));
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            n = in.nextInt();
            for (int i = 1; i < b.length; i++) {
                b[i] = in.nextInt();
            }
            System.out.println(f(n));

        }

    }


}
