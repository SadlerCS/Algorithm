package homework0202;

public class Example17 {
    public static void main(String[] args) {
//        定义一个基本类型的变量a.并赋值为20
        int a = 20;
//        自动装箱: 将基本类型的变量a赋值给 Integer 类型的变量b
        Integer b = a;
        System.out.println(b);
//        自动拆箱:将 Integer 类型的变量b赋给基本类型的变量c
        int c = b;
        System.out.println(c);

    }
}
