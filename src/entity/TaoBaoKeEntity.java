package entity;

import java.util.List;

/**
 * @author serverliu on 2017/12/20.
 */
public class TaoBaoKeEntity {

    /**
     * api_name : data_shop_market_tbk
     * data : {"list":[{"amount":28807,"amount_":8211,"date":1512576000000,"discount":0.47,"itemId":532605360124,"payPrice":3.18,"payPrice30":13538.8,"payRate":2,"price":159,"price_":149,"shopId":60036677,"title":"特步男鞋2017秋冬季运动鞋黑金潮流休闲鞋革面舒适板鞋减震男鞋子"},{"amount":15494,"amount_":4533,"date":1512576000000,"discount":0.57,"itemId":526272516776,"payPrice":3.18,"payPrice30":7092.93,"payRate":2,"price":159,"price_":139,"shopId":60036677,"title":"特步情侣板鞋2017秋冬男鞋女鞋潮流经典小白鞋绑带休闲鞋子运动鞋"},{"amount":13300,"amount_":4694,"date":1512576000000,"discount":0.53,"itemId":538404540868,"payPrice":3.18,"payPrice30":7046.79,"payRate":2,"price":159,"price_":139,"shopId":60036677,"title":"特步女鞋休闲鞋2017秋冬季新款运动鞋轻便时尚复古舒适耐磨女鞋子"},{"amount":24108,"amount_":6499,"date":1512576000000,"discount":0.53,"itemId":535432280646,"payPrice":3.38,"payPrice30":12706.3,"payRate":2,"price":169,"price_":149,"shopId":60036677,"title":"特步男鞋2017秋冬运动鞋轻便舒适休闲鞋复古潮流男旅游鞋网布鞋子"},{"amount":27421,"amount_":5646,"date":1512576000000,"discount":0.58,"itemId":547604781864,"payPrice":2.78,"payPrice30":10544.3,"payRate":2,"price":139,"price_":139,"shopId":60036677,"title":"特步情侣板鞋男鞋休闲鞋2017秋季运动鞋滑板鞋男女迷彩鞋尾小白鞋"},{"amount":94656,"amount_":32395,"date":1512576000000,"discount":0.58,"itemId":533971240373,"payPrice":2.78,"payPrice30":35629.8,"payRate":2,"price":139,"price_":119,"shopId":60036677,"title":"特步情侣板鞋男鞋休闲鞋2017秋冬时尚运动鞋滑板鞋男女绿尾小白鞋"},{"amount":36071,"amount_":8372,"date":1512576000000,"discount":0.57,"itemId":542870909715,"payPrice":3.18,"payPrice30":19637.1,"payRate":2,"price":159,"price_":139,"shopId":60036677,"title":"特步男鞋秋冬新款运动鞋轻便舒适减震慢跑鞋子耐磨情侣男款跑步鞋"},{"amount":41705,"amount_":9518,"date":1512576000000,"discount":0.53,"itemId":522662282644,"payPrice":3.58,"payPrice30":27318.4,"payRate":2,"price":179,"price_":159,"shopId":60036677,"title":"特步男鞋运动鞋男秋冬新款革面跑步鞋轻便减震耐磨舒适休闲慢跑鞋"},{"amount":20775,"amount_":5617,"date":1512576000000,"discount":0.57,"itemId":550497106316,"payPrice":3.18,"payPrice30":9543.05,"payRate":2,"price":159,"price_":159,"shopId":60036677,"title":"特步男鞋运动鞋男跑步鞋2017秋冬季新款黑色鞋子跑鞋轻便休闲潮流"},{"amount":26982,"amount_":8170,"date":1512576000000,"discount":0.58,"itemId":533937625711,"payPrice":2.78,"payPrice30":8960.34,"payRate":2,"price":139,"price_":119,"shopId":60036677,"title":"特步情侣板鞋女鞋休闲鞋运动鞋秋冬时尚滑板鞋经典男女绿尾小白鞋"}],"total":12}
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
         * list : [{"amount":28807,"amount_":8211,"date":1512576000000,"discount":0.47,"itemId":532605360124,"payPrice":3.18,"payPrice30":13538.8,"payRate":2,"price":159,"price_":149,"shopId":60036677,"title":"特步男鞋2017秋冬季运动鞋黑金潮流休闲鞋革面舒适板鞋减震男鞋子"},{"amount":15494,"amount_":4533,"date":1512576000000,"discount":0.57,"itemId":526272516776,"payPrice":3.18,"payPrice30":7092.93,"payRate":2,"price":159,"price_":139,"shopId":60036677,"title":"特步情侣板鞋2017秋冬男鞋女鞋潮流经典小白鞋绑带休闲鞋子运动鞋"},{"amount":13300,"amount_":4694,"date":1512576000000,"discount":0.53,"itemId":538404540868,"payPrice":3.18,"payPrice30":7046.79,"payRate":2,"price":159,"price_":139,"shopId":60036677,"title":"特步女鞋休闲鞋2017秋冬季新款运动鞋轻便时尚复古舒适耐磨女鞋子"},{"amount":24108,"amount_":6499,"date":1512576000000,"discount":0.53,"itemId":535432280646,"payPrice":3.38,"payPrice30":12706.3,"payRate":2,"price":169,"price_":149,"shopId":60036677,"title":"特步男鞋2017秋冬运动鞋轻便舒适休闲鞋复古潮流男旅游鞋网布鞋子"},{"amount":27421,"amount_":5646,"date":1512576000000,"discount":0.58,"itemId":547604781864,"payPrice":2.78,"payPrice30":10544.3,"payRate":2,"price":139,"price_":139,"shopId":60036677,"title":"特步情侣板鞋男鞋休闲鞋2017秋季运动鞋滑板鞋男女迷彩鞋尾小白鞋"},{"amount":94656,"amount_":32395,"date":1512576000000,"discount":0.58,"itemId":533971240373,"payPrice":2.78,"payPrice30":35629.8,"payRate":2,"price":139,"price_":119,"shopId":60036677,"title":"特步情侣板鞋男鞋休闲鞋2017秋冬时尚运动鞋滑板鞋男女绿尾小白鞋"},{"amount":36071,"amount_":8372,"date":1512576000000,"discount":0.57,"itemId":542870909715,"payPrice":3.18,"payPrice30":19637.1,"payRate":2,"price":159,"price_":139,"shopId":60036677,"title":"特步男鞋秋冬新款运动鞋轻便舒适减震慢跑鞋子耐磨情侣男款跑步鞋"},{"amount":41705,"amount_":9518,"date":1512576000000,"discount":0.53,"itemId":522662282644,"payPrice":3.58,"payPrice30":27318.4,"payRate":2,"price":179,"price_":159,"shopId":60036677,"title":"特步男鞋运动鞋男秋冬新款革面跑步鞋轻便减震耐磨舒适休闲慢跑鞋"},{"amount":20775,"amount_":5617,"date":1512576000000,"discount":0.57,"itemId":550497106316,"payPrice":3.18,"payPrice30":9543.05,"payRate":2,"price":159,"price_":159,"shopId":60036677,"title":"特步男鞋运动鞋男跑步鞋2017秋冬季新款黑色鞋子跑鞋轻便休闲潮流"},{"amount":26982,"amount_":8170,"date":1512576000000,"discount":0.58,"itemId":533937625711,"payPrice":2.78,"payPrice30":8960.34,"payRate":2,"price":139,"price_":119,"shopId":60036677,"title":"特步情侣板鞋女鞋休闲鞋运动鞋秋冬时尚滑板鞋经典男女绿尾小白鞋"}]
         * total : 12
         */

