package day7;
//基本异常
import com.sun.javafx.tools.packager.PackagerException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException */{
//        Exception
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//用于格式化日期
        Date data= null;//将字符串日期解析为data格式
        try {
            //可能会出现异常的代码
            data = ((SimpleDateFormat) sdf).parse("1999-0909");
        } catch (ParseException e) {
            //异常处理代码
            e.printStackTrace();
        }
        System.out.println(data);
        System.out.println("异常处理后");

    }
}
