package model;

import com.google.gson.Gson;
import entity.OfferDetailInfo;
import entity.OfferList;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author serverliu on 2017/12/18.
 */
public class GetDataModel {
    private static String shopName="鸿星尔克";
    private static  HttpClient client = new HttpClient();
    private static List<List<OfferDetailInfo.OfferDetail.OfferInfo>> offerInfo = new ArrayList<>();
    private static List<OfferDetailInfo.OfferDetail.OfferInfo> tmpInfo = new ArrayList<>();
    private static  OfferList list;
    private static ArrayList<String> datas = new ArrayList<>();
    private static int count = 0;
    private static int total = 30;

    public static void main(String[] arg){

        System.out.println("代码初始化完毕。。。");
        System.out.println("开始请求交易列表。。。");
        Response response = client.request(Url.URL_OFFER_LIST);
        try {
            String responseStr = response.body().string();
            if(responseStr != null){
                System.out.println("交易列表返回成功！");
                Gson gson = new Gson();
                list = gson.fromJson(responseStr, OfferList.class);
                ParseData(list);
                outputToExcel();
            } else {
                System.out.println("错误！返回列表为空！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void ParseData(OfferList list){
        System.out.println("开始请求交易详情。。。。");
        for (OfferList.Offer offer:
             list.getData()) {
            SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
            datas.add(format.format(offer.getDate()));

            total = 30;
            RequestDetail(offer.getDate());
            ArrayList<OfferDetailInfo.OfferDetail.OfferInfo> tmp = new ArrayList<>();
            tmp.addAll(tmpInfo);
            offerInfo.add(tmp);
            tmpInfo.clear();
            System.out.println(format.format(offer.getDate())+" 交易详情请求成功。。。");
            count = 0;
        }
    }

    private static void RequestDetail(Long date){
        int num = (count/30) + 1;

        String actualUrl = Url.URL_OFFER_DETAIL + "&" + Key.insertDate +"=" +
                date + "&" + Key.pageNo + "="+num;

        if(count < total){
            try {
                Response response =  client.request(actualUrl);
                String responseStr = response.body().string();
                if(responseStr != null){
                    OfferDetailInfo detailInfo = new Gson().fromJson(responseStr, OfferDetailInfo.class);
                    tmpInfo.addAll(detailInfo.getData().getList());
                    total = detailInfo.getData().getTotal();
                    count += 30;
                    RequestDetail(date);
                }
            } catch (Exception e){
                e.printStackTrace();
                System.out.println("错误！");
            }
        }
    }

    private static void outputToExcel(){
        String[] titles = new String[]{"时间","id","商品","价格（原价/折扣价）","销量","类目","推广渠道"};
//        String[] ads = new String[]{"直通车","聚划算","钻石展位","站内活动","淘宝客"};

        File file = new File("E://"+shopName+"详情"+".xls");
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet();

        int dateIndex = 0;
        int rowIndex = 0;
        try{
          Row row = sheet.createRow(rowIndex++);
            for (int i = 0; i < titles.length; i++) {
                row.createCell(i).setCellValue(titles[i]);
            }

            System.out.println("开始写入文件。。。");
//            ArrayList<List<OfferDetailInfo.OfferDetail.OfferInfo>> copyOnWriteArrayList = new ArrayList<>();
//            copyOnWriteArrayList.addAll(offerInfo);
            for (List<OfferDetailInfo.OfferDetail.OfferInfo> infos:
                    offerInfo) {
                for (OfferDetailInfo.OfferDetail.OfferInfo info : infos) {
                    Row r = sheet.createRow(rowIndex++);
                    int cellIndex = 0;

                    r.createCell(cellIndex++).setCellValue(datas.get(dateIndex));
                    r.createCell(cellIndex++).setCellValue(info.getId());
                    r.createCell(cellIndex++).setCellValue(info.getTitle());
                    r.createCell(cellIndex++).setCellValue(info.getOriPrice() + "/" + info.getPrice());
                    r.createCell(cellIndex++).setCellValue(info.getAmount());
                    r.createCell(cellIndex++).setCellValue(info.getCatName());
                    String adStr = (info.getP4p() == 1 ? "直通车" : "") +
                            (info.getTaoke() == 1 ? "淘宝客" : "") +
                            (info.getSales() == 1 ? "站内活动" : "") +
                            (info.getJuhuasuan() == 1 ? "聚划算" : "") +
                            (info.getZuanzhan() == 1 ? "钻石展位" : "");
                    r.createCell(cellIndex).setCellValue(adStr);
                }
              dateIndex++;
            }
            workbook.write(new FileOutputStream(file));
            System.out.println("写入完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
