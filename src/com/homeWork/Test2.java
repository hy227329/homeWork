package com.homeWork;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("大家好！");
        //将"大家好!"修改为:"大家好!我是程序员!"并输出。
        sb.append("我是程序员！");
        System.out.println(sb);
        //然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
        sb.insert(6,"优秀的");
        System.out.println(sb);
        //然后再修改为:"大家好!我是牛牛的程序员!"并输出
        sb.replace(6,8,"牛牛");
        System.out.println(sb);
        //然后在修改为:"我是牛牛的程序员!"并输出
        sb.delete(0,4);
        System.out.println(sb);
    }
}
