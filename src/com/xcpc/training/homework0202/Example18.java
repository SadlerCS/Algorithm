package com.xcpc.training.homework0202;

public class Example18 {
    public static void main(String[] args) {
        int num = 123;
//        1,通过 String.valueOf() 方法将基本类型转换为字符串
        String string = String.valueOf(num);
        System.out.println("将int变量转换为字符串的结果: " + string);

//        2,通过包装类的 valueOf() 静态方法将基本类型和字符串转换为包装类
        String str = "998";
        Integer integer = Integer.valueOf(num);
        Integer integer2 = Integer.valueOf(str);
        System.out.println("将 int 变量转换为包装类的结果: " + integer);
        System.out.println("将 字符串 变量转换为包装类的结果: " + integer2);

//        3,通过包装类的有参构造方法将基本类型和字符串转换为包装类
        Integer integer3 = new Integer(num);
        Integer integer4 = new Integer(str);
        System.out.println("通过构造器将 int 变量转换为包装类的结果: " + integer3);
        System.out.println("通过构造器将 int 变量转换为包装类的结果: " + integer4);

//        4,通过包装类的parseXxx() 静态方法将字符串转换为基本数据类型
        int parseInt = Integer.parseInt(str);

//        5,通过包装类的 toString() 方法将包装类转换为字符串
        String string2 = integer.toString();
        System.out.println("将包装类转换为字符串的结果: " + string2);
    }
}
