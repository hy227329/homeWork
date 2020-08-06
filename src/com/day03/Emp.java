package com.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 *
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 *
 * 定义equals方法，要求只要名字相同，则认为内容一致。
 */
public class Emp {
    public static void main(String[] args) {
        //Date date1 = new Date();
        String s = "20060215";
        String s1 = "20010125";
        String s2 = "20120318";
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMdd");
        Date date1 = null;
        Date date2 = null;
        Date date3 = null;
        try {
            date1 = sf1.parse(s);
            date2 = sf1.parse(s1);
            date3 = sf1.parse(s2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String d1 = sf1.format(date1);
        String d2 = sf1.format(date2);
        String d3 = sf1.format(date3);


        //  System.out.println(date1);//Sat Feb 28 00:00:00 CST 1998
      //  System.out.println(sf1.format(date1));//1998-02-28 00-00-00 周六


        Collection<Person> col = new ArrayList<>();
        Calendar cal = Calendar.getInstance();



        Person p1 = new Person("张三",25,"男",5000,date1);
        Person p2 = new Person("李四",47,"男",10000,date2);

        col.add(p1);
        col.add(p2);
        System.out.println(col);

        System.out.println("------------------");
        Person p3 = new Person("张三",29,"女",8000,date3);
        boolean b = p1.equals(p3);
        System.out.println(b);
    }
}
class Person {
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hiredate;//入职时间

    public Person(String name, int age, String gender, int salary, Date hiredate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = hiredate;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, salary, hiredate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
}