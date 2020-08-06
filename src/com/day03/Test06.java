package com.day03;

import java.util.ArrayList;
import java.util.Collection;

/*创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素*/
public class Test06 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("one");
        col.add("two");
        col.add("three");
        System.out.println("存放字符串后集合中元素的个数： " + col.size());
        boolean b = col.contains("four");
        System.out.println("该集合是否包含字符串four: " + b);
        boolean b1 = col.isEmpty();
        System.out.println("集合是否为空: " + b1);
        col.clear();
        System.out.println("清空集合后其中中元素的个数： " + col.size());
        boolean b2 = col.isEmpty();
        System.out.println("清空集合后集合是否为空: " + b2);
    }
}
