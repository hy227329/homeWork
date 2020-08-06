package com.day02;

import java.util.Arrays;

//将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
public class Test02 {
    public static void main(String[] args) {
        String str = "123,456,789,012";
        String regex = ",";
        String[] s1 = str.split(regex);
        for(String s2 : s1){//使用forEach遍历数组
            System.out.println(s2);
        }
    }
}
