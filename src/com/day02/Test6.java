package com.day02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

/*
定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * 定义全参数(该构造方法的参数用于设置所有属性)构造方法与默认构造方法
 * 重写toString方法，返回字符串格式如:"张三,25,男,5000"
 * 重写equals方法，要求名字相同就认为内容一致。
 */
public class Test6 {
    public static void main(String[] args) {
        Collection<Person1> col = new ArrayList<>();
        Person1 p1 = new Person1("张三",25,"男",5000);
        Person1 p2 = new Person1("李四",30,"男",8000);

        col.add(p1);
        col.add(p2);
        System.out.println(col);

        Person1 p3 = new Person1("张三",26,"女",6000);
        boolean b = p1.equals(p3);
        System.out.println(b);



    }
}
//定义全参数(该构造方法的参数用于设置所有属性)构造方法
class Person1{
    private String name;
    private int age;
    private String gender;
    private int salary;

    public Person1(String name, int age, String gender, int salary) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person = (Person1) o;
        return Objects.equals(name, person.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, salary);
    }
}
