package leetcode.jianZhiOffer.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Classname Solution05
 * @Description TODO
 * @Date 2022/7/4 22:26
 * @Created by zenghui
 */
/* 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

示例 1：

输入：s = "We are happy."
输出："We%20are%20happy."

限制：

0 <= s 的长度 <= 10000
 */
public class Solution05 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("3 232  3算法是的 2"));
        System.out.println(replaceSpace2("3 232  3算法是的 2"));

    }

    public static String replaceSpace(String s) {
        String[] list= s.split("");
        String a="";
        for (int i=0;i<list.length;i++){
            if (" ".equals(list[i])){
                list[i]="%20";
            }
            a=a+list[i];
        }
        return a;
    }
/*
StringBuilder
Character
toCharArray
 */
    public static String replaceSpace2(String s) {
        StringBuilder res=new StringBuilder();
        for (Character c:s.toCharArray()){
            if(c==' '){
                res.append("%20");
            }
            else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
