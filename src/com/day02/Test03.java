package com.day02;

import java.util.Scanner;
//输入一个IP地址，然后将4段数字分别输出
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个IP地址：");
        String str = scanner.nextLine();
        String regex = "\\.";//"."的正则表达式
        String[] s = str.split(regex);
        for(String m : s){
            System.out.println(m);
        }

    }
}
