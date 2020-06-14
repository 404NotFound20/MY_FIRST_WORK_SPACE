package JDK8.FunctionalInterface;
/*
* Override检测是否为重写方法
*
*
* */
public class myFunctionInterfaceImpl implements myFunctionInterface {
    @Override
    public void method() {
        System.out.println("重写");
    }

}
