package com.day02;
//将字符串"123abc456def789ghi"中的英文部分替换为"#char#"
public class Test04 {
    public static void main(String[] args) {
        String str = "123abc456def789ghi";
        String regex = "\\D{3}";//正则表达式，将字符串中的英文部分替换掉
        str=str.replaceAll(regex,"#char#");
        System.out.println(str);
    }
}
