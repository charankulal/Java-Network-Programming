import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class JavaNIOClasses {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress websiteIpAddress= InetAddress.getByName("www.google.com");
//        FileChannel; --UDP
//        DatagramChannel; --UDP
//        SocketChannel; --TCP
//        ServerSocketChannel; --TCP
    }
}
