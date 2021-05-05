package com.xcpc.training.homework0203;


import java.util.TreeSet;

//定义 Teacher 类实现 Compareble 接口
class Teacher implements Comparable {
    String name;
    int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    //    重写 Comparable 接口的 compareTo()方法
    public int compareTo(Object obj) {
        Teacher s = (Teacher) obj;
//        定义比较方式,先比较年龄age,再比较名称 name
        if (this.age - s.age > 0) {
            return 1;
        }
        if (this.age - s.age == 0) {
            return this.name.compareTo(s.name);
        }
        return -1;

    }
}

public class Example12 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Teacher("Jack", 19));
        ts.add(new Teacher("Rose", 18));
        ts.add(new Teacher("Tom", 19));
        ts.add(new Teacher("Rose", 18));
        System.out.println(ts);
    }
}
