package part3.IO;
//数据源：B.txt-----C.txt

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

public class demo03Copy {
    public static void main(String[] args) throws IOException {
        copyOne("B.txt", "C.txt");
        copyMore("B.txt", "C.txt");


    }

    public static void copyOne(String from, String to) throws IOException {
        FileInputStream fir = new FileInputStream(from);
        FileOutputStream fos = new FileOutputStream(to);
        long s = System.currentTimeMillis();
        int len = 0;
        //单字节复制
        while ((len = fir.read()) != -1) {
            fos.write(len);
        }
        fos.close();
        fir.close();
        long e = System.currentTimeMillis();
        System.out.println("耗时：" + (e - s) + "ms");
    }

    public static void copyMore(String from, String to) throws IOException {
        FileInputStream fir = new FileInputStream(from);
        FileOutputStream fos = new FileOutputStream(to);
        long s = System.currentTimeMillis();
        int len = 0;
        byte[] bytes = new byte[1024];
        //数组缓冲复制
        while ((len = fir.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fir.close();
        long e = System.currentTimeMillis();
        System.out.println("耗时：" + (e - s) + "ms");

    }
}
