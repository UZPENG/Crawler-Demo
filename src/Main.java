import com.google.gson.Gson;
import entity.*;
import model.HttpClient;
import model.Key;
import model.Url;
import okhttp3.Response;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author serverliu on 2017/12/18.
 */
@SuppressWarnings("ALL")
public class Main {
    private static String shopName="鸿星尔克";

    private static HttpClient client = new HttpClient();
    private static List<UnSale.DataBean.ListBean> list = new ArrayList<>();
    private static List<NewItemEntity.DataBean.ListBean> newItemEntity=new ArrayList<>();
    private static List<ItemDetalEntity.DataBean> itemDetals = new ArrayList<>();
    private static List<ShopDetailEntity.DataBean.ListBean> shopDetail = new ArrayList<>();
    private static List<RenameEntity.DataBean.ListBean> renameList = new ArrayList<>();
    private static List<DiamondEntity.DataBean.ListBean> zuanshiList = new ArrayList<>();
    private static List<TaoBaoKeEntity.DataBean.ListBean> taobaokeList = new ArrayList<>();
    private static List<JuHuaSuan.DataBean.ListBean> juhuasuanList = new ArrayList<>();
    private static int count = 0;
    private static int total = 30;

    public static void main(String[] arg){
//       RequestUnSale();
//       RequestDetails();
//       outputToExcelUnSale();
//       count = 0;
//       total = 30;
//       RequestNewItem();
//       outputToExcelUpdate();
//        count = 0;
//        total = 30;
        RequestShopDetails();
        outputToExcelShopDetail();
        count = 0;
        total = 30;
//        RequestRename();
//        outputToExcelRename();
//        count = 0;
//        total = 30;
//        RequestDiomond();
//        outputToExcelZuanShi();
//        count = 0;
//        total = 30;
//        RequestJuHuaSuan();
//        outputToExcelJuHuaSuan();
//        count = 0;
//        total = 30;
//        RequestTaobaoke();
//        outputToExcelTaoBaoKe();
    }

