package com.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个生产日期,格式为\"yyyy-MM-dd\": ");
        String str = scanner.nextLine();
        System.out.println("输入一个数字(保质期的天数): ");
        int day = scanner.nextInt();
        Date createDate = sf.parse(str);//从给定字符串的开始解析文本，以生成一个日期。
     //   System.out.println("字符串:" + sf.format(createDate));
        long time1 = createDate.getTime();//将时间从date类型，转换成了long类型表示的毫秒值
       //  System.out.println("将时间从date类型: " + time1);
        Date nowDate = new Date();//获取当前的时间
        long pastTime = nowDate.getTime() - createDate.getTime();//获得输入日期到现在的毫秒值
        long pastDays = pastTime / (1000 * 60 * 60 * 24);//获取天数
        long time2 = 24*60*60*1000*day;//将保质期天数转换成毫秒值表示
       // System.out.println(time2);
        long time = time1 + time2;//过期时间
        //把过期日期的毫秒值转化为日期格式
        Date pastDueDate = new Date(time);
        System.out.println("过期日期为: " + sf.format(pastDueDate));
        if (pastDays == day) { //看过去的天数是否等于保质期天数
            System.out.println("你所购买的商品已过期！");
        }else{
            //计算促销日期的毫秒值
            long promoteSaleDateTime = time - (24*60*60*1000*11);
            Date promoteSaleDate = new Date(promoteSaleDateTime);

            System.out.println("该产品促销日期为" + sf.format(promoteSaleDate));
        }
    }
}
