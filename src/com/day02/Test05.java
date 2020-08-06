package com.day02;

import java.util.Scanner;

/*
实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个文件名称：");
        String str = scanner.nextLine();
        String regex = "\\.";//按照"."将文件名与文件格式拆分开来组成一个数组，然后·再将index=0的位置改成当前系统时间毫秒值
        String[] s = str.split(regex);
        str = System.currentTimeMillis() + "." + s[1];
        System.out.println(str);
    }
}
//切割
//String s = str.subString(0,atr.indexOf(".")//从"."开始获取到最后的的位置
//str = System.currentTimeMillis() + s
//替换1
//str = str.replace("abc",time + "");
//替换2
//str = str.replaceAll("[a-z]+\\.",time + ".");