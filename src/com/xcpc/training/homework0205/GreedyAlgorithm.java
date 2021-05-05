package com.xcpc.training.homework0205;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/*
 * 简单来说进行需要了解集合的前提下
 * 进行电台 broadcasts的输入
 * 建立一个 allAreas 集合存放所有的地区
 * 建立 selects 存放选择的站台
 * 建立临时集合 tempSet 存放每次循环的交集(每次循环要清空)
 * 定义 maxKey = null ,存放每次站台的最大key(每次循环要清空)
 *
 * 然后循环 broadcasts ,找到交集存放即可
 * */
public class GreedyAlgorithm {
    public static void main(String[] args) {
//        创建广播电台,放入到map
        HashMap<String, HashSet<String>> broadcasts = new HashMap<String, HashSet<String>>();
//        将各个电台放入到broadcasts
        HashSet<String> hashSet1 = new HashSet<String>();
        Collections.addAll(hashSet1, "北京", "上海", "天津");

        HashSet<String> hashSet2 = new HashSet<String>();
        Collections.addAll(hashSet2, "广州", "北京", "深圳");

        HashSet<String> hashSet3 = new HashSet<String>();
        Collections.addAll(hashSet3, "成都", "上海", "杭州");

        HashSet<String> hashSet4 = new HashSet<String>();
        Collections.addAll(hashSet4, "上海", "天津");

        HashSet<String> hashSet5 = new HashSet<String>();
        Collections.addAll(hashSet5, "杭州", "大连");

//        加入到map
        broadcasts.put("k1", hashSet1);
        broadcasts.put("k2", hashSet2);
        broadcasts.put("k3", hashSet3);
        broadcasts.put("k4", hashSet4);
        broadcasts.put("k5", hashSet5);

//        allAreas 存放所有的地区
        HashSet<String> allAreas = new HashSet<String>();
        Collections.addAll(allAreas, "北京", "上海", "天津", "广州", "深圳", "成都", "杭州", "大连");

//        创建 ArrayList,存放选择的电台集合
        ArrayList<String> selects = new ArrayList<String>();

//        定义一个临时的集合,在遍历的过程中,存放遍历过程中的电台覆盖的地区和当前还没有覆盖的地区的交集
        HashSet<String> tempSet = new HashSet<>();

//        定义一个maxKey,保存在一次遍历过程中,能够覆盖最大末覆盖的地区对应的电台key
//        如果maxKey 不为null,则会加入到 selects
        String maxKey = null;
//        如果 allAreas 不为0,则表示还没有覆盖到所有的地区
        while (allAreas.size() != 0) {
//            每进行用一次while,需要
            maxKey = null;

//            遍历 broadcasts ,取出对应key
            for (String key : broadcasts.keySet()) {
//                每进行一次for
                tempSet.clear();
//                当前这个key能够覆盖的地区
                HashSet<String> areas = broadcasts.get(key);

                tempSet.addAll(areas);
//                求出tempSet 和allAreas 集合的交集,交集会赋给 tempSet
                tempSet.retainAll(allAreas);
//                如果当前这个集合包含的未覆盖的地区的数量,比maxKey指向的集合地区还多
//                就需要重置maxKey
//                tempSet.size()>broadcasts.get(maxKey).size() 体现出贪心算法的特点,每次都选择最优的
                if (tempSet.size() > 0 && (maxKey == null || tempSet.size() > broadcasts.get(maxKey).size())) {
                    maxKey = key;
                }

            }

//            如果 maxKey != null,就应该将maxKey 加入selects
            if (maxKey != null) {
                selects.add(maxKey);
//                将maxKey指向的广播电台覆盖的地区,从 allAreas 去掉
                allAreas.removeAll(broadcasts.get(maxKey));
            }

        }

        System.out.println("结果是:" + selects);
    }
}
