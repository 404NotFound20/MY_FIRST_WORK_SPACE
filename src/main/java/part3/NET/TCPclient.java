package part3.NET;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.SocketHandler;

//tcp通信的客户端
//    Socket（String host，int part）：表示客户端
//      套接字：包含IP地址与端口号的网络单位
//     成员方法：
//
//
/*1。创建客户端对象socket，构造方法绑定服务区的ip与端口
*2。使用socket成员方法getOutputStream与getINputStream分别获取输入输出流对象
* 3，使用输入输出流对象进行读写
* 4，关闭socket
*
*
* */
public class TCPclient {

    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
//发送
        OutputStream ops=socket.getOutputStream();
        ops.write("hello,服务区".getBytes());

//接受
        InputStream ips=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=ips.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.close();


    }




}
