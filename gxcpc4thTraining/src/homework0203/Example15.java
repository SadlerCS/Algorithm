package homework0203;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//遍历
public class Example15 {
    public static void main(String[] args) {
//        创建 Map 集合
        Map map = new HashMap();
//        存储元素
        map.put("1", "Jack");
        map.put("2", "Rose");
        map.put("3", "Lucy");
        System.out.println(map);

//        第一种遍历方法
        {//      获取键的集合
            Set ketSet = map.keySet();
//        迭代键的集合
            Iterator it = ketSet.iterator();
            while (it.hasNext()) {
                Object key = it.next();
//            获取每个键所对应的值
                Object value = map.get(key);
                System.out.println(key + ":" + value);
            }
        }

//        第二种遍历方法
        {
            Set entrySet = map.entrySet();
//            获取 Iterator 对象
            Iterator it = entrySet.iterator();

            while (it.hasNext()) {
//                获取集合中舰队对映射关系
                Map.Entry entry = (Map.Entry) (it.next());
//                获取 Entry 中的键
                Object key = entry.getKey();
//                获取 Entry 中的值
                Object value = entry.getValue();
                System.out.println(key + ":" + value);

            }

        }
    }
}
