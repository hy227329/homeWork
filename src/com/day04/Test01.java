package com.day04;

import java.util.ArrayList;
import java.util.Collection;

/*
创建一个集合c1，存放元素"one","two","three"
 * 再创建一个集合c2，存放元素"four","five","six"
 * 然后将c2元素全部存入c1集合
 * 然后在创建集合c3,存放元素"one,five"
 * 然后输出集合c1是否包含集合c3的所有元素
 * 然后将c1集合中的"two"删除后再输出c1集合
 */
public class Test01 {
    public static void main(String[] args) {
        Collection col1 = new ArrayList();
        Collection col2 = new ArrayList();
        col1.add("one");
        col1.add("two");
        col1.add("three");

        col2.add("four");
        col2.add("five");
        col2.add("six");

        col1.addAll(col2);
        //System.out.println(col1);

        Collection col3 = new ArrayList();
        col3.add("one,five");
        boolean b = col1.containsAll(col3);
        System.out.println(b);
        col1.remove("two");
        System.out.println(col1);
    }
}
