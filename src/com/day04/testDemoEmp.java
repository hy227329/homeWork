package com.day04;


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
 *    张三,25,男,5000,2006-02-15
 *
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 */
public class testDemoEmp {
    public static void main(String[] args) {
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
      //  String d1 = sf1.format(date1);
      //  String d2 = sf1.format(date2);
       // String d3 = sf1.format(date3);

        Collection<Emp> col = new ArrayList<>();
        Calendar cal = Calendar.getInstance();



        Emp p1 = new Emp("张三",25,"男",5000,date1);
        Emp p2 = new Emp("李四",47,"男",10000,date2);

        col.add(p1);
        col.add(p2);
        System.out.println(col);

        System.out.println("------------------");
        Emp p3 = new Emp("张三",25,"女",8000,date3);
        boolean b = p1.equals(p3);
        System.out.println(b);
    }
}
class Emp{
  private String name;
  private int age;
  private String gender;
  private int salary;
  private Date hiredate;

    public Emp(String name, int age, String gender, int salary, Date hiredate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Emp{" +
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
        Emp emp = (Emp) o;
        return age == emp.age &&
                Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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