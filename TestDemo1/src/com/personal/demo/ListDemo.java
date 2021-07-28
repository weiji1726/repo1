package com.personal.demo;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wisdom
 * @Date 2021/5/21
 */
public class ListDemo{
    public static void main(String[] args){
        /*Object str="123";
        Integer i = Integer.parseInt((String) str);
        System.out.println(i);*/

        Integer[] array={1,2,3,4,5};
        System.out.println("数组长度："+ array.length);

        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("集合长度："+list.size());

        String string="abcdefg";
        System.out.println("字符串长度："+string.length());

    }
}
