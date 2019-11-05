package part3.FileAndIO;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

/**
 * file类：访问系统文件和目录，无法处理文件内容
 * 绝对路径：
 * 相对路径：
 **/
public class FileTest {

    public static void main(String[] args) throws IOException {
        //创建file对象：当前路径
        File file = new File(".");

        //相关函数操作
        System.out.println("文件名" + file.getName());
        System.out.println("绝对路径file：" + file.getAbsoluteFile());
        System.out.println("绝对路径名string：" + file.getAbsolutePath());
        System.out.println("上一级string：" + file.getParent());//把.删除了就是null。。。。

        //创建临时文件
        File tmpFile = File.createTempFile("name", ".text", file);
        //推出jvm时删除
        tmpFile.deleteOnExit();


        System.out.println(System.currentTimeMillis());
        //以系统时间来建立新文件
        File newFile = new File(System.currentTimeMillis() + "测试文件");
        System.out.println("newFile对象是否存在：" + newFile.exists());
        newFile.createNewFile();
        System.out.println("创建新文件结果："+ newFile.mkdir());


        String[] fileList = file.list();
        System.out.println("====当前路径所有文件路径====");
        for (String filename : fileList) {
            System.out.println(filename);
        }
        File[] roots = File.listRoots();
        System.out.println("====系统所有根目录====");
        for (File root : roots) {
            System.out.println(root);
        }

        newFile.deleteOnExit();


    }
}
