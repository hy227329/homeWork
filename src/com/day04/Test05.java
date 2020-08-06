package com.day04;

import java.util.ArrayList;
import java.util.List;

/*
创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 */
public class Test05 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        Integer[] b = new Integer[list.size()];
        b = (Integer[])list.toArray(b);
        for (Integer i:b
             ) {
            System.out.println(i);
        }

    }
}
