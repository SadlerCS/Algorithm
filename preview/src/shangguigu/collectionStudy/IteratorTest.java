package shangguigu.collectionStudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/*
 * 集合元素的遍历操作,使用迭代器Itetator接口
 *   1,内部的方法: hasNext() 和 next()
 *   2,集合对象每次调用iterator()方法都得到一个全新的迭代器对象,默认游标都在集合的第一个元素之前.
 *   3,内部定义了remove(),可以在变量的时候,删除集合中的元素.此方法不同于集合直接电泳remove()
 * */
public class IteratorTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

        Iterator iterator = coll.iterator();

//        方式1:
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

//        方式2: 不推荐
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

//        方式3: 推荐
//        hasNext();判断是否还有下一个元素
//        while (iterator.hasNext()) {
//            next(); 1,指针下移 2,将下移以后集合位置上的元素返回
//            System.out.println(iterator.next());
//        }

//        remove();删除集合中"AA"
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if ("AA".equals(obj)) {
                iterator.remove();
            }
        }
        iterator = coll.iterator();//重新刷新指针
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
