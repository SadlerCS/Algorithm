package homework0203;

import java.util.LinkedList;

public class Example02 {
    public static void main(String[] args) {
//        创建 LinkedList 集合
        LinkedList link = new LinkedList();

//    1,添加元素
        link.add("stu1");
        link.add("stu2");
//        输出集合中的元素
        System.out.println(link);
//        向集合尾部追加元素
        link.offer("offer");
//        想集合头部添加元素
        link.push("push");
//        输出集合中的元素
        System.out.println(link);
//     2,获取元素
        Object object = link.peek();
//        输出集合中的元素
        System.out.println(object);
//        3,删除元素
//        删除集合中第一个元素
        link.removeFirst();
//        删除集合总最后一个元素
        link.pollLast();
        System.out.println(link);
    }
}
