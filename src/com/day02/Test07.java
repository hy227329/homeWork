package com.day02;

import java.util.Scanner;

/*
输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数学表达式：");
        String str = scanner.nextLine();
        int index = -1;
        if((index=str.indexOf("+"))>0){
            double[] d = new double[2];
            d[0] = Double.parseDouble(str.substring(0,index));
            d[1] = Double.parseDouble(str.substring(index+1));
            System.out.println(str + "=" + (d[0]+d[1]));
        }if((index=str.indexOf("*-"))>0){
            double[] d = new double[2];
            d[0] = Double.parseDouble(str.substring(0,index));
            d[1] = Double.parseDouble(str.substring(index+1));
            System.out.println(str + "=" + (d[0]-d[1]));
        }if((index=str.indexOf("*"))>0){
            double[] d = new double[2];
            d[0] = Double.parseDouble(str.substring(0,index));
            d[1] = Double.parseDouble(str.substring(index+1));
            System.out.println(str + "=" + (d[0]*d[1]));
        }if((index=str.indexOf("/"))>0){
            double[] d = new double[2];
            d[0] = Double.parseDouble(str.substring(0,index));
            d[1] = Double.parseDouble(str.substring(index+1));
            if(d[1] == 0){
                System.out.println("除数不能为零");
                return;
            }
            System.out.println(str + "=" + (d[0]/d[1]));
        }

    }
}
