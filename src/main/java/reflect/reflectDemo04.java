package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectDemo04 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class personClass=Person.class;
        Method setmethod = personClass.getMethod("eat");
        Method setmethod2 = personClass.getMethod("eat", String.class);

        Person person=new Person();
        setmethod.invoke(person);
        setmethod2.invoke(person,"shit");

    }
}
