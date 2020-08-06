package com.homeWork;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3*/
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入表达式");

        String str = scanner.nextLine();
        int index = -1;//符号所在的位置
        if((index = str.indexOf("+"))>0){
            int[] arr = new int[2];
            arr[0] = Integer.parseInt(str.substring(0,index));
            arr[1] = Integer.parseInt(str.substring(index+1));
            System.out.println(str + "=" + (arr[0] + arr[1]));
        }if((index = str.indexOf("-"))>0){
            int[] arr = new int[2];
            arr[0] = Integer.parseInt(str.substring(0,index));
            arr[1] = Integer.parseInt(str.substring(index+1));
            System.out.println(str + "=" + (arr[0] - arr[1]));
        }if((index = str.indexOf("*"))>0){
            int[] arr = new int[2];
            arr[0] = Integer.parseInt(str.substring(0,index));
            arr[1] = Integer.parseInt(str.substring(index+1));
            System.out.println(str + "=" + (arr[0] * arr[1]));
        }if((index = str.indexOf("/"))>0){
            int[] arr = new int[2];
            arr[0] = Integer.parseInt(str.substring(0,index));
            arr[1] = Integer.parseInt(str.substring(index+1));
            if(arr[1] == 0){
                System.out.println("除数不能为零");
                return;
            }
            System.out.println(str + "=" + (arr[0] / arr[1]));
        }

        }

}
