package model;


import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;

/**
 * @author serverliu on 2017/12/18.
 */
public class HttpClient {
    private OkHttpClient client = new OkHttpClient();
    private String Cookie = "auth=323d741977c3205171ae4f235c34a1f2fbf7eaf0";


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


    public Response RequestUnSale(String url, JSONObject para){
        String actualUrl = url + "&" + Key.insertDate +"=" +
                para.opt(Key.insertDate) + "&" + Key.pageNo + "="+para.opt(Key.pageNo);

        Request request = new Request.Builder()
                .url(actualUrl)
                .get()
                .addHeader("Cookie",Cookie)
                .build();

        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Response RequestNewItem(String url, JSONObject para){
        String actualUrl = url + "&" + Key.insertDate +"=" +
                para.opt(Key.insertDate) + "&" + Key.pageNo + "="+para.opt(Key.pageNo);

        Request request = new Request.Builder()
                .url(actualUrl)
                .get()
                .addHeader("Cookie",Cookie)
                .build();

        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Response ReuqestDetail(String url, JSONObject para){
        String actualUrl =  url +"&id="+para.opt("id");

        Request request = new Request.Builder()
                .url(actualUrl)
                .get()
                .addHeader("Cookie",Cookie)
                .build();

        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public Response RequestShopDetail(String url, JSONObject para){
        String actualUrl =  url +"&id="+para.opt("id");

        Request request = new Request.Builder()
                .url(actualUrl)
                .get()
                .addHeader("Cookie",Cookie)
                .build();

        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Response RequestRenameRecord(String url, JSONObject para){
        String actualUrl =  url +"&id="+para.opt("id");

        Request request = new Request.Builder()
                .url(actualUrl)
                .get()
                .addHeader("Cookie",Cookie)
                .build();

        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Response RequestZuanZhan(String url, JSONObject para){
        String actualUrl =  url +"&id="+para.opt("id");

        Request request = new Request.Builder()
                .url(actualUrl)
                .get()
                .addHeader("Cookie",Cookie)
                .build();

        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Response RequestAdAct(String url, JSONObject para){
        String actualUrl =  url +"&id="+para.opt("id");

        Request request = new Request.Builder()
                .url(actualUrl)
                .get()
                .addHeader("Cookie",Cookie)
                .build();

        try {
            return client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
