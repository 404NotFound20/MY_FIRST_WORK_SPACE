package part1;

import java.sql.SQLOutput;

/**
 * @author zenghui
 * @version 1.01 2019-10-2
 */
public class StringTest {

    public static void main(String[] args) {
        String str = new String("ahjsbjdbaabczxabcbfhilefksaaa");
        String X = new String("a");
        int amount = acountForA(str, X);
        System.out.println("字符串:"+str+"中"+"包含"+amount+"个"+X);
    }

    /**
     * 返回字符串中的X数量
     *
     * @param str
     * @return
     */
    protected static int acountForA(String str, String X) {
        if (str.isEmpty()) {
            return 0;
        }
        char[] StrArr = str.toCharArray();
        char x = X.charAt(0);
        int count = 0;
        for (int index = 0; index < str.length(); index++) {
            if (StrArr[index] == x)
                count++;
        }
        return count;

    }

    protected void stringTest() {
        String e = "";//空字符串
        String greeting = "HELLO";
        System.out.println(greeting);

        //切割
        String s = greeting.substring(0, 3);
        System.out.println(s);

        //拼接
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println(message);

        greeting = greeting.substring(0, 3) + "p!";
        System.out.println(greeting);
    }
}
