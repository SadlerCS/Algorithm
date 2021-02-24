package homework0203;
//p219

import java.util.HashSet;

class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //    重写toString()方法
    public String toString() {
        return id + ":" + name;
    }

    //    重写hashCode()方法
    public int hashCode() {
//        返回id属性的哈希值
        return id.hashCode();
    }

    //    重写equals()方法
    public boolean equals(Object obj) {
//        判断是否是同一个对象
        if (this == obj) {
//            如果是,直接返回true
            return true;
        }

//        判断对象是为Student 类型
        if (!(obj instanceof Student)) {
//            如果对象不是 Student类型,返回false
            return false;
        }
        //            将对象强转为Student 类型
        Student stu = (Student) obj;
//            判断 id值是否相同
        boolean b = this.id.equals(stu.id);
//            返回判断结果
        return b;
    }
//    public String toString() {
//        return id + ":" + name;
//    }
}

public class Example10 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student stu1 = new Student("1", "Jack");
        Student stu2 = new Student("2", "Rose");
        Student stu3 = new Student("2", "Rose");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}
