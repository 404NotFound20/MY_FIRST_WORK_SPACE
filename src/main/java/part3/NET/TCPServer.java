package part3.NET;

//tcp通信的客户端
//    ServerSocket（int part）：表示服务器端
//
//     成员方法：        accept（）监听并接受此套接字链接

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//
//
/*1。创建服务区对象socket，构造方法绑定端口号
*2。使用ServerSocket的accept获取请求客户端的对象scoket
* 使用socket成员方法getOutputStream与getINputStream分别获取输入输出流对象
 * 3，使用输入输出流对象进行读写
* 3，使用输入输出流对象进行读写
* 4，关闭socket，ServerSocket
*/
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);

        Socket socket=server.accept();

//获取客户端数据
        InputStream ips=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=ips.read(bytes);
        System.out.println(new String(bytes,0,len));

//向客户端写数据
        OutputStream ops=socket.getOutputStream();
        ops.write("收到".getBytes());

        socket.close();
        server.close();

    }
}
