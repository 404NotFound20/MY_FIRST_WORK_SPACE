package part1;

import java.sql.SQLOutput;

/**
 * @version 1.01 2019-10-2
 * @author zenghui
 */
public class StringTest {

    public static void main(String[] args) {

        String e="";//空字符串
        String greeting="HELLO";
        System.out.println(greeting);

        //切割
        String s=greeting.substring(0,3);
        System.out.println(s);

        //拼接
        String expletive="Expletive";
        String PG13="deleted";
        String message=expletive+PG13;
        System.out.println(message);

        greeting=greeting.substring(0,3)+"p!";
        System.out.println(greeting);

    }
}
