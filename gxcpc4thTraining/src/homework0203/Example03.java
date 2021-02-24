package homework0203;

import java.util.ArrayList;
import java.util.Iterator;

// Iterator 遍历集合
public class Example03 {
    public static void main(String[] args) {
//        创建 ArrayList 集合
        ArrayList list = new ArrayList();
//        向该集合中添加字符串
        list.add("data_1");
        list.add("data_2");
        list.add("data_3");
//        获取 Iterator 对象
        Iterator iterator = list.iterator();
//        判断集合中是否存在下一个元素
        while (iterator.hasNext()) {
//            取出 ArrayList 集合中的元素
            Object obj = iterator.next();
            System.out.println(obj);
        }

    }
}
