package entity;

import java.util.List;

/**
 * @author serverliu on 2017/12/20.
 */
public class AdActEntiy {

    /**
     * api_name : data_shop_market_innersite
     * data : {"amountTotal":3646,"list":[{"amount":0,"date":1513180800000,"itemId":557313155690,"price":0,"price_":129,"shopId":60036677,"title":"【品牌outlets】特步男士跑步运动上衣舒适轻便时尚潮流简约外套"},{"amount":2,"date":1513180800000,"itemId":528042241831,"price":278,"price_":139,"shopId":60036677,"title":"【品牌outlets】特步男鞋跑步鞋运动鞋男鞋秋季耐磨动力巢科技男"},{"amount":12,"date":1513180800000,"itemId":527683796994,"price":1188,"price_":99,"shopId":60036677,"title":"【品牌outlets】特步正品男装男士上衣开衫外套舒适潮流潮流经典"},{"amount":1,"date":1513180800000,"itemId":521806102892,"price":99,"price_":99,"shopId":60036677,"title":"【品牌outlets】特步官方正品男装时尚棒球领拼接撞色休闲潮流"},{"amount":1,"date":1513180800000,"itemId":534401517158,"price":169,"price_":169,"shopId":60036677,"title":"【品牌outlets】特步男鞋跑步鞋秋季新款网面减震运动鞋动力巢"},{"amount":2,"date":1513180800000,"itemId":524392817333,"price":258,"price_":129,"shopId":60036677,"title":"【品牌outlets】特步男鞋正品男子徒步鞋新款时尚耐磨缓震舒适"},{"amount":0,"date":1513180800000,"itemId":520731283525,"price":0,"price_":129,"shopId":60036677,"title":"特步男鞋休闲鞋2017男鞋时尚复古阿甘鞋复古运动鞋男都市潮流鞋子"},{"amount":0,"date":1513180800000,"itemId":525613920031,"price":0,"price_":99,"shopId":60036677,"title":"【品牌outlets】特步女跑步裤秋冬时尚女款运动长裤潮流时尚舒适"},{"amount":0,"date":1513180800000,"itemId":526990888628,"price":0,"price_":119,"shopId":60036677,"title":"【品牌outlets】特步女子皮肤风衣防风衣防水时尚运动健身外套"},{"amount":0,"date":1513180800000,"itemId":524010215209,"price":0,"price_":149,"shopId":60036677,"title":"【品牌outlets】特步女鞋休闲鞋秋季正品女子运动鞋时尚复古鞋子"}],"priceTotal":394774,"total":211}
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
         * amountTotal : 3646
         * list : [{"amount":0,"date":1513180800000,"itemId":557313155690,"price":0,"price_":129,"shopId":60036677,"title":"【品牌outlets】特步男士跑步运动上衣舒适轻便时尚潮流简约外套"},{"amount":2,"date":1513180800000,"itemId":528042241831,"price":278,"price_":139,"shopId":60036677,"title":"【品牌outlets】特步男鞋跑步鞋运动鞋男鞋秋季耐磨动力巢科技男"},{"amount":12,"date":1513180800000,"itemId":527683796994,"price":1188,"price_":99,"shopId":60036677,"title":"【品牌outlets】特步正品男装男士上衣开衫外套舒适潮流潮流经典"},{"amount":1,"date":1513180800000,"itemId":521806102892,"price":99,"price_":99,"shopId":60036677,"title":"【品牌outlets】特步官方正品男装时尚棒球领拼接撞色休闲潮流"},{"amount":1,"date":1513180800000,"itemId":534401517158,"price":169,"price_":169,"shopId":60036677,"title":"【品牌outlets】特步男鞋跑步鞋秋季新款网面减震运动鞋动力巢"},{"amount":2,"date":1513180800000,"itemId":524392817333,"price":258,"price_":129,"shopId":60036677,"title":"【品牌outlets】特步男鞋正品男子徒步鞋新款时尚耐磨缓震舒适"},{"amount":0,"date":1513180800000,"itemId":520731283525,"price":0,"price_":129,"shopId":60036677,"title":"特步男鞋休闲鞋2017男鞋时尚复古阿甘鞋复古运动鞋男都市潮流鞋子"},{"amount":0,"date":1513180800000,"itemId":525613920031,"price":0,"price_":99,"shopId":60036677,"title":"【品牌outlets】特步女跑步裤秋冬时尚女款运动长裤潮流时尚舒适"},{"amount":0,"date":1513180800000,"itemId":526990888628,"price":0,"price_":119,"shopId":60036677,"title":"【品牌outlets】特步女子皮肤风衣防风衣防水时尚运动健身外套"},{"amount":0,"date":1513180800000,"itemId":524010215209,"price":0,"price_":149,"shopId":60036677,"title":"【品牌outlets】特步女鞋休闲鞋秋季正品女子运动鞋时尚复古鞋子"}]
         * priceTotal : 394774
         * total : 211
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
             * amount : 0
             * date : 1513180800000
             * itemId : 557313155690
             * price : 0
             * price_ : 129
             * shopId : 60036677
             * title : 【品牌outlets】特步男士跑步运动上衣舒适轻便时尚潮流简约外套
             */

            private int amount;
            private long date;
            private long itemId;
            private double price;
            private double price_;
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

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public double getPrice_() {
                return price_;
            }

            public void setPrice_(double price_) {
                this.price_ = price_;
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
