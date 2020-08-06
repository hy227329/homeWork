package com.homeWork;

import java.util.Scanner;

// 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
public class Test4 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入email地址：");
         String str = sc.nextLine();
         if(str.indexOf("@") < 1){
             System.out.println("缺少@或用户名不存在");
         }else{
             String username = str.substring(0,str.indexOf("@"));
             System.out.println(username);
         }
     }
}
