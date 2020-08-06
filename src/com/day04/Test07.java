package com.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 */
public class Test07 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(23);
        list.add(12);
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(14);
        Collections.sort(list);
        System.out.println(list);
    }
}
