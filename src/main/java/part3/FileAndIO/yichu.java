package part3.FileAndIO;

public class yichu {
    public static void main(String[] args) {
        int i=1;
        a(i);
    }

    private static void a(int i) {
        i+=1;
        System.out.println(i);
        a(i);
    }
}
