package myclass;
import com.mysql.cj.xdevapi.JsonArray;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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

class JSONParsing{
    public static void main(String[] args) throws IOException, InterruptedException, ParseException {
        // HttpURLConnection
        HttpURLConnection httpURLConnection;
        URL url=new URL("https://jsonplaceholder.typicode.com/albums"); // API's URL
        httpURLConnection=(HttpURLConnection) url.openConnection(); // Opening connection
        httpURLConnection.setRequestMethod("GET"); // Setting request method
        int status=httpURLConnection.getResponseCode();
        System.out.println("Response Code: "+status); // Status 200 Success
        BufferedReader bufferedReader;
        String line;
        StringBuffer stringBuffer=new StringBuffer();
        bufferedReader=new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        while((line=bufferedReader.readLine()) != null){
            stringBuffer.append(line);
        }
        bufferedReader.close();
        org.json.JSONArray albums=new org.json.JSONArray(stringBuffer.toString());
        for (int i=0;i<albums.length();i++){
            JSONObject album = albums.getJSONObject(i);
            int id=album.getInt("id");
            int userid=album.getInt("userId");
            String title=album.getString("title");
            System.out.println("\n\nID: "+id+"\nUserID: "+userid+"\nTitle: "+title);
        }
    }

    }

