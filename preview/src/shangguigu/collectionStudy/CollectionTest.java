package shangguigu.collectionStudy;

import java.util.*;

/*
 * 一,集合框架的概述
 *
 * 1,集合,数组都是对多个数据进行存储操作的结构,简称Java容器
 *       说明:此时的村吃,主要指的是内存层面的村吃,不涉及到持久化的存储(.txt,.jpg,.avi,数据库中)
 * 2.1数组在村吃多个数据方面的特点:
 *       > 一旦初始化以后,其长度就确定了.
 *       > 数组一旦定义好,其元素的类型就确定了.我们也就只能操作指定类型的数据了.
 *           比如: String[] arr; int[] arr1;Object[] arr2;
 * 2.2 数组在村吃多个数据方面的缺点:
 *       > 一旦初始化以后,其长度不可修改
 *       > 数组中提供的方法非常有限,对于添加,删除,插入数据等操作,非常不便.同时效率不高
 *       > 获取数组中实际元素的个数的需求,数组没有现成的属性或方法可用
 *       >数组存储数据的特点: 有序,可重复.对于无序,不可重复的需求,不可满足
 *
 *  Java 集合可分为 Collection 和 Map 两种体系
 *       > Collection接口: 单列数据,定义了存取一组对象的方法的集合
 *           > List : 元素有序,可重复的集合
 *           > Set : 元素无序,不可重复的集合
 *       > Map接口 : 双列数据,保存具有映射关系 "key-value对" 的集合
 * 二,集合框架
 *       |----Collection接口: 单列集合,用来存储一个一个的对象
 *           |----List接口:存储有序的,可重复的数据    -->"动态"数组
 *               |----ArrayList,LinkedList,Vector
 *
 *           |----Set接口:存储无序的,不可重复的数据
 *               |----HashSet,LinkedHashSet,TreeSet
 *
 *       |----Map接口:双列集合,用来存储一对(key - value) 一对的数据   -->高中函数: y=f(x)
 *               |----HashMap,LinkedHashMap,TreeMap,HashTable,Properties
 *
 * 三,Collection接口中的方法
 *
 * */
public class CollectionTest {

    public static void main(String[] args) {
        /*
        * Collection接口中声明的方法的测试
        *
        * Collection接口API
        *   1,add(Object e);将元素e添加到集合coll中
        *   2,size();将添加的元素的个数
        *   3,addAll(); 将coll1集合汇总的元素添加到当前的集合汇总
        *   4,clear();  清空集合元素
        *   5,isEmpty();    判断当前集合是否为空
        *   6,contains(Object obj); 判断当前集合中是否包含obj(我们在判断时会调用obj对象所在类的equals())
        *   7,containsAll(Collection coll1);  判断形参coll1中的所有元素是否都存在于当前集合中
        *   8,remove(Object obj);从当前集合中移除obj元素
        *   9,removeAll(Collection coll1);差集(集合a去掉集合a与集合b交集部分):从当前集合汇总移除coll1中所有的元素
        *   10,retainAll(Collection coll1);交集:获取当前集合和coll1集合的交集,并返回给当前集合
        *   11,equals(Object obj);要想返回true,需要当前集合和形参集合的元素都相同
        *   12,hashCode();返回当前对象的哈希值
        *   13,集合--->数组: toArray();
                System.out.println(coll);
                Object arr[] = coll.toArray();
        *
        *   14,拓展: 数组--->集合 : 调用Arrays类的静态方法asList();
                List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        *
        *   15,iterator(); 返回Iterator接口的实力,用于遍历集合元素,放在IteratorTest.java中
        *
        * 结论:
        * 向Collection接口的实现类的对象中添加数据obj时,要求obj所在类要重写equals().
        *
        * */
        Collection coll = new ArrayList();

//        add(Object e);将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());

//        size();将添加的元素的个数
        System.out.println(coll.size());//4

//        addAll(); 将coll1集合汇总的元素添加到当前的集合汇总
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("cc");
        coll.addAll(coll1);
        coll.add(false);
        System.out.println(coll.size());//6
        System.out.println(coll);

//        clear();  清空集合元素
//        coll.clear();

//        isEmpty();    判断当前集合是否为空
        System.out.println(coll.isEmpty());

//        1.contains(Object obj); 判断当前集合中是否包含obj
//        我们在判断时会调用obj对象所在类的equals()
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains("cc"));

//        2.containsAll(Collection coll1);  判断形参coll1中的所有元素是否都存在于当前集合中
        Collection coll2 = Arrays.asList(123, 456);
//        判断coll集合中的元素是否包含coll2中的所有元素
        System.out.println(coll.containsAll(coll2));

//        3,remove(Object obj);从当前集合中移除obj元素
//        coll.remove(123);
        System.out.println(coll);

//        4,removeAll(Collection coll1);差集(集合a去掉集合a与集合b交集部分):从当前集合汇总移除coll1中所有的元素
        Collection coll3 = Arrays.asList(123, 456);
        coll.removeAll(coll3);
        System.out.println(coll);

//        5,retainAll(Collection coll1);交集:获取当前集合和coll1集合的交集,并返回给当前集合
        coll.retainAll(coll1);
        System.out.println(coll);

//        6,equals(Object obj);要想返回true,需要当前集合和形参集合的元素都相同
        System.out.println(coll.equals(coll1));

//        7,hashCode();返回当前对象的哈希值
        System.out.println(coll.hashCode());

//        8,集合--->数组: toArray();
        System.out.println(coll);
        Object arr[] = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        拓展: 数组--->集合 : 调用Arrays类的静态方法asList();
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        String arr1[] = {"fedfesfwesf", "fsdf", "dsgsg"};
        List<String> list1 = Arrays.asList(arr1);

//        iterator(); 返回Iterator接口的实力,用于遍历集合元素,放在IteratorTest.java中
    }
}
