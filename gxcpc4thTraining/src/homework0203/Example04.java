package homework0203;

import java.util.ArrayList;

public class Example04 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("data_1");
        list.add("data_2");
        list.add("data_3");
//        使用 foreach 循环遍历集合
        for (Object obj : list) {
//            取出并打印集合中的元素
            System.out.println(obj);
        }

    }
}
