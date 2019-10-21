package part1;

import com.sun.corba.se.impl.encoding.CodeSetConversion;

/**
 * This is the first sample program in Core Jave Chapter 3
 *
 * @version 1.01 2019-10-3
 * @author zhenghui
 */
public class FirstSample {
    public static void main(String[] args) {
        System.out.println("Hello Word !");

        //变量的声明与使用
        byte Bt=22;
        short Short=1000;
        int Int=100000;
        long Long=100000000;
        float Float=100;
        double Double=100;
        char Char=10;
        boolean Boolean=true;
        System.out.println("Bt is ："+Bt+" Short is ："+Short+"  Int is ："+Int+"  Long is ：" +Long+
                "  Float is ："+Float+"  Double is ："+Double+"  Char is ："+Char+"  Boolean is ："+Boolean);

        //常量的声明与使用  一般大写命名
        final int INT=1000;
        System.out.println("INT="+INT);
        System.out.println("-----------------");

        //运算与数学函数
        operationTest(4);
        System.out.println("-----------------");

        //数据类型转换
        dataTypeConversion();
        System.out.println("-----------------");


    }


    public static void operationTest (int x){
        int n=x;
        n=n++;
        System.out.println("n="+n+"   pai="+Math.PI);
    }

    public static void dataTypeConversion() {
        //合法转换
        int n=123456789;
        float f=n;       //f=1.23456792E8
        //强制转换
        double d=9.97;
        int D=(int)d;    //D=9
        //通过Math.round方法进行取整
        int DD=(int)Math.round(d);//DD=10
        System.out.println("f="+f+"  "+"D="+D+"DD="+DD);
    }
}
