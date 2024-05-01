import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class AccessingWebsiteCodesUsingBufferedReader {
    public static void main(String[] args) throws IOException {
        try {
            URL url= new URL("https://github.com/charankulal");
            URLConnection urlConnection= url.openConnection();
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line ;
            while ((line = bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
