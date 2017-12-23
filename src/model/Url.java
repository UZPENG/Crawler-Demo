package model;

/**
 * @author serverliu on 2017/12/18.
 */
public interface Url {
    String shopId = "&shopId=59915065";
    String Id = "&id=59915065";
    String startDate = "&startDate=1511193600000";
    String endDate = "&endDate=";

    String BASE_URL = "http://www.taosj.com/";
    String URL_OFFER_LIST = BASE_URL+"data/shop/offer/list?api_name=shop_get_offer_list"+startDate+endDate+"&stat="+Id;
    String URL_OFFER_DETAIL = BASE_URL+"data/shop/item/list?api_name=shop_get_item_list&pageSize=30&"+shopId;

    String URL_UNSALE = BASE_URL + "data/shop/item/unsale/list?api_name=data_shop_item_unsale_list&pageSize=30"+shopId;

    String URL_NEW_ITEM = BASE_URL + "data/shop/item/new/list?api_name=shop_get_item_new_list"+startDate+endDate+"&pageSize=30"+shopId;
    String URL_ITEM_DETAIL = BASE_URL + "data/item/info?api_name=get_item_info"+shopId;

    String URL_RENAME = BASE_URL + "data/shop/item/onname/list?api_name=shop_get_item_onname_list"+startDate+endDate+"&p"+shopId;
    String URL_P4P = BASE_URL +"data/shop/item/np4p/list?api_name=data_shop_item_np4p_list&point=keyword&type=taobao&pageNo=1&pageSize=10&ins"+shopId;
    String URL_ZUANSHI = BASE_URL+"data/shop/market/zz?api_name=shop_get_market_zuanzhan_list"+startDate+endDate+"&pageNo=1"+Id;
    String URL_INFLUENCE = BASE_URL + "data/shop/item/zz/list?api_name=data_shop_item_zz_list&pageNo=1&pageSize=10&orderField=date&orderType=desc"+shopId;

    String URL_JUHUASUAN = BASE_URL + "data/shop/market/jhs?api_name=shop_get_market_juhuasuan_list" +
            startDate+endDate+"&pageNo=1&pageSize=10&orderField=date&orderType=desc"+Id;

    String URL_TAOBAOKE = BASE_URL + "data/shop/tbk/chart/list?api_name=data_shop_tbk_chart_list"+shopId;
    String URL_TAOJINBI = BASE_URL + "data/shop/market/innersite?api_name=data_shop_market_innersite" +
            "&id=59915065&position=tjb"+startDate+endDate+"&pageNo=1&pageSize=10&orderField=date&orderType=desc";
    String URL_QIANG = BASE_URL + "&position=qiang";
    String URL_QINGCANG = BASE_URL + "&position=qingcang";
    String URL_FREETRY = BASE_URL + "&position=freetry";
    String URL_YUSHOU = BASE_URL + "&position=yushou";

    String URL_SHOP_DETIAL = BASE_URL +"data/shop/detail?api_name=data_shop_detail"+shopId;
}
