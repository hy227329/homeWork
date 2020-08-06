package com.day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//使用Date输出当前系统时间，以及3天后这一刻的时间
public class Test01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date date = new Date();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss E");//E表示星期几
        //获得当前系统时间,并将其转换为字符串输出
        System.out.println("系统当前时间: " + sf.format(date));
        //3天后这一刻的时间
        cal.add(Calendar.DATE,3);
       //String s  = sf.format(cal.getTime());
       // System.out.println("三天后的时间: " + s);
        System.out.println("三天后的时间: " + sf.format(cal.getTime()));
    }
}
