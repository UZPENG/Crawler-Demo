import entity.*;
import model.io.WriteProxy;
import model.net.HttpClient;
import model.net.ParamWrapper;
import model.net.RequestModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

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
    private static String[] shopNames={"鸿星尔克","德芙","Opus"};
    private static int[] shopIds={59915065,71644724,104597454};

    public static void main(String[] arg){
        for (int i = 0; i < shopIds.length; i++) {
            String shopName = shopNames[i];
            int shopId = shopIds[i];
            ParamWrapper paramWrapper = ParamWrapper.newInstance();
            paramWrapper.setId(String.valueOf(shopId));
            RequestModel requestModel = new RequestModel();

            File rootDir = new File(WriteProxy.rootDir);
            if(!rootDir.exists()){
                rootDir.mkdir();
            }

            String[] titles;
            File file;

            List<OfferDetailInfo.DataBean.ListBean> offerInfo = requestModel.requestShopOfferList();
            file = new File(WriteProxy.rootDir+shopName+"详情.xls");
            titles = new String[]{"时间","id","商品","价格（原价/折扣价）","销量","类目","推广渠道"};
            WriteProxy.writeToExcel(file, titles, offerInfo, WriteProxy.FLAG_OFFER_DETAIL);

            List<ItemDetailEntity.DataBean> unsaleList = requestModel.requestUnSale();
            file = new File(WriteProxy.rootDir+shopName+"滞销.xls");
            titles = new String[]{"产品名称","品类","推广渠道"};
            WriteProxy.writeToExcel(file, titles, unsaleList, WriteProxy.FLAG_UNSALE);

//            List<RenameEntity.DataBean.ListBean> renameList = requestModel.requestRename();
//            file = new File(WriteProxy.rootDir+shopName+"名称变动.xls");
//            titles = new String[]{"新标题","原标题","时间"};
//            WriteProxy.writeToExcel(file, titles, renameList, WriteProxy.FLAG_RENAME);

//            List<ZuanShiEntity.DataBean.ListBean> zuanshiList = requestModel.requestZuanShi();
//            file = new File(WriteProxy.rootDir+shopName+"钻石展位.xls");
//            titles = new String[]{"新标题","原标题","时间"};
//            WriteProxy.writeToExcel(file, titles, zuanshiList, WriteProxy.FLAG_ZUANSHI);
//
//            List<TaoBaoKeEntity.DataBean.ListBean> taobaokeList = requestModel.requestTaobaoke();
//            file = new File(WriteProxy.rootDir+shopName+"淘宝客.xls");
//            titles = new String[]{"日期","宝贝名称","折扣","单价",
//                    "佣金比率","佣金","30天推广累计笔数","30天宝贝销量累计","30天支出佣金累计"};
//            WriteProxy.writeToExcel(file, titles, taobaokeList, WriteProxy.FLAG_TAOBAOKE);
//
//            List<JuHuaSuanEntity.DataBean.ListBean> juhuasuanList = requestModel.requestJuHuaSuan();
//            file = new File(WriteProxy.rootDir+shopName+"聚划算.xls");
//            titles = new String[]{"日期","宝贝名称","销售额","销量",
//                    "标价","实价"};
//            WriteProxy.writeToExcel(file, titles, juhuasuanList, WriteProxy.FLAG_JUHUASUAN);
//
//            List<NewItemEntity.DataBean.ListBean> newItemList = requestModel.requestNewItem();
//            file = new File(WriteProxy.rootDir+shopName+"上新.xls");
//            titles = new String[]{"时间","数目"};
//            WriteProxy.writeToExcel(file, titles, newItemList, WriteProxy.FLAG_UPDATE);
//
//            List<ShopDetailEntity.DataBean.ListBean> shopDetailList = requestModel.requestShopDetails();
//            file = new File(WriteProxy.rootDir+shopName+"店铺详情.xls");
//            titles = new String[]{"日期","销售量","销售额","销售商品数","动销率",
//                    "总宝贝数","上新","上架","改价","改标题","PC自然引流宝贝","PC自然引流词","豆腐块宝贝"
//                    ,"豆腐块词","移动端自然引流宝贝","移动端自然引流词","首屏宝贝","首屏词","PC端词","PC端宝贝",
//                    "移动端词","移动端宝贝","钻石展位","聚划算","淘宝客"};
//            WriteProxy.writeToExcel(file, titles, shopDetailList, WriteProxy.FLAG_SHOP_DETAIL);
        }
    }
}
