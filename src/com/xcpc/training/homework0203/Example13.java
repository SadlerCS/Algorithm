package com.xcpc.training.homework0203;

import java.util.Comparator;
import java.util.TreeSet;

//定义比较器实现 Comparator 接口
class MyComparator implements Comparator {
    //    定义排序方式
    public int compare(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        int temp = s1.length() - s2.length();
        return temp;
    }

}

public class Example13 {
    public static void main(String[] args) {
//        1,创建集合时,传入 Comparetor 接口实现定制排序规划
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add("Jack");
        ts.add("Helena");
        ts.add("Eve");
        System.out.println(ts);

//        2,创建集合时,使用 Lambda 表达式定制排序规则
        TreeSet ts2 = new TreeSet((obj1, obj2) -> {
            String s1 = (String) obj1;
            String s2 = (String) obj2;
            return s1.length() - s2.length();
        });
        ts2.add("Jack");
        ts2.add("Helena");
        ts2.add("Eve");
        System.out.println(ts2);
    }
}
