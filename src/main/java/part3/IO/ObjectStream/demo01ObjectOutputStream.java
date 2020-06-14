package part3.IO.ObjectStream;

import java.io.*;

public class demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("person.txt"));
        oos.writeObject(new Person("美女",18));
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("person.txt"));
        Object o=ois.readObject();
        System.out.println(o);
        ois.close();
    }

}
