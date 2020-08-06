package com.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/*
要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入员工数量: ");
        int n = scanner.nextInt();
        Collection col = new ArrayList();
        for(int i=0;i<n;i++){
            System.out.println("请输入员工信息:");
            String input = scanner.nextLine().trim();
            String[] arr = input.split(",");
            String name = arr[0];
            int age = Integer.parseInt(arr[1]);
            String gender = arr[2];
            int salary = Integer.parseInt(arr[3]);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date hiredate = sdf.parse(arr[4]);
            Emp1 e = new Emp1(name,age,gender,salary,hiredate);
            boolean check = col.contains(e);
            if(check){
                System.out.println("该用户已存在");
            }else{
                col.add(e);
            }
        }
        //输出每个员工信息
        System.out.println(col);

    }
}
class Emp1{
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hiredate;

    public Emp1(String name, int age, String gender, int salary, Date hiredate) {
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