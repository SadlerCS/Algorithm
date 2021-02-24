package homework0203;

import java.util.ArrayList;
import java.util.Iterator;

public class Example06 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Annie");
        list.add("Rose");
        list.add("Tom");
//        获取Iterator对象
        Iterator it = list.iterator();
//        判断该集合是否有下一个元素
        while (it.hasNext()) {
//            获取该集合中的元素
            Object obj = it.next();
//            判断该集合中的元素是否为 Annie

            //原来错误的
//            if ("Annie".equals(obj)) {
////                删除该集合中的元素
//                list.remove(obj);
//
//            }

//          正确写法1:
//            if ("Annie".equals(obj)) {
////                删除该集合中的元素
//                list.remove(obj);
//                break;
//
//            }

//            正确写法2:
            if ("Annie".equals(obj)) {
//                删除该集合中的元素
                it.remove();

            }

        }
//        输出出现异常
        System.out.println(list);

    }
}
