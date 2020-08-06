package com.day04;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/*
要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入相应员工信息: ");
        String str = scanner.nextLine();
        Collection col = new ArrayList();
        for(int i=0;i<str.length();i++) {
            System.out.println("请输入员工信息:");
            String input = scanner.nextLine().trim();
            String[] arr = input.split(",");
            String name = arr[0];
            int age = Integer.parseInt(arr[1]);
            String gender = arr[2];
            int salary = Integer.parseInt(arr[3]);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date hiredate = sdf.parse(arr[4]);
            Emp2 e = new Emp2(name, age, gender, salary, hiredate);
        }
    }
}
class Emp2{
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hiredate;

    public Emp2(String name, int age, String gender, int salary, Date hiredate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                '}';
    }
}