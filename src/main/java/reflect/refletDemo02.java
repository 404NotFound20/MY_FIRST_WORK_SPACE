package reflect;

import java.lang.reflect.Field;

public class refletDemo02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取class
        Class cle = Person.class;
//只能获取public
        //获取public修饰的成员变量
        Field[] fields = cle.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("---------");
        //获取类的特定成员变量
        Field filed = cle.getField("a");
        //创建类
        Person p = new Person();
        //从构造的类中获取改成员变量对象
        Object value = filed.get(p);
        System.out.println(value);
        System.out.println(p.a);
        //对类p设置a变量值
        filed.set(p,"a");
        System.out.println(p);

        System.out.println("-----------------");
//获取全部
        System.out.println("Field[] getDeclaredFields:获取所有成员变量，都可修改");
        Field[] declaredFields = cle.getDeclaredFields();
        for (Field field:declaredFields){
            System.out.println(field);
        }
        System.out.println("Field getDeclaredField():获取特定成员变量，都可修改");
        Field name=cle.getDeclaredField("name");
        System.out.println("暴力反射");
        //忽略访问权限的安全检测
        name.setAccessible(true);
        Object value2=name.get(p);
        System.out.println(value2);


    }
}
