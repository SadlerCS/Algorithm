package homework0203;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Example17 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1", "Jack");
        map.put("2", "Rose");
        map.put("3", "Lucy");
        System.out.println(map);
//        获取 Map 集合中 value 值集合对象
        Collection values = map.values();

//      遍历 Map 集合所以值对象v
        values.forEach(v -> System.out.println(v));

    }
}
