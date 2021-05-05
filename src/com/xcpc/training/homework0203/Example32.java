package com.xcpc.training.homework0203;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example32 {
    public static void main(String[] args) {
//        创建一个数组
        Integer array[] = {9, 8, 3, 5, 2};
//        将数组转换为 List 集合
        List<Integer> list = Arrays.asList(array);
//        1,使用集合对象的 stream()静态方法创建 Stream流对象
        Stream<Integer> stream = list.stream();
        stream.forEach(i -> System.out.println(i + " "));
        System.out.println();
//        2,使用 Stream接口的of()静态方法创建Stream流对象
        Stream<Integer> stream2 = Stream.of(array);
        stream2.forEach(i -> System.out.println(i + " "));
        System.out.println();
//                3,使用 Arrays 数组工具类的stream()静态方法创建Stream流对象
        Stream<Integer> stream3 = Arrays.stream(array);
        stream3.forEach(i -> System.out.println(i + " "));


    }
}
