package homework0203;

import java.util.HashSet;

// Set
public class Example09 {
    public static void main(String[] args) {

//        HashSet集合

        HashSet set = new HashSet();
        set.add("Jack");
        set.add("Eve");
        set.add("Rose");
//        向该 Set 集合中添加重复元素
        set.add("Rose");
//        遍历输出 Set 集合中的元素
        set.forEach(obj -> System.out.println(obj));

    }
}
