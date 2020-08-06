package com.homeWork;

public class Test1 {
    public static void main(String[] args) {
        //1:输出字符串"HelloWorld"的字符串长度
        String str = "HelloWorld";
        String str1 = "  Hello   ";
        method1(str); //10

        //2:输出"HelloWorld"中"o"的位置
        method2(str);//4

        // 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
        method3(str); //6

        //4:截取"HelloWorld"中的"Hello"并输出
        method4(str); //Hello

        //5:截取"HelloWorld"中的"World"并输出
        method5(str); //World

        //6:将字符串"  Hello   "中两边的空白去除后输出
        method6(str1);

        //7:输出"HelloWorld"中第6个字符"W"
        method7(str);

        //8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
        method8(str);

        //9:将"HelloWorld"分别转换为全大写和全小写并输出。
        method9(str);
    }
    //1:输出字符串"HelloWorld"的字符串长度
    public static void method1(String str){
        System.out.println(str.length());
    }

    //2:输出"HelloWorld"中"o"的位置
    public static void method2(String str){
        int index = str.indexOf("o");
        System.out.println("IndexOf: " + index);
    }

    // 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
    public static void method3(String str){
        int index = str.indexOf("o",5);
        System.out.println("IndexOf: " + index);
    }

    //4:截取"HelloWorld"中的"Hello"并输出
    public static void method4(String str){
        String s = str.substring(0,5);
        System.out.println("subString: " + s);
    }

    //5:截取"HelloWorld"中的"World"并输出
    public static void method5(String str){
        String s1 = str.substring(5);
        System.out.println("subString: " + s1);
    }

    //6:将字符串"  Hello   "中两边的空白去除后输出
    public static void method6(String str1){
        String s2 = str1.trim();
        System.out.println("trim: " + s2);
    }

    //7:输出"HelloWorld"中第6个字符"W"
    public static void method7(String str){
        char c = str.charAt(5);
        System.out.println("charAt: " + c);
    }

    //8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
    public static void method8(String str){
        boolean b = str.startsWith("h");
        boolean b1 = str.endsWith("ld");
        System.out.println("startsWith: " + b);//false
        System.out.println("endsWith: " + b1);//true
    }

    //9:将"HelloWorld"分别转换为全大写和全小写并输出。
    public static void method9(String str){
        String s3 = str.toUpperCase();
        String s4 = str.toLowerCase();
        System.out.println("toUpperCase: " + s3);
        System.out.println("toLowerCase: " + s4);
    }
}
