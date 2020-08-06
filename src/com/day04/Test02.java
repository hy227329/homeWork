package com.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("1");
        col.add("$");
        col.add("2");
        col.add("$");
        col.add("3");
        col.add("$");
        col.add("4");
        System.out.println(col);
        Iterator<String> it = col.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("$")) {
                it.remove();
            }
        }
        for (String s1: col
             ) {
            System.out.println(s1);
        }
    }
}