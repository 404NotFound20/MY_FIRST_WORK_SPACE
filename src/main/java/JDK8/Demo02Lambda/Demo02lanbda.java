package JDK8.Demo02Lambda;

public class Demo02lanbda {
    public static void showLoger(int lever, MassageBuilder mb) {
        if (lever == 1) {
            System.out.println(mb.buildeMassage());
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "hello";
        String msg2 = "test";
        String msg3 = "lalalaal";
        showLoger(2, () -> {
            return msg1 + msg2 + msg3;
        });
    }
}
