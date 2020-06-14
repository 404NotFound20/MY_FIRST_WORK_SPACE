package reflect;


public class Person {
    private String name;


    public void eat() {
        System.out.println("eating......");
    }
    public void eat(String food) {
        System.out.println("eating......"+food);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }

    private int age;
    public String a;
    protected String b;
    private String c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String a, String b, String c) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}
