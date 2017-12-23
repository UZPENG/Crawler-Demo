package entity;

import java.util.List;

/**
 * @author serverliu on 2017/12/18.
 */
public class OfferDetailInfo {
    /**
     * api_name : shop_get_item_list
     * data : {"list":[{"amount":20,"amountGrowth":"5.26","brand":"erke/鸿星尔克 ","catId":50012043,"catName":"板鞋/休闲鞋","id":557125648150,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1Rc6qcsic_eJjSZFnXXXVwVXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":279,"p4p":1,"price":129,"price1":2780,"priceGrowth":"5.26","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克运动鞋男2017秋冬季男鞋休闲滑板小白鞋男子学生低帮板鞋","zuanzhan":0},{"amount":4,"brand":"erke/鸿星尔克 ","catId":50023425,"catName":"其它球服","id":553696587781,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1BaTTiNTI8KJjSspiXXbM4FXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":99,"p4p":0,"price":39,"price1":236,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克正品男篮球训练服2017新款 透气舒适无袖运动上衣","zuanzhan":0},{"amount":2,"amountGrowth":"-50.00","brand":"erke/鸿星尔克 ","catId":50012036,"catName":"跑步鞋","id":561796505328,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1mcMXiL2H8KJjy0FcXXaDlFXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":259,"p4p":0,"price":159,"price1":378,"priceGrowth":"-50.00","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018春季新品男子综训鞋防滑耐磨缓震男跑步鞋运动鞋","zuanzhan":0},{"amount":2,"brand":"erke/鸿星尔克 ","catId":50012036,"catName":"跑步鞋","id":528325149595,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1bpbMiRDH8KJjSszcXXbDTFXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":319,"p4p":0,"price":119,"price1":298,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男耐磨透气男士休闲防滑缓震旅游跑鞋正品鞋子跑步运动鞋","zuanzhan":0},{"amount":2,"amountGrowth":"100.00","brand":"erke/鸿星尔克 ","catId":50013228,"catName":"运动T恤","id":546301744881,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB1IWEPiMDD8KJjy0FdXXcjvXXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":99,"p4p":0,"price":39,"price1":118,"priceGrowth":"100.00","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克2017新款夏季男装圆领短袖T恤 透气吸汗户外轻便运动短T","zuanzhan":0},{"amount":1,"amountGrowth":"-80.00","brand":"erke/鸿星尔克 ","catId":0,"catName":"","id":562626836735,"image":"//gw3.alicdn.com/bao/uploaded/i3/349740505/TB15REpiNrI8KJjy0FpXXb5hVXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":569,"p4p":0,"price":439,"price1":439,"priceGrowth":"-80.00","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克2017冬季新品羽绒服男子外套羽绒夹克休闲运动男羽绒服","zuanzhan":0},{"amount":1,"amountGrowth":"-50.00","brand":"erke/鸿星尔克 ","catId":50012036,"catName":"跑步鞋","id":562149869141,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1DI.oiRDH8KJjSspnXXbNAVXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":399,"p4p":0,"price":289,"price1":309,"priceGrowth":"-50.00","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男跑步鞋2018春季新品百搭防滑健身鞋综训鞋鞋运动鞋男","zuanzhan":0},{"amount":1,"amountGrowth":"0.00","brand":"erke/鸿星尔克 ","catId":0,"catName":"","id":562790842594,"image":"//gw1.alicdn.com/bao/uploaded/i3/349740505/TB1tUotiMvD8KJjy0FlXXagBFXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":699,"p4p":0,"price":539,"price1":539,"priceGrowth":"0.00","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男羽绒服2017冬季新品男子休闲羽绒夹克防风保暖男外套","zuanzhan":0}],"total":8}
     * result : 1
     */

    private String api_name;
    private OfferDetail data;
    private int result;

    public String getApi_name() {
        return api_name;
    }

    public void setApi_name(String api_name) {
        this.api_name = api_name;
    }

    public OfferDetail getData() {
        return data;
    }

