package com.homeWork;


import java.util.Arrays;
import java.util.Scanner;

/** 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。*/
public class Test5 {
    public static void main(String[] args) {
        char[] arr = m1();
        String s = new String(arr);//将字符数组转换为字符串
        System.out.println(s);
        Scanner console = new Scanner(System.in);
        System.out.println("请输入验证码：");
        String str = console.next();
        if(str.equalsIgnoreCase(s)){
            System.out.println("验证成功");
        }else{
            System.out.println("验证码错误");
        }
    }
    //随机生成5个大小写混乱的字母
    public static char[] m1(){
        char[] c = new char[5];
        for (int i = 0; i < c.length; i++) {
            if(i % 2 == 0){
                c[i] = (char)(Math.random()*26+65);
            }else{
                c[i] =(char)(Math.random()*26+97);
            }
        }
        return c;
    }
}
