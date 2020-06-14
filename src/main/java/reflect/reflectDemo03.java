package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflectDemo03 {
    public reflectDemo03() {
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
         * 2. 获取构造方法们
         * Constructor<?>[] getConstructors()
         * Constructor<T> getConstructor(类<?>... parameterTypes)

         * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
         * Constructor<?>[] getDeclaredConstructors()
         *
         * */

        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class);
        System.out.println(constructor);
        //构造方法构造类
        Object Person = constructor.newInstance("zhan");
        System.out.println(Person);
         //空参构造
        Constructor constructor2 = personClass.getConstructor();
        Object Person1= constructor2.newInstance();
        System.out.println(Person1);


    }
}
