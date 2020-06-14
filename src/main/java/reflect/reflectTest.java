package reflect;
/*
*
*
*
* * 案例：
* * 需求：写一个"框架"，不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
		* 实现：
			1. 配置文件
			2. 反射
		* 步骤：
			1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
			2. 在程序中加载读取配置文件
			3. 使用反射技术来加载类文件进内存
			4. 创建对象
			5. 执行方法*/

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.加载配置文件
        //1.1新建配置文件对象
        Properties properties=new Properties();
        //1.2加载配置文件，转换为集合
        //1.2.1获取class目录下的配置文件
        //类的作用就是根据一个指定的类的全限定名,找到对应的Class字节码文件,然后加载它转化成一个java.lang.Class类的一个实例.
        ClassLoader classLoader=reflectTest.class.getClassLoader();
        //默认则是从ClassPath根下获取，path不能以’/'开头，最终是由ClassLoader获取资源。
        InputStream inputStream=classLoader.getResourceAsStream("reflect.properties");
        properties.load(inputStream);
        //2 获取配置文件的数据
        String className=properties.getProperty("className");
        String methodName=properties.getProperty("methodName");

        //3 加载类进入内存
        Class cls=Class.forName(className);
        //4.创建对象
        Object object=cls.newInstance();
        //5.获取对象方法
        Method method=cls.getDeclaredMethod(methodName);
        method.setAccessible(true);
        //6.执行方法
        method.invoke(object);
    }
}
