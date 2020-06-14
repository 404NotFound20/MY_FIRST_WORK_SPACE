package JDK8.Demo02Lambda;

public class demo03Runnable {
    public static void startThread(Runnable runnable){
        new Thread(runnable).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->"+"线程启动了");
            }
        });
    }
}
