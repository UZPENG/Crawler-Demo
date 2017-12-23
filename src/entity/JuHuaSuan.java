package entity;

import java.util.List;

/**
 * @author serverliu on 2017/12/20.
 */
public class JuHuaSuan {

    /**
     * api_name : shop_get_market_juhuasuan_list
     * data : {"amountTotal":22801,"list":[{"amount":2,"date":1511971200000,"itemId":559783816714,"oriPrice":339,"position":"商品团","price":678,"realPrice":339,"shopId":59915065,"title":"鸿星尔克女训练篮球鞋2017冬季新款中帮运动鞋防滑减震耐磨篮球鞋"},{"amount":0,"date":1511971200000,"itemId":561078479976,"oriPrice":259,"position":"商品团","price":0,"realPrice":159,"shopId":59915065,"title":"鸿星尔克erke童鞋慢跑鞋2017秋季新品大童跑鞋减震防滑常规运动鞋"},{"amount":0,"date":1511971200000,"itemId":523248354628,"oriPrice":499,"position":"商品团","price":0,"realPrice":159,"shopId":59915065,"title":"鸿星尔克官方正品新款男款训练气垫减震战靴篮球鞋运动鞋篮球战靴"},{"amount":0,"date":1511971200000,"itemId":559063632869,"oriPrice":379,"position":"商品团","price":0,"realPrice":299,"shopId":59915065,"title":"鸿星尔克男鞋跑步鞋2017冬季新品防滑耐磨运动鞋休闲鞋气垫跑鞋男"},{"amount":0,"date":1511971200000,"itemId":560972342880,"oriPrice":239,"position":"商品团","price":0,"realPrice":189,"shopId":59915065,"title":"鸿星尔克erke2018新品春季男针织长裤运动休闲修身百搭男子运动裤"},{"amount":0,"date":1511971200000,"itemId":553347525196,"oriPrice":359,"position":"商品团","price":0,"realPrice":229,"shopId":59915065,"title":"鸿星尔克erke正品男子轻便跑鞋新款透气网面运动鞋减震健身综训鞋"},{"amount":6,"date":1511971200000,"itemId":554003231991,"oriPrice":319,"position":"商品团","price":1914,"realPrice":319,"shopId":59915065,"title":"鸿星尔克男士篮球鞋正品2017秋季新款休闲篮球鞋耐磨防滑篮球战靴"},{"amount":3,"date":1511971200000,"itemId":560852033460,"oriPrice":359,"position":"商品团","price":1077,"realPrice":359,"shopId":59915065,"title":"鸿星尔克男加棉滑板鞋2017冬季新品防滑保暖男子休闲鞋时尚百搭"},{"amount":0,"date":1511971200000,"itemId":557668303726,"oriPrice":299,"position":"商品团","price":0,"realPrice":169,"shopId":59915065,"title":"鸿星尔克童鞋儿童篮球鞋 男童运动鞋2017春秋新款小学生气垫鞋子"},{"amount":3,"date":1511971200000,"itemId":542887020053,"oriPrice":279,"position":"商品团","price":837,"realPrice":279,"shopId":59915065,"title":"鸿星尔克男鞋跑步鞋男新品时尚耐磨跑步鞋学生轻便微跑鞋OM74QGYE"}],"priceTotal":3820465,"total":2317}
     * result : 1
     */

    private String api_name;
    private DataBean data;
    private int result;

    public String getApi_name() {
        return api_name;
    }

