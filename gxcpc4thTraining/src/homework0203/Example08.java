package homework0203;

import java.util.ArrayList;
import java.util.Iterator;

public class Example08 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("data_1");
        list.add("data_2");
        list.add("data_3");
        System.out.println(list);
//        将集合转换为 Iterator 迭代器对象
        Iterator it = list.iterator();
//        使用 JDK8 增加的 forEachRemaining(Consumer action)来遍历迭代器对象
        it.forEachRemaining(obj -> System.out.println("迭代集合元素: " + obj));


    }
}
