package com.day02;

import java.util.Scanner;

/*
要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入员工信息：");
        String str = scanner.nextLine();
        String regex = ";";
        //按照";"拆分每个员工信息
        String[] s = str.split(regex);
        //按照拆分的员工信息的个数创建对应长度的数组
        Person[] personArr = new Person[s.length];

        for (int i = 0; i < personArr.length; i++) {
            String personInfo = s[i];//获取每一个person对象
            //按照","拆分每个员工的各项信息
            String arr[] = personInfo.split(",");
            String name = arr[0];
            int age = Integer.parseInt(arr[1]);
            String gender = arr[2];
            int salary = Integer.parseInt(arr[3]);
            //new 一个Person对象
            Person p = new Person(name,age,gender,salary);
            personArr[i] = p;
        }
        System.out.println("解析之后的结果：");
        for (int i = 0; i < personArr.length; i++) {
            System.out.println(personArr[i]);
        }
    }
}
class Person{
    private String name;
    private int age;
    private String gender;
    private int salary;


    //无参构造器

    public Person() {
        super();
    }

    //有参构造器
    public Person(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
//使用forEach循环
/*
Scanner scanner = new Scanner(System.in);
        System.out.println("请输入员工信息：");
        String str = scanner.nextLine();
        String regex = ";";
        //按照";"拆分每个员工信息
        String[] ss = str.split(regex);
        for(String s : ss){
        //按照","拆分每个员工的属性
        String[] at = s.split(",");
        //创建一个person对象
        Person per = new Person();
        String name = arr[0];
            int age = Integer.parseInt(arr[1]);
            String gender = arr[2];
            int salary = Integer.parseInt(arr[3]);
            System.out.println(per);
            }
 */