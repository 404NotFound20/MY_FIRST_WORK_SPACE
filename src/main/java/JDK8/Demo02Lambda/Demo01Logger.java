package JDK8.Demo02Lambda;

import java.util.SimpleTimeZone;

//日志案例
/*
* 若lever不为1，日志信息却已经拼接好了，无法输出，存在性能浪费
*
* */

public class Demo01Logger {
    public static void showLog(int lever, String message){
        //对日志进行分级输出
        if (lever==1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1="hello";
        String msg2="test";
        String msg3="lalalaal";
        showLog(1,msg1+msg2+msg3);

    }
}
