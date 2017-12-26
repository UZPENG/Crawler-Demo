package model.net;

import entity.*;
import okhttp3.Response;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author serverliu on 2017/12/18.
 */
@SuppressWarnings("Duplicates")
public class RequestModel {
    private HttpClient client = new HttpClient();

    private List<List<OfferDetailInfo.DataBean.ListBean>> offerInfo = new ArrayList<>();
    private List<OfferDetailInfo.DataBean.ListBean> tmpOfferInfo = new ArrayList<>();
    private List<UnSaleEntity.DataBean.ListBean> unsaleList = new ArrayList<>();
    private List<NewItemEntity.DataBean.ListBean> newItemEntity=new ArrayList<>();
    private List<ItemDetailEntity.DataBean> itemDetailsList = new ArrayList<>();
    private List<ShopDetailEntity.DataBean.ListBean> shopDetailList = new ArrayList<>();
    private List<RenameEntity.DataBean.ListBean> renameList = new ArrayList<>();
    private List<ZuanShiEntity.DataBean.ListBean> zuanshiList = new ArrayList<>();
    private List<TaoBaoKeEntity.DataBean.ListBean> taobaokeList = new ArrayList<>();
    private List<JuHuaSuanEntity.DataBean.ListBean> juhuasuanList = new ArrayList<>();

    private ArrayList<String> date = new ArrayList<>();
    private int count = 0;
    private int total = 30;

    public List<OfferDetailInfo.DataBean.ListBean> requestShopOfferList(){
        String para = new ParamWrapper.ParamBuilder()
                .addDate()
                .addId()
                .build();
        Response response = client.request(Url.URL_OFFER_LIST+para);
        OfferEntity offerEntity = client.parseResponse(OfferEntity.class, response);
        parseData(offerEntity);

        int index = 0;
        List<OfferDetailInfo.DataBean.ListBean> result = new ArrayList<>();
        for (List<OfferDetailInfo.DataBean.ListBean> entity:
             offerInfo) {
            for (OfferDetailInfo.DataBean.ListBean item :
                    entity) {
                item.setDate(date.get(index));
                result.add(item);
            }
            index++;
        }

        return result;
    }

    private void parseData(OfferEntity list){
        System.out.println("开始请求交易详情。。。。");
        for (OfferEntity.Offer offer:
             list.getData()) {
            SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
            date.add(format.format(offer.getDate()));

            total = 30;
            requestDetail(offer.getDate());
            ArrayList<OfferDetailInfo.DataBean.ListBean> tmp = new ArrayList<>();
            tmp.addAll(tmpOfferInfo);
            offerInfo.add(tmp);
            tmpOfferInfo.clear();
            System.out.println(format.format(offer.getDate())+" 交易详情请求成功。。。");
            count = 0;
        }
    }

    private void requestDetail(Long date){
        int num = (count/30) + 1;
        String param = new ParamWrapper.ParamBuilder()
                .addParam(Key.insertDate, String.valueOf(date))
                .addParam(Key.pageNo, String.valueOf(num))
                .addShopId()
                .build();
        String actualUrl = Url.URL_OFFER_DETAIL + param;

        if(count < total){
            try {
                Response response =  client.request(actualUrl);
                OfferDetailInfo detailInfo = client.parseResponse(OfferDetailInfo.class, response);
                tmpOfferInfo.addAll(detailInfo.getData().getList());

                total = detailInfo.getData().getTotal();
                count += 30;

                requestDetail(date);
            } catch (Exception e){
                e.printStackTrace();
                System.exit(0);
            }
        }
    }

    public List<ItemDetailEntity.DataBean> requestUnSale(){
        requestUnSaleInternal();
        return requestItemDetails();
    }

