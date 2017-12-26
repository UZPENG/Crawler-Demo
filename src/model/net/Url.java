package model.net;

/**
 * @author serverliu on 2017/12/18.
 */
public interface Url {
    String BASE_URL = "http://www.taosj.com/";
    String MODULE_SHOP = "data/shop/";
    String MODULE_SHOP_ITEM = MODULE_SHOP + "item/";
    String MODULE_SHOP_OFFER = MODULE_SHOP + "offer/";

    String URL_OFFER_LIST = BASE_URL+"data/shop/offer/list?api_name=shop_get_offer_lis&stat=";
    String URL_OFFER_DETAIL = BASE_URL+"data/shop/item/list?api_name=shop_get_item_list&pageSize=30";

    String URL_UNSALE = BASE_URL + "data/shop/item/unsale/list?api_name=data_shop_item_unsale_list&pageSize=30";

    String URL_NEW_ITEM = BASE_URL + "data/shop/item/new/list?api_name=shop_get_item_new_list&pageSize=30";
    String URL_ITEM_DETAIL = BASE_URL + "data/item/info?api_name=get_item_info";

    String URL_RENAME = BASE_URL + "data/shop/item/onname/list?api_name=shop_get_item_onname_list"+"&p";
    String URL_ZUANSHI = BASE_URL+"data/shop/market/zz?api_name=shop_get_market_zuanzhan_list&pageSize=30&orderField=date&orderType=desc";
    String URL_TAOBAOKE = BASE_URL + "data/shop/market/tbk?api_name=data_shop_market_tbk&pageSize=30";
    String URL_JUHUASUAN = BASE_URL + "data/shop/market/jhs?api_name=shop_get_market_juhuasuan_list&pageSize=30&orderField=date&orderType=desc";

    String URL_SHOP_DETAIL = BASE_URL +"data/shop/detail?api_name=data_shop_detail";
}
