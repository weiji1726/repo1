package com.personal.demo;

import java.util.HashMap;

/**
 * @Author Wisdom
 * @Date 2021/5/14
 */
public class MapDemo{
    public static void main(String[] args){
        HashMap map1 = new HashMap();
        map1.put("111","张三丰");

        HashMap map2 = new HashMap();
        map2.put("222","张翠山");
        map2.put("333","张无忌");

        for(Object key:map1.keySet()){
            System.out.println(map1.get(key));
        }
        System.out.println("-------------------");
        map1.putAll(map2);
        for(Object key:map1.keySet()){
            System.out.println(map1.get(key));
        }

    }

}
