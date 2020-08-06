package com.homeWork;
/*检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上*/
public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder( "上海自来水来自海上");
        boolean b = sb.equals(sb.reverse());
        System.out.println(b);
    }
}