    private static void RequestUnSale(){
        int num = (count/30) + 1;
        String actualUrl = Url.URL_UNSALE + "&pageNo=" +num;

        if(count < total) {
            try {
                Response response = client.request(Url.URL_UNSALE);
                String responseStr = response.body().string();
                if (responseStr != null) {
                    System.out.println("交易列表返回成功！");
                    Gson gson = new Gson();
                    UnSale tmp = gson.fromJson(responseStr, UnSale.class);
                    list.addAll(tmp.getData().getList());
                    total = tmp.getData().getTotal();
                    count += 30;
                    RequestUnSale();
                } else {
                    System.out.println("错误！返回列表为空！");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    private static void RequestNewItem(){
        int num = (count/30) + 1;
        final JSONObject para = new JSONObject();
        para.put(Key.pageNo, num);

        if(count < total) {
            Response response = client.RequestNewItem(Url.URL_NEW_ITEM, para);
            try {
                String responseStr = response.body().string();
                if (responseStr != null) {
                    System.out.println("交易列表返回成功！");
                    Gson gson = new Gson();
                    NewItemEntity tmp = gson.fromJson(responseStr, NewItemEntity.class);
                    newItemEntity.addAll(tmp.getData().getList());
                    total = tmp.getData().getTotal();
                    count += 30;
                    RequestNewItem();
                } else {
                    System.out.println("错误！返回列表为空！");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void RequestDetails(){
        for (UnSale.DataBean.ListBean item :
                list) {
            final JSONObject para = new JSONObject();
            para.put("id", item.getId());

            Response response = client.ReuqestDetail(Url.URL_ITEM_DETAIL, para);
            try {
                String responseStr = response.body().string();
                if (responseStr != null) {
                    System.out.println("交易列表返回成功！");
                    Gson gson = new Gson();
                    ItemDetalEntity tmp = gson.fromJson(responseStr, ItemDetalEntity.class);
                    itemDetals.add(tmp.getData());
                } else {
                    System.out.println("错误！返回列表为空！");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void RequestShopDetails(){
        int count = 0;
        final JSONObject para = new JSONObject();
        long startDate = 1513353600000l;
        long endDate = 1513872000000l;
        para.put("startDate",String.valueOf(startDate - (count * 5181400000l)));
        para.put("endDate",String.valueOf(endDate - (count * 5181400000l)));

        if(count < 4) {
            Response response = client.ReuqestDetail(Url.URL_SHOP_DETIAL, para);
            try {
                String responseStr = response.body().string();
                if (responseStr != null) {
                    System.out.println("交易列表返回成功！");
                    Gson gson = new Gson();
                    ShopDetailEntity tmp = gson.fromJson(responseStr, ShopDetailEntity.class);
                    shopDetail.addAll(tmp.getData().getList());
                    count += 1;
                    RequestNewItem();
                } else {
                    System.out.println("错误！返回列表为空！");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void RequestRename(){
        int num = (count/30) + 1;
        final JSONObject para = new JSONObject();
        para.put(Key.pageNo, num);

        if(count < total) {
            Response response = client.RequestUnSale(Url.URL_RENAME, para);
            try {
                String responseStr = response.body().string();
                if (responseStr != null) {
                    System.out.println("交易列表返回成功！");
                    Gson gson = new Gson();
                    RenameEntity tmp = gson.fromJson(responseStr, RenameEntity.class);
                    renameList.addAll(tmp.getData().getList());
                    total = tmp.getData().getTotal();
                    count += 30;
                    RequestNewItem();
                } else {
                    System.out.println("错误！返回列表为空！");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void RequestDiomond(){
        int num = (count/30) + 1;
        final JSONObject para = new JSONObject();
        para.put(Key.pageNo, num);

        if(count < total) {
            Response response = client.RequestUnSale(Url.URL_ZUANSHI, para);
            try {
                String responseStr = response.body().string();
                if (responseStr != null) {
                    System.out.println("交易列表返回成功！");
                    Gson gson = new Gson();
                    DiamondEntity tmp = gson.fromJson(responseStr, DiamondEntity.class);
                    zuanshiList.addAll(tmp.getData().getList());
                    total = tmp.getData().getTotal();
                    count += 30;
                    RequestNewItem();
                } else {
                    System.out.println("错误！返回列表为空！");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void RequestTaobaoke(){
        int num = (count/30) + 1;
        final JSONObject para = new JSONObject();
        para.put(Key.pageNo, num);

        if(count < total) {
            Response response = client.RequestUnSale(Url.URL_TAOBAOKE, para);
            try {
                String responseStr = response.body().string();
                if (responseStr != null) {
                    System.out.println("交易列表返回成功！");
                    Gson gson = new Gson();
                    TaoBaoKeEntity tmp = gson.fromJson(responseStr, TaoBaoKeEntity.class);
                    taobaokeList.addAll(tmp.getData().getList());
                    total = tmp.getData().getTotal();
                    count += 30;
                    RequestNewItem();
                } else {
                    System.out.println("错误！返回列表为空！");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void RequestJuHuaSuan(){
        int num = (count/30) + 1;
        final JSONObject para = new JSONObject();
        para.put(Key.pageNo, num);

        if(count < total) {
            Response response = client.RequestUnSale(Url.URL_JUHUASUAN, para);
            try {
                String responseStr = response.body().string();
                if (responseStr != null) {
                    System.out.println("交易列表返回成功！");
                    Gson gson = new Gson();
                    JuHuaSuan tmp = gson.fromJson(responseStr, JuHuaSuan.class);
                    juhuasuanList.addAll(tmp.getData().getList());
                    total = tmp.getData().getTotal();
                    count += 30;
                    RequestNewItem();
                } else {
                    System.out.println("错误！返回列表为空！");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void outputToExcelUpdate(){
//        String[] titles = new String[]{"产品名称","品类","推广渠道"};
        String[] titles = new String[]{"时间","数目"};
//        String[] ads = new String[]{"直通车","聚划算","钻石展位","站内活动","淘宝客"};

        File file = new File("E://"+shopName+"上新.xls");
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
            SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
                for (NewItemEntity.DataBean.ListBean info : newItemEntity) {
                    Row r = sheet.createRow(rowIndex++);
                    int cellIndex = 0;

                    r.createCell(cellIndex++).setCellValue(format.format(info.getCreateDate()));
                    r.createCell(cellIndex++).setCellValue(info.getTitle());
                }
                workbook.write(new FileOutputStream(file));
                System.out.println("写入完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void outputToExcelUnSale(){
        String[] titles = new String[]{"产品名称","品类","推广渠道"};
//        String[] titles = new String[]{"时间","数目"};
//        String[] ads = new String[]{"直通车","聚划算","钻石展位","站内活动","淘宝客"};

        File file = new File("E://"+shopName+"滞销.xls");
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
            SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
            for (ItemDetalEntity.DataBean info : itemDetals) {
                Row r = sheet.createRow(rowIndex++);
                int cellIndex = 0;

                r.createCell(cellIndex++).setCellValue(info.getTitle());
                r.createCell(cellIndex++).setCellValue(info.getCatName());
                String adStr = (info.getP4p() == 1 ? "直通车" : "") +
                        (info.getTaoke() == 1 ? "淘宝客" : "") +
                        (info.getSales() == 1 ? "站内活动" : "") +
                        (info.getJuhuasuan() == 1 ? "聚划算" : "") +
                        (info.getZuanzhan() == 1 ? "钻石展位" : "");
                r.createCell(cellIndex++).setCellValue(adStr);
            }
            workbook.write(new FileOutputStream(file));
            System.out.println("写入完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void outputToExcelShopDetail(){
        String[] titles = new String[]{"日期","销售量","销售额","销售商品数","动销率",
                "总宝贝数","上新","上架","改价","改标题","自然引流宝贝","自然引流词","首屏宝贝"
                ,"首屏词","PC端词","PC端宝贝","移动端词","移动端宝贝","钻石展位","聚划算","淘宝客"};
//        String[] titles = new String[]{"时间","数目"};
//        String[] ads = new String[]{"直通车","聚划算","钻石展位","站内活动","淘宝客"};

        File file = new File("E://"+shopName+"店铺详情.xls");
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
            SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
            for (ShopDetailEntity.DataBean.ListBean info : shopDetail) {
                Row r = sheet.createRow(rowIndex++);
                int cellIndex = 0;

                r.createCell(cellIndex++).setCellValue(format.format(info.getDate()));
                r.createCell(cellIndex++).setCellValue(info.getAmount());
                r.createCell(cellIndex++).setCellValue(info.getPrice());
                r.createCell(cellIndex++).setCellValue(info.getHotItemCount());
                r.createCell(cellIndex++).setCellValue(info.getRatio());
                r.createCell(cellIndex++).setCellValue(info.getItemCount());
                r.createCell(cellIndex++).setCellValue(info.getNewItemCount());
                r.createCell(cellIndex++).setCellValue(info.getUpdateChange());
                r.createCell(cellIndex++).setCellValue(info.getPriceChange());
                r.createCell(cellIndex++).setCellValue(info.getTitleChange());
                r.createCell(cellIndex++).setCellValue(info.getSearch_itemcnt());
                r.createCell(cellIndex++).setCellValue(info.getSearch_keycnt());
                r.createCell(cellIndex++).setCellValue(info.getSpsearch_itemcnt());
                r.createCell(cellIndex++).setCellValue(info.getSpsearch_keycnt());
                r.createCell(cellIndex++).setCellValue(info.getMsearch_itemcnt());
                r.createCell(cellIndex++).setCellValue(info.getMsearch_keycnt());
                r.createCell(cellIndex++).setCellValue(info.getSpmsearch_itemcnt());
                r.createCell(cellIndex++).setCellValue(info.getSpmsearch_keycnt());
                r.createCell(cellIndex++).setCellValue(info.getP4p_keycnt());
                r.createCell(cellIndex++).setCellValue(info.getP4p_itemcnt());
                r.createCell(cellIndex++).setCellValue(info.getMp4p_keycnt());
                r.createCell(cellIndex++).setCellValue(info.getMp4p_itemcnt());
                r.createCell(cellIndex++).setCellValue(info.getZuanzhan());
                r.createCell(cellIndex++).setCellValue(info.getJuhuasuan());
                r.createCell(cellIndex++).setCellValue(info.getTaoke());
            }
            workbook.write(new FileOutputStream(file));
            System.out.println("写入完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void outputToExcelRename(){
        String[] titles = new String[]{"新标题","原标题","时间"};
//        String[] titles = new String[]{"时间","数目"};
//        String[] ads = new String[]{"直通车","聚划算","钻石展位","站内活动","淘宝客"};

        File file = new File("E://"+shopName+"名称变动.xls");
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
            SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
            for (RenameEntity.DataBean.ListBean info : renameList) {
                Row r = sheet.createRow(rowIndex++);
                int cellIndex = 0;

                r.createCell(cellIndex++).setCellValue(info.getNewTitle());
                r.createCell(cellIndex++).setCellValue(info.getOldTitle());
                r.createCell(cellIndex++).setCellValue(format.format(info.getChangeDate()));
            }
            workbook.write(new FileOutputStream(file));
            System.out.println("写入完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void outputToExcelZuanShi(){
        String[] titles = new String[]{"位置","投放日期","店铺销售额","店铺销量",
                "展现指数","类型详情"};
//        String[] titles = new String[]{"时间","数目"};
//        String[] ads = new String[]{"直通车","聚划算","钻石展位","站内活动","淘宝客"};

        File file = new File("E://"+shopName+"钻石展位.xls");
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
            SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
            for (DiamondEntity.DataBean.ListBean info : zuanshiList) {
                Row r = sheet.createRow(rowIndex++);
                int cellIndex = 0;

                r.createCell(cellIndex++).setCellValue(info.getPosition());
                r.createCell(cellIndex++).setCellValue(format.format(info.getDate()));
                r.createCell(cellIndex++).setCellValue(info.getPrice());
                r.createCell(cellIndex++).setCellValue(info.getAmount());
                r.createCell(cellIndex++).setCellValue(info.getDisplayRate());
                r.createCell(cellIndex++).setCellValue(info.getPositionType());
            }
            workbook.write(new FileOutputStream(file));
            System.out.println("写入完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void outputToExcelJuHuaSuan(){
        String[] titles = new String[]{"日期","宝贝名称","销售额","销量",
                "标价","实价"};
//        String[] titles = new String[]{"时间","数目"};
//        String[] ads = new String[]{"直通车","聚划算","钻石展位","站内活动","淘宝客"};

        File file = new File("E://"+shopName+"聚划算.xls");
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet();

        int rowIndex = 0;
        try{
            Row row = sheet.createRow(rowIndex++);
            for (int i = 0; i < titles.length; i++) {
                row.createCell(i).setCellValue(titles[i]);
            }
            System.out.println("开始写入文件。。。");
//            ArrayList<List<OfferDetailInfo.OfferDetail.OfferInfo>> copyOnWriteArrayList = new ArrayList<>();
//            copyOnWriteArrayList.addAll(offerInfo);
            SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
            for (JuHuaSuan.DataBean.ListBean info : juhuasuanList) {
                Row r = sheet.createRow(rowIndex++);
                int cellIndex = 0;

                r.createCell(cellIndex++).setCellValue(format.format(info.getDate()));
                r.createCell(cellIndex++).setCellValue(info.getTitle());
                r.createCell(cellIndex++).setCellValue(info.getPrice());
                r.createCell(cellIndex++).setCellValue(info.getAmount());
                r.createCell(cellIndex++).setCellValue(info.getOriPrice());
                r.createCell(cellIndex++).setCellValue(info.getRealPrice());
            }
            workbook.write(new FileOutputStream(file));
            System.out.println("写入完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void outputToExcelTaoBaoKe(){
        String[] titles = new String[]{"日期","宝贝名称","折扣","单价",
                "佣金比率","佣金","30天推广累计笔数","30天宝贝销量累计","30天支出佣金累计"};
//        String[] titles = new String[]{"时间","数目"};
//        String[] ads = new String[]{"直通车","聚划算","钻石展位","站内活动","淘宝客"};

        File file = new File("E://"+shopName+"淘宝客.xls");
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
            SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
            for (TaoBaoKeEntity.DataBean.ListBean info : taobaokeList) {
                Row r = sheet.createRow(rowIndex++);
                int cellIndex = 0;

                r.createCell(cellIndex++).setCellValue(format.format(info.getDate()));
                r.createCell(cellIndex++).setCellValue(info.getTitle());
                r.createCell(cellIndex++).setCellValue(info.getDiscount());
                r.createCell(cellIndex++).setCellValue(info.getPayRate());
                r.createCell(cellIndex++).setCellValue(info.getPayPrice());
                r.createCell(cellIndex++).setCellValue(info.getAmount_());
                r.createCell(cellIndex++).setCellValue(info.getPrice_());
                r.createCell(cellIndex++).setCellValue(info.getPayPrice30());
            }
            workbook.write(new FileOutputStream(file));
            System.out.println("写入完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
