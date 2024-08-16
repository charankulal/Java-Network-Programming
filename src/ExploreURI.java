import java.net.URI;
import java.net.UnknownHostException;

public class ExploreURI {
    public  void main() throws UnknownHostException{

        try{
            URI webUri= new URI("https","en.wikipedia.org","/wiki/URI_normalization/","Normalization_Process");
            getURI(webUri);
        }
        catch (Exception e) {
        e.printStackTrace();
        }
        }




    static public void getURI(URI myUri){
        System.out.println(myUri.getAuthority());
        System.out.println(myUri.getPath());
        System.out.println(myUri.getHost());
        System.out.println(myUri.getPort());
        System.out.println(myUri.getScheme());
        System.out.println(myUri.getQuery());
    }
}