import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class newSsl {
	public static void main(String[] args) throws Exception{

	String urlPagador = "https://www.google.com/";
	String cert = "-Djavax.net.ssl.trustStore=/usr/java/jdk1.6.0_24/jre/lib/security/cacerts ";
	URL verisign = new URL(urlPagador);
        System.out.println("Opening URL: " + verisign.toString());
        BufferedReader in = new BufferedReader(new InputStreamReader(verisign.openStream()));
        String inputLine;	
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
