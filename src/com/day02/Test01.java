package com.day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 */
public class Test01 {
    public static void main(String[] args) {
        //给定整数的正则表达式
        String regex = "\\d+";
        //给定小数的正则表达式
        String regex1 = "\\d+\\.\\d+";
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = s.nextLine();
        if(str.matches(regex)){
            int n = Integer.parseInt(str);//将字符串转换为整数类型
            System.out.println("整数：" + "n*10=" + (n*10));
        }else if(str.matches(regex1)){
            double d = Double.parseDouble(str);
            System.out.println("小数：" + "d*5=" + (d*5));
        }
        else{
            System.out.println("不是数字");
        }
    }
}
