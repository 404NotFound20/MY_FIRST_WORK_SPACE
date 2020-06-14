package part3.IO.ObjectStream;

import java.io.Serializable;

/*
* 未实现序列化接口无法进行序列化功能
*
*
* */
public class Person implements Serializable {
    private static String name;
    private static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age){

    }
}
