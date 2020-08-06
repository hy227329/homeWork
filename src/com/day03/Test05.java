package com.day03;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身份证号: ");
        String id = scanner.nextLine();
        String regex = "\\d{18}";
        if(id.matches(regex) == false){
            System.out.println("格式错误，请重新输入: ");
            id = scanner.nextLine();
        }
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        //  通过String[]的substring方法来读取信息
        String yy1 = id.substring(6,10);          //出生的年份
        String mm1 = id.substring(10,12);       //出生的月份
        String dd1 = id.substring(12,14);         //出生的日期
        System.out.println("出生日期：");
        String birthday = yy1.concat("-").concat(mm1).concat("-").concat(dd1);
        Date date = sf.parse(birthday);
        System.out.println(sf.format(date));//1998-03-29
        int n = Integer.parseInt(yy1)+20;//将String转换为int
        String yy2 = Integer.toString(n);//将int转换为String
        System.out.println("20岁生日：");
        String birthday2 = yy2.concat("-").concat(mm1).concat("-").concat(dd1);
        Date date1 = sf.parse(birthday2);
        System.out.println(sf.format(date1));
        String[] array = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String week = sdf.format(date1);
        long time1 = date1.getTime();



    }
}
