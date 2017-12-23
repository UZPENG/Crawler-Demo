package model;


import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;

/**
 * @author serverliu on 2017/12/18.
 */
public class HttpClient {
    private OkHttpClient client = new OkHttpClient();
    private String Cookie = "auth=381de45adfdcfdc9d05b0ae8180d3f48bf760f4a";


    public Response request(String url){
        Request request =  new Request.Builder()
                .url(url)
                .addHeader("Cookie",Cookie)
                .get()
                .build();

        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
