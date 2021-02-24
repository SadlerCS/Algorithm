package homework0203;

import java.util.ArrayList;
import java.util.Collections;

public class Example25 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        添加元素
        Collections.addAll(list, "C", "Z", "B", "K");
        System.out.println("排序前:" + list);
//        反转集合
        Collections.reverse(list);
        System.out.println("反转后:" + list);

//        按自然顺序排序
        System.out.println("按自然顺序排序后:" + list);
//        随机打乱集合元素
        Collections.shuffle(list);
        System.out.println("按随机顺序排序后:" + list);
//        将集合首尾元素交换
        Collections.swap(list, 0, list.size() - 1);
        System.out.println("集合首尾元素交换后:" + list);
    }
}