    public void setApi_name(String api_name) {
        this.api_name = api_name;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public static class DataBean {
        /**
         * amountTotal : 22801
         * list : [{"amount":2,"date":1511971200000,"itemId":559783816714,"oriPrice":339,"position":"商品团","price":678,"realPrice":339,"shopId":59915065,"title":"鸿星尔克女训练篮球鞋2017冬季新款中帮运动鞋防滑减震耐磨篮球鞋"},{"amount":0,"date":1511971200000,"itemId":561078479976,"oriPrice":259,"position":"商品团","price":0,"realPrice":159,"shopId":59915065,"title":"鸿星尔克erke童鞋慢跑鞋2017秋季新品大童跑鞋减震防滑常规运动鞋"},{"amount":0,"date":1511971200000,"itemId":523248354628,"oriPrice":499,"position":"商品团","price":0,"realPrice":159,"shopId":59915065,"title":"鸿星尔克官方正品新款男款训练气垫减震战靴篮球鞋运动鞋篮球战靴"},{"amount":0,"date":1511971200000,"itemId":559063632869,"oriPrice":379,"position":"商品团","price":0,"realPrice":299,"shopId":59915065,"title":"鸿星尔克男鞋跑步鞋2017冬季新品防滑耐磨运动鞋休闲鞋气垫跑鞋男"},{"amount":0,"date":1511971200000,"itemId":560972342880,"oriPrice":239,"position":"商品团","price":0,"realPrice":189,"shopId":59915065,"title":"鸿星尔克erke2018新品春季男针织长裤运动休闲修身百搭男子运动裤"},{"amount":0,"date":1511971200000,"itemId":553347525196,"oriPrice":359,"position":"商品团","price":0,"realPrice":229,"shopId":59915065,"title":"鸿星尔克erke正品男子轻便跑鞋新款透气网面运动鞋减震健身综训鞋"},{"amount":6,"date":1511971200000,"itemId":554003231991,"oriPrice":319,"position":"商品团","price":1914,"realPrice":319,"shopId":59915065,"title":"鸿星尔克男士篮球鞋正品2017秋季新款休闲篮球鞋耐磨防滑篮球战靴"},{"amount":3,"date":1511971200000,"itemId":560852033460,"oriPrice":359,"position":"商品团","price":1077,"realPrice":359,"shopId":59915065,"title":"鸿星尔克男加棉滑板鞋2017冬季新品防滑保暖男子休闲鞋时尚百搭"},{"amount":0,"date":1511971200000,"itemId":557668303726,"oriPrice":299,"position":"商品团","price":0,"realPrice":169,"shopId":59915065,"title":"鸿星尔克童鞋儿童篮球鞋 男童运动鞋2017春秋新款小学生气垫鞋子"},{"amount":3,"date":1511971200000,"itemId":542887020053,"oriPrice":279,"position":"商品团","price":837,"realPrice":279,"shopId":59915065,"title":"鸿星尔克男鞋跑步鞋男新品时尚耐磨跑步鞋学生轻便微跑鞋OM74QGYE"}]
         * priceTotal : 3820465
         * total : 2317
         */

        private int amountTotal;
        private int priceTotal;
        private int total;
        private List<ListBean> list;

        public int getAmountTotal() {
            return amountTotal;
        }

        public void setAmountTotal(int amountTotal) {
            this.amountTotal = amountTotal;
        }

        public int getPriceTotal() {
            return priceTotal;
        }

        public void setPriceTotal(int priceTotal) {
            this.priceTotal = priceTotal;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * amount : 2
             * date : 1511971200000
             * itemId : 559783816714
             * oriPrice : 339
             * position : 商品团
             * price : 678
             * realPrice : 339
             * shopId : 59915065
             * title : 鸿星尔克女训练篮球鞋2017冬季新款中帮运动鞋防滑减震耐磨篮球鞋
             */

            private int amount;
            private long date;
            private long itemId;
            private int oriPrice;
            private String position;
            private int price;
            private int realPrice;
            private int shopId;
            private String title;

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public long getDate() {
                return date;
            }

            public void setDate(long date) {
                this.date = date;
            }

            public long getItemId() {
                return itemId;
            }

            public void setItemId(long itemId) {
                this.itemId = itemId;
            }

            public int getOriPrice() {
                return oriPrice;
            }

            public void setOriPrice(int oriPrice) {
                this.oriPrice = oriPrice;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getRealPrice() {
                return realPrice;
            }

            public void setRealPrice(int realPrice) {
                this.realPrice = realPrice;
            }

            public int getShopId() {
                return shopId;
            }

            public void setShopId(int shopId) {
                this.shopId = shopId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
