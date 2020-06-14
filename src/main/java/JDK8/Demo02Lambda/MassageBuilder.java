package JDK8.Demo02Lambda;


@FunctionalInterface
public interface MassageBuilder {
    //定义一个抽象类 返回被拼接的消息
    public abstract String buildeMassage();
}
