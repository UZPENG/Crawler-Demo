package entity;

/**
 * @author serverliu on 2017/12/20.
 */
public class ItemDetailEntity {

    /**
     * api_name : get_item_info
     * data : {"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"catName":"运动鞋new>跑步鞋","favor":1356,"freightDes":"","id":43587399839,"image":"http://img.alicdn.com/imgextra/i4/TB1ljrqNFXXXXcsXFXXXXXXXXXX_!!0-item_pic.jpg","isMonitor":0,"itemLink":"http://item.taobao.com/item.htm?id=43587399839","juhuasuan":0,"offer30":0,"oriPrice":299,"p4p":0,"price":129,"price30":0,"promotionRatio":0.43,"rank":-1,"rate":633,"sales":0,"servicePromise":"","shop":"鸿星尔克官方旗舰店","shopId":59915065,"taoke":0,"tbouter":0,"title":"【清仓】鸿星尔克男鞋正品男子网面透气鞋减震轻便跑鞋男鞋休闲鞋","type":"B","zuanzhan":0}
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
         * amount30 : 0
         * brand : erke/鸿星尔克
         * catId : 50012036
         * catName : 运动鞋new>跑步鞋
         * favor : 1356
         * freightDes :
         * id : 43587399839
         * image : http://img.alicdn.com/imgextra/i4/TB1ljrqNFXXXXcsXFXXXXXXXXXX_!!0-item_pic.jpg
         * isMonitor : 0
         * itemLink : http://item.taobao.com/item.htm?id=43587399839
         * juhuasuan : 0
         * offer30 : 0
         * oriPrice : 299
         * p4p : 0
         * price : 129
         * price30 : 0
         * promotionRatio : 0.43
         * rank : -1
         * rate : 633
         * sales : 0
         * servicePromise :
         * shop : 鸿星尔克官方旗舰店
         * shopId : 59915065
         * taoke : 0
         * tbouter : 0
         * title : 【清仓】鸿星尔克男鞋正品男子网面透气鞋减震轻便跑鞋男鞋休闲鞋
         * type : B
         * zuanzhan : 0
         */

        private int amount30;
        private String brand;
        private int catId;
        private String catName;
        private int favor;
        private String freightDes;
        private long id;
        private String image;
        private int isMonitor;
        private String itemLink;
        private int juhuasuan;
        private int offer30;
        private double oriPrice;
        private int p4p;
        private double price;
        private double price30;
        private double promotionRatio;
        private int rank;
        private int rate;
        private int sales;
        private String servicePromise;
        private String shop;
        private int shopId;
        private int taoke;
        private int tbouter;
        private String title;
        private String type;
        private int zuanzhan;

        public int getAmount30() {
            return amount30;
        }

        public void setAmount30(int amount30) {
            this.amount30 = amount30;
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

        public int getFavor() {
            return favor;
        }

        public void setFavor(int favor) {
            this.favor = favor;
        }

        public String getFreightDes() {
            return freightDes;
        }

        public void setFreightDes(String freightDes) {
            this.freightDes = freightDes;
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

        public int getIsMonitor() {
            return isMonitor;
        }

        public void setIsMonitor(int isMonitor) {
            this.isMonitor = isMonitor;
        }

        public String getItemLink() {
            return itemLink;
        }

        public void setItemLink(String itemLink) {
            this.itemLink = itemLink;
        }

        public int getJuhuasuan() {
            return juhuasuan;
        }

        public void setJuhuasuan(int juhuasuan) {
            this.juhuasuan = juhuasuan;
        }

        public int getOffer30() {
            return offer30;
        }

        public void setOffer30(int offer30) {
            this.offer30 = offer30;
        }

        public double getOriPrice() {
            return oriPrice;
        }

        public void setOriPrice(double oriPrice) {
            this.oriPrice = oriPrice;
        }

        public int getP4p() {
            return p4p;
        }

        public void setP4p(int p4p) {
            this.p4p = p4p;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice30() {
            return price30;
        }

        public void setPrice30(double price30) {
            this.price30 = price30;
        }

        public double getPromotionRatio() {
            return promotionRatio;
        }

        public void setPromotionRatio(double promotionRatio) {
            this.promotionRatio = promotionRatio;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public int getRate() {
            return rate;
        }

        public void setRate(int rate) {
            this.rate = rate;
        }

        public int getSales() {
            return sales;
        }

        public void setSales(int sales) {
            this.sales = sales;
        }

        public String getServicePromise() {
            return servicePromise;
        }

        public void setServicePromise(String servicePromise) {
            this.servicePromise = servicePromise;
        }

        public String getShop() {
            return shop;
        }

        public void setShop(String shop) {
            this.shop = shop;
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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getZuanzhan() {
            return zuanzhan;
        }

        public void setZuanzhan(int zuanzhan) {
            this.zuanzhan = zuanzhan;
        }
    }
}
