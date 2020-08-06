package com.day04;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个日期: ");
        String str1 = scanner.nextLine();
        System.out.println("请输入第二个日期: ");
        String str2 = scanner.nextLine();
        System.out.println("请输入第三个日期: ");
        String str3 = scanner.nextLine();
        Date date1 = sf.parse(str1);
        Date date2 =  sf.parse(str2);
        Date date3 =  sf.parse(str3);
        List list = new ArrayList();
        list.add(date1);
        list.add(date2);
        list.add(date3);
        Collections.sort(list);
        System.out.println(list);
    }
}
