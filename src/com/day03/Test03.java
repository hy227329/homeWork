package com.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个人的生日，格式为\"yyyy-MM-dd\": ");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = scanner.next();//定义输入的生日时间字符串
        Date birDate = sf.parse(birthday);//将定义输入的生日时间字符串改为"yyyy-MM-dd"格式
        Date nowDate = new Date();//获取当前时间
        long time = nowDate.getTime()-birDate.getTime();//用当前时间减去输入的生日时间
        long week = time/1000/60/60/24/7;//将当前时间减去输入的生日时间的时间差转换为以周为单位
        System.out.println("到现在为止经过了多少周: " + week);

    }
}
