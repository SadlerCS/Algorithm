package com.xcpc.training.homework0203;

import java.util.stream.Stream;

public class Example34 {
    public static void main(String[] args) {
//        通过字符串源数据创建了一个 Stream流对象
        Stream<String> stream = Stream.of("张三", "李四", "张小明", "张阳");
//        筛选以"张开头的元素
        stream.filter(i -> i.startsWith("张"))
//                筛选长度大于2个元素
                .filter(i -> i.length() > 2)
//                对流元素进行遍历输出
                .forEach(System.out::println);

    }

}
