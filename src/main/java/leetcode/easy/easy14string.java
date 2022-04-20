package leetcode.easy;

/**
 * @Classname 14. 最长公共前缀
 * @Description TODO
 * @Date 2022/4/20 22:25
 * @Created by zenghui
 */
public class easy14string {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length == 0) {
            return "";
        }
        //随便取一个基准字符串
        String lessstr = strs[0];
        //遍历全部
        int j;
        for (String str : strs) {
            //最长公共前缀肯定等于最短长度
            for (j = 0; j < str.length() && j < lessstr.length(); j++) {
                if (lessstr.charAt(j) != str.charAt(j)) {
                    break;
                }
            }
            lessstr = lessstr.substring(0, j);
            if (lessstr.length() == 0) {
                lessstr = "";
            }
        }
        return lessstr;
    }

    public static void main(String[] args) {
        easy14string easy14string = new easy14string();
        String[] strs = {"a", "a", "aabc", "aa", "acc"};
        String ss = easy14string.longestCommonPrefix(strs);
        System.out.println(ss);
    }
}