        private int total;
        private List<ListBean> list;

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
             * amount : 28807
             * amount_ : 8211
             * date : 1512576000000
             * discount : 0.47
             * itemId : 532605360124
             * payPrice : 3.18
             * payPrice30 : 13538.8
             * payRate : 2
             * price : 159
             * price_ : 149
             * shopId : 60036677
             * title : 特步男鞋2017秋冬季运动鞋黑金潮流休闲鞋革面舒适板鞋减震男鞋子
             */

            private int amount;
            private int amount_;
            private long date;
            private double discount;
            private long itemId;
            private double payPrice;
            private double payPrice30;
            private double payRate;
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

            public int getAmount_() {
                return amount_;
            }

            public void setAmount_(int amount_) {
                this.amount_ = amount_;
            }

            public long getDate() {
                return date;
            }

            public void setDate(long date) {
                this.date = date;
            }

            public double getDiscount() {
                return discount;
            }

            public void setDiscount(double discount) {
                this.discount = discount;
            }

            public long getItemId() {
                return itemId;
            }

            public void setItemId(long itemId) {
                this.itemId = itemId;
            }

            public double getPayPrice() {
                return payPrice;
            }

            public void setPayPrice(double payPrice) {
                this.payPrice = payPrice;
            }

            public double getPayPrice30() {
                return payPrice30;
            }

            public void setPayPrice30(double payPrice30) {
                this.payPrice30 = payPrice30;
            }

            public double getPayRate() {
                return payRate;
            }

            public void setPayRate(double payRate) {
                this.payRate = payRate;
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
