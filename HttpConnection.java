
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

class HttpConnection{
    public static void main(String[] args) throws IOException, InterruptedException {
        // HttpURLConnection
        HttpURLConnection httpURLConnection;
        URL url=new URL("https://jsonplaceholder.typicode.com/users"); // API's URL
        httpURLConnection=(HttpURLConnection) url.openConnection(); // Opening connection
        httpURLConnection.setRequestMethod("GET"); // Setting request method
        int status=httpURLConnection.getResponseCode();
        System.out.println(status); // Status 200 Success
        BufferedReader bufferedReader;
        String line;
        StringBuffer stringBuffer=new StringBuffer();
        bufferedReader=new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        while((line=bufferedReader.readLine()) != null){
            stringBuffer.append(line);
        }
        System.out.println(stringBuffer);
        //HttpClient
        HttpClient httpClient=HttpClient.newHttpClient();
        HttpRequest httpRequest=HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/users")).build();
        httpClient.sendAsync(httpRequest,HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println).join();
    }
}

