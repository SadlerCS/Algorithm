package stringAPI;

/*
 * String : 字符串,使用一对""引起表示
 * 1,String声明为final的,不可被继承
 * 2,String实现了Serializable接口: 表示String可以比较大小
 *         实现了Comparable接口: 表示String可以比较大小
 * 3,String内部定义了final char[] value用于村吃字符串数据
 * 4,String:代表不可变的字符序列.简称:不可变性
 *       体现: 1,党对字符串重新赋值是,需要重写指定内存区域赋值,不能使用原有的value进行赋值
 * 5,通过字面量的方式(区别于new)给一个字符串赋值,此时的字符串值晟敏在字符串常量池中
 * 6,字符串常量池中是不会存储相同内容的字符串的
 *
 * */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";//字面量的定义方式
        String s2 = "abc";
//        s1 = "hello";

        System.out.println(s1 == s2);//比较s1和s2的地址值

        System.out.println(s1);//hello
        System.out.println(s2);//abc

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);//abcdef
    }
}