    public void setData(OfferDetail data) {
        this.data = data;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public static class OfferDetail {
        /**
         * list : [{"amount":20,"amountGrowth":"5.26","brand":"erke/鸿星尔克 ","catId":50012043,"catName":"板鞋/休闲鞋","id":557125648150,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1Rc6qcsic_eJjSZFnXXXVwVXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":279,"p4p":1,"price":129,"price1":2780,"priceGrowth":"5.26","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克运动鞋男2017秋冬季男鞋休闲滑板小白鞋男子学生低帮板鞋","zuanzhan":0},{"amount":4,"brand":"erke/鸿星尔克 ","catId":50023425,"catName":"其它球服","id":553696587781,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1BaTTiNTI8KJjSspiXXbM4FXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":99,"p4p":0,"price":39,"price1":236,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克正品男篮球训练服2017新款 透气舒适无袖运动上衣","zuanzhan":0},{"amount":2,"amountGrowth":"-50.00","brand":"erke/鸿星尔克 ","catId":50012036,"catName":"跑步鞋","id":561796505328,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1mcMXiL2H8KJjy0FcXXaDlFXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":259,"p4p":0,"price":159,"price1":378,"priceGrowth":"-50.00","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018春季新品男子综训鞋防滑耐磨缓震男跑步鞋运动鞋","zuanzhan":0},{"amount":2,"brand":"erke/鸿星尔克 ","catId":50012036,"catName":"跑步鞋","id":528325149595,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1bpbMiRDH8KJjSszcXXbDTFXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":319,"p4p":0,"price":119,"price1":298,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男耐磨透气男士休闲防滑缓震旅游跑鞋正品鞋子跑步运动鞋","zuanzhan":0},{"amount":2,"amountGrowth":"100.00","brand":"erke/鸿星尔克 ","catId":50013228,"catName":"运动T恤","id":546301744881,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB1IWEPiMDD8KJjy0FdXXcjvXXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":99,"p4p":0,"price":39,"price1":118,"priceGrowth":"100.00","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克2017新款夏季男装圆领短袖T恤 透气吸汗户外轻便运动短T","zuanzhan":0},{"amount":1,"amountGrowth":"-80.00","brand":"erke/鸿星尔克 ","catId":0,"catName":"","id":562626836735,"image":"//gw3.alicdn.com/bao/uploaded/i3/349740505/TB15REpiNrI8KJjy0FpXXb5hVXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":569,"p4p":0,"price":439,"price1":439,"priceGrowth":"-80.00","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克2017冬季新品羽绒服男子外套羽绒夹克休闲运动男羽绒服","zuanzhan":0},{"amount":1,"amountGrowth":"-50.00","brand":"erke/鸿星尔克 ","catId":50012036,"catName":"跑步鞋","id":562149869141,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1DI.oiRDH8KJjSspnXXbNAVXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":399,"p4p":0,"price":289,"price1":309,"priceGrowth":"-50.00","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男跑步鞋2018春季新品百搭防滑健身鞋综训鞋鞋运动鞋男","zuanzhan":0},{"amount":1,"amountGrowth":"0.00","brand":"erke/鸿星尔克 ","catId":0,"catName":"","id":562790842594,"image":"//gw1.alicdn.com/bao/uploaded/i3/349740505/TB1tUotiMvD8KJjy0FlXXagBFXa_!!0-item_pic.jpg","juhuasuan":0,"oriPrice":699,"p4p":0,"price":539,"price1":539,"priceGrowth":"0.00","sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男羽绒服2017冬季新品男子休闲羽绒夹克防风保暖男外套","zuanzhan":0}]
         * total : 8
         */

        private int total;
        private List<OfferInfo> list;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<OfferInfo> getList() {
            return list;
        }

        public void setList(List<OfferInfo> list) {
            this.list = list;
        }

        public static class OfferInfo {
            /**
             * amount : 20
             * amountGrowth : 5.26
             * brand : erke/鸿星尔克
             * catId : 50012043
             * catName : 板鞋/休闲鞋
             * id : 557125648150
             * image : http://img.alicdn.com/imgextra/i1/349740505/TB1Rc6qcsic_eJjSZFnXXXVwVXa_!!0-item_pic.jpg
             * juhuasuan : 0
             * oriPrice : 279
             * p4p : 1
             * price : 129
             * price1 : 2780
             * priceGrowth : 5.26
             * sales : 0
             * shopId : 59915065
             * taoke : 0
             * tbouter : 0
             * title : 鸿星尔克运动鞋男2017秋冬季男鞋休闲滑板小白鞋男子学生低帮板鞋
             * zuanzhan : 0
             */

            private int amount;
            private String amountGrowth;
            private String brand;
            private int catId;
            private String catName;
            private long id;
            private String image;
            private int juhuasuan;
            private int oriPrice;
            private int p4p;
            private float price;
            private float price1;
            private String priceGrowth;
            private int sales;
            private int shopId;
            private int taoke;
            private int tbouter;
            private String title;
            private int zuanzhan;

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public String getAmountGrowth() {
                return amountGrowth;
            }

            public void setAmountGrowth(String amountGrowth) {
                this.amountGrowth = amountGrowth;
            }

            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public int getCatId() {
                return catId;
            }

            public void setCatId(int catId) {
                this.catId = catId;
            }

            public String getCatName() {
                return catName;
            }

            public void setCatName(String catName) {
                this.catName = catName;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getJuhuasuan() {
                return juhuasuan;
            }

            public void setJuhuasuan(int juhuasuan) {
                this.juhuasuan = juhuasuan;
            }

            public int getOriPrice() {
                return oriPrice;
            }

            public void setOriPrice(int oriPrice) {
                this.oriPrice = oriPrice;
            }

            public int getP4p() {
                return p4p;
            }

            public void setP4p(int p4p) {
                this.p4p = p4p;
            }

            public float getPrice() {
                return price;
            }

            public void setPrice(float price) {
                this.price = price;
            }

            public float getPrice1() {
                return price1;
            }

            public void setPrice1(float price1) {
                this.price1 = price1;
            }

            public String getPriceGrowth() {
                return priceGrowth;
            }

            public void setPriceGrowth(String priceGrowth) {
                this.priceGrowth = priceGrowth;
            }

            public int getSales() {
                return sales;
            }

            public void setSales(int sales) {
                this.sales = sales;
            }

            public int getShopId() {
                return shopId;
            }

            public void setShopId(int shopId) {
                this.shopId = shopId;
            }

            public int getTaoke() {
                return taoke;
            }

            public void setTaoke(int taoke) {
                this.taoke = taoke;
            }

            public int getTbouter() {
                return tbouter;
            }

            public void setTbouter(int tbouter) {
                this.tbouter = tbouter;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getZuanzhan() {
                return zuanzhan;
            }

            public void setZuanzhan(int zuanzhan) {
                this.zuanzhan = zuanzhan;
            }
        }
    }
}
