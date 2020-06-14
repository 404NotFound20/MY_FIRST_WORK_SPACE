package reflect;

public class Student {
    private String name;
    private int age;
    private String sex;

    public void hhhh(){
        System.out.println(this.name+" is  hhhhhhh......");
    }

    private void study(){
        System.out.println(this.name+" is  studing......");
    }
    private void study(int time){
        System.out.println(this.name+" is  studing......"+time+"hours");
    }
    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
