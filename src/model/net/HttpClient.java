package model.net;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.OfferEntity;
import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;

/**
 * @author serverliu on 2017/12/18.
 */
public class HttpClient {
    private OkHttpClient client = new OkHttpClient();
    private String Cookie = "";

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

    public void setCookie(String cookie) {
        Cookie = cookie;
    }

    public <T> T parseResponse(Class<T> entityClazz, Response response){
        try {
            if(response != null && response.body() != null) {
                String responseStr = response.body().string();
                responseStr = responseStr.replaceAll("\\\\\\\\\"","");

                System.out.println(entityClazz.getSimpleName()+"返回成功！");
                Gson gson = new GsonBuilder().serializeNulls().setLenient().create();
                return gson.fromJson(responseStr, entityClazz);
            } else {
                System.out.println("错误！返回列表为空！");
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
