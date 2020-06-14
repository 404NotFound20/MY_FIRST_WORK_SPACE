package reflect;

/*
*
* 1,Class.forName("全类名")：字节码文件加载入内存，返回class对象
2.类名.class：通过类名属性class获取
3.对象.getClass():此方法在Object类中定义

*/
public class reflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1= Class.forName("reflect.Person");
        System.out.println(cls1);

        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        Person p=new Person("ASD",1);
        Class cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls1==cls2);
        System.out.println(cls2==cls3);
        System.out.println(cls1==cls3);

    }
}
