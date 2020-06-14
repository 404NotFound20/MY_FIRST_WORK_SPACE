package part3.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*输出字节流超类：IntputStream
        子类共性方法：
        close（）关闭输入流并释放系统资源
        flush（）刷❤输出流并强制任何缓冲的输出字节被写出
        int read（）读取一个字节返回，并下移指针，若是到了最后一个字节，输出-1
        int read（byte[] b）顺序读取放入数组，满了就下移指针，返回为读取有效个数，最后返回-1
        read（byte[] b,int off,int len）将b的len字节从偏移量off开始写入输出流

    FileOutputStream：文件字节输出流
        构造方法：FileInputStream（String name）创建指定
                FileInputStream（File file）
                追加写
                FileInputStream（String name，boolean append）  append：是否追加
                FileInputStream（File file，boolean append）

            创建FileIntputStream对象  将FileInputStream对象指向创建好的文件
                */
public class demo02InputStream {
    public static void main(String[] args) throws IOException {
        //input();
        inputMore();
    }

    public  static  void  input () throws IOException {
        FileInputStream fis=new FileInputStream("B.txt");
//        for (int i=1;i<90;i++){
//            int in=fis.read();
//            System.out.println(in);
//        }
        int len=0;
        while ((len=fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();
    }

    public static void inputMore() throws IOException {
        FileInputStream fis=new FileInputStream("B.txt");
        int len=0;
        while ((len=fis.read())!=-1){
            byte[] bytes=new byte[10];
            len =fis.read(bytes);
            System.out.println("读取有效数为："+len);
            System.out.println(len);
            System.out.println(bytes);
            System.out.println("字节码数组："+Arrays.toString(bytes));

            System.out.println(new String(bytes,0,len));//去除无效位
        }
        fis.close();

    }
}
