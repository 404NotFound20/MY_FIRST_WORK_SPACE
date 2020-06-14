package JDK8.FunctionalInterface;

/*
 * 函数式接口的使用
 * */
public class Demo {
    //新建方法，参数为函数式接口
    public static void show(myFunctionInterface my) {
        my.method();
    }

    public static void main(String[] args) {
        //使用show方法，参数是一个接口，可new一个接口的实现类对象
        show(new myFunctionInterfaceImpl());

        //使用show方法，参数是一个接口，可以用匿名内部类
        show(new myFunctionInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写接口的方法");
            }
        });
        //使用show方法，参数是一个函数式接口，可以用lambda
        show(() -> {
            System.out.println("lambda重写接口方法");
        });

        //简化
        show(() -> System.out.println("lambda重写接口方法"));


    }
}
