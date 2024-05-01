import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GettingIpFromDomain {
    public static void main(String[] args) throws IOException {
        InetAddress websiteIpAddress= InetAddress.getByName("www.google.com");
//        System.out.println(websiteIpAddress);
        System.out.println("Host Name: "+websiteIpAddress.getHostName());
        System.out.println("Host Address: "+websiteIpAddress.getHostAddress());
        System.out.println("Canonical Host Name: " +websiteIpAddress.getCanonicalHostName());
        try {
            System.out.println("Is Reachable: "+websiteIpAddress.isReachable(10000));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}