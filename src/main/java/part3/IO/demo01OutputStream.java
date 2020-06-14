package part3.IO;
/*输出字节流超类：OutputStream
        子类共性方法：
        close（）关闭输出流并释放系统资源
        flush（）刷❤输出流并强制任何缓冲的输出字节被写出
        write（byte[] b）将字节数组写入输出流
        write（byte[] b,int off,int len）将b的len字节从偏移量off开始写入输出流

    FileOutputStream：文件字节输出流
        构造方法：FileOutputStream（String name）创建指定
                FileOutputStream（File file）
                追加写
                FileOutputStream（String name，boolean append）  append：是否追加
                FileOutputStream（File file，boolean append）
                换行：
                        win：\r \n
                        linux: /n
                        mac:/r


            创建FileOutputStream对象 根据路径创建空文件  将FileOutputStream对象指向创建好的文件

    写入原理：（内存到硬盘）
        java程序---jvm  --os---os调用写方法---写入

    使用步骤
        创建流对象
        调用方法使用
        释放资源

*
*
*
*
*
*
* */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo01OutputStream {

    public static void main(String[] args) throws IOException {
        //创建
        FileOutputStream fos=new FileOutputStream("a.txt");
        //写入一个字节
        fos.write(67);
        //释放
        fos.close();



        FileOutputStream fosB=new FileOutputStream(new File("B.txt"));
        //写多个
        byte[] bytes={45,45,65,76,34};
        fosB.write(bytes);
        // 写一部分
        fosB.write(bytes,2,3);
        //写字符串
        byte[] bytes1="字符串".getBytes();
        fosB.write(bytes1);
        fosB.close();


        //续写
        FileOutputStream fosc=new FileOutputStream(new File("B.txt"),true);
        byte[] bytesc="追加字符串".getBytes();
        fosc.write(bytesc);
        fosc.close();


        //续写
        FileOutputStream fosd=new FileOutputStream(new File("B.txt"),true);
        for (int i=0;i<5;i++){
            fosd.write("换行".getBytes());
            fosd.write("\r\n".getBytes());
        }
        fosd.close();


    }
}