    private void requestUnSaleInternal(){
        int num = (count/30) + 1;
        String param = new ParamWrapper.ParamBuilder()
                .addShopId()
                .addParam(Key.pageNo, String.valueOf(num))
                .build();
        String actualUrl = Url.URL_UNSALE + param;

        if(count < total) {
            try {
                Response response = client.request(actualUrl);
                UnSaleEntity tmp = client.parseResponse(UnSaleEntity.class, response);
                unsaleList.addAll(tmp.getData().getList());
                total = tmp.getData().getTotal();
                count += 30;
                requestUnSaleInternal();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public List<NewItemEntity.DataBean.ListBean> requestNewItem(){
        int num = (count/30) + 1;
        String param = new ParamWrapper.ParamBuilder()
                .addDate()
                .addShopId()
                .addParam(Key.pageNo, String.valueOf(num))
                .build();
        String actualUrl = Url.URL_NEW_ITEM + param;

        if(count < total) {
            Response response = client.request(actualUrl);
            try {
                NewItemEntity tmp = client.parseResponse(NewItemEntity.class, response);
                newItemEntity.addAll(tmp.getData().getList());
                total = tmp.getData().getTotal();
                count += 30;
                requestNewItem();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return newItemEntity;
    }

    public List<ItemDetailEntity.DataBean> requestItemDetails(){
        for (UnSaleEntity.DataBean.ListBean item :
                unsaleList) {
            String param = new ParamWrapper.ParamBuilder()
                    .addParam(Key.shopId, String.valueOf(item.getId()))
                    .build();
            String actualUrl = Url.URL_ITEM_DETAIL + param;

            Response response = client.request(actualUrl);
            try {
                ItemDetailEntity tmp = client.parseResponse(ItemDetailEntity.class, response);
                itemDetailsList.add(tmp.getData());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return itemDetailsList;
    }

    public List<ShopDetailEntity.DataBean.ListBean> requestShopDetails(){
        long startDate = Long.parseLong(ParamWrapper.getStartDate());
        long endDate = Long.parseLong(ParamWrapper.getEndDate());

        Duration duration = Duration.ofDays(7);
        startDate = startDate - duration.toMillis() * count;
        endDate = endDate - duration.toMillis() * count;
        String param = new ParamWrapper.ParamBuilder()
                .addParam(Key.startDate, String.valueOf(startDate))
                .addParam(Key.endDate, String.valueOf(endDate))
                .addShopId()
                .build();
        String actualUrl = Url.URL_SHOP_DETAIL + param;

        if(count < 4) {
            Response response = client.request(actualUrl);
            try {
                ShopDetailEntity tmp = client.parseResponse(ShopDetailEntity.class, response);
                shopDetailList.addAll(tmp.getData().getList());
                count += 1;
                requestShopDetails();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return shopDetailList;
    }

    public List<RenameEntity.DataBean.ListBean> requestRename(){
        int num = (count/30) + 1;
        String param = new ParamWrapper.ParamBuilder()
                .addShopId()
                .addDate()
                .addParam(Key.pageNo, String.valueOf(num))
                .build();
        String actualUrl = Url.URL_RENAME + param;

        if(count < total) {
            Response response = client.request(actualUrl);
            try {
                RenameEntity tmp = client.parseResponse(RenameEntity.class, response);
                renameList.addAll(tmp.getData().getList());
                total = tmp.getData().getTotal();
                count += 30;
                requestRename();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return renameList;
    }

    public List<ZuanShiEntity.DataBean.ListBean> requestZuanShi(){
        int num = (count/30) + 1;
        String param = new ParamWrapper.ParamBuilder()
                .addDate()
                .addId()
                .addParam(Key.pageNo, String.valueOf(num))
                .build();
        String actualUrl = Url.URL_ZUANSHI + param;

        if(count < total) {
            Response response = client.request(actualUrl);
            try {
                ZuanShiEntity tmp = client.parseResponse(ZuanShiEntity.class, response);
                zuanshiList.addAll(tmp.getData().getList());
                total = tmp.getData().getTotal();
                count += 30;
                requestZuanShi();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return zuanshiList;
    }

    public List<TaoBaoKeEntity.DataBean.ListBean> requestTaobaoke(){
        int num = (count/30) + 1;
        String param = new ParamWrapper.ParamBuilder()
                .addId()
                .addDate()
                .addParam(Key.pageNo, String.valueOf(num))
                .build();
        String actualUrl =Url.URL_TAOBAOKE + param;
        if(count < total) {
            Response response = client.request(actualUrl);
            try {
                TaoBaoKeEntity tmp = client.parseResponse(TaoBaoKeEntity.class, response);
                taobaokeList.addAll(tmp.getData().getList());
                total = tmp.getData().getTotal();
                count += 30;
                requestTaobaoke();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return taobaokeList;
    }

    public List<JuHuaSuanEntity.DataBean.ListBean> requestJuHuaSuan(){
        int num = (count/30) + 1;
        String param = new ParamWrapper.ParamBuilder()
                .addId()
                .addDate()
                .addParam(Key.pageNo, String.valueOf(num))
                .build();
        String actualUrl = Url.URL_JUHUASUAN + param;

        if(count < total) {
            Response response = client.request(actualUrl);
            try {
                JuHuaSuanEntity tmp = client.parseResponse(JuHuaSuanEntity.class, response);
                juhuasuanList.addAll(tmp.getData().getList());
                total = tmp.getData().getTotal();
                count += 30;
                requestJuHuaSuan();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return juhuasuanList;
    }
}
