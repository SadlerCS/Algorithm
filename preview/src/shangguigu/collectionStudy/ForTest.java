package shangguigu.collectionStudy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
 * jdk5.0 新增了foreach循环,用于变量集合,数组
 *
 * */
public class ForTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

//      for (集合中元素的类型  局部变量 :   集合对象  )
        for (Object obj : coll) {
            System.out.println(obj);
        }

        int arr[] = {1, 2, 3, 4, 5, 67, 7};
//        for(数组元素的类型 局部变量: 数组对象)
        for (int i : arr) {
            System.out.println(i);
        }

//        练习题
        String arr1[] = {"MM", "MM", "MM"};

//        方式1: 普通for赋值
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = "GG";

        }
//        方式2: 增强for循环
        for (String s : arr1) {
            s = "GG";
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
