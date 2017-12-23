package entity;

import java.util.List;

/**
 * @author serverliu on 2017/12/18.
 */
public class OfferEntity {
    /**
     * api_name : shop_get_offer_list
     * data : [{"amount":704,"date":1510934400000,"healthLevel":0,"hotItemCount":237,"itemCount":733,"juhuasuan":1,"newItemCount":1,"offer":704,"outOfSeven":false,"p4p":1,"price":104730,"priceChange":5,"ratio":32.33,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":78,"zuanzhan":1},{"amount":9543,"date":1511020800000,"healthLevel":0,"hotItemCount":491,"itemCount":729,"juhuasuan":1,"newItemCount":0,"offer":9512,"outOfSeven":false,"p4p":1,"price":1354289,"priceChange":135,"ratio":67.35,"sales":1,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":67,"zuanzhan":1},{"amount":5524,"date":1511107200000,"healthLevel":0,"hotItemCount":469,"itemCount":729,"juhuasuan":1,"newItemCount":1,"offer":5501,"outOfSeven":false,"p4p":1,"price":763441,"priceChange":31,"ratio":64.33,"sales":1,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":75,"zuanzhan":1},{"amount":4043,"date":1511193600000,"healthLevel":0,"hotItemCount":423,"itemCount":729,"juhuasuan":1,"newItemCount":0,"offer":4034,"outOfSeven":false,"p4p":1,"price":591554,"priceChange":138,"ratio":58.02,"sales":1,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":105,"zuanzhan":1},{"amount":3606,"date":1511280000000,"healthLevel":0,"hotItemCount":333,"itemCount":729,"juhuasuan":1,"newItemCount":1,"offer":3606,"outOfSeven":false,"p4p":1,"price":715547,"priceChange":230,"ratio":45.68,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":61,"zuanzhan":1},{"amount":3510,"date":1511366400000,"healthLevel":0,"hotItemCount":335,"itemCount":711,"juhuasuan":0,"newItemCount":2,"offer":3510,"outOfSeven":false,"p4p":1,"price":602860,"priceChange":0,"ratio":47.12,"sales":0,"taoke":0,"tbouter":0,"titleChange":72,"updateChange":59,"zuanzhan":0},{"amount":1044,"date":1511452800000,"healthLevel":0,"hotItemCount":247,"itemCount":711,"juhuasuan":1,"newItemCount":1,"offer":1044,"outOfSeven":false,"p4p":1,"price":158930,"priceChange":240,"ratio":34.74,"sales":0,"taoke":0,"tbouter":0,"titleChange":10,"updateChange":54,"zuanzhan":1},{"amount":765,"date":1511539200000,"healthLevel":0,"hotItemCount":192,"itemCount":726,"juhuasuan":1,"newItemCount":2,"offer":764,"outOfSeven":false,"p4p":1,"price":112292,"priceChange":0,"ratio":26.45,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":70,"zuanzhan":1},{"amount":2069,"date":1511625600000,"healthLevel":0,"hotItemCount":411,"itemCount":726,"juhuasuan":1,"newItemCount":1,"offer":2069,"outOfSeven":false,"p4p":1,"price":293758,"priceChange":190,"ratio":56.61,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":55,"zuanzhan":1},{"amount":7556,"date":1511712000000,"healthLevel":0,"hotItemCount":482,"itemCount":725,"juhuasuan":1,"newItemCount":1,"offer":7534,"outOfSeven":false,"p4p":1,"price":1076197,"priceChange":2,"ratio":66.48,"sales":1,"taoke":0,"tbouter":0,"titleChange":6,"updateChange":66,"zuanzhan":1},{"amount":3711,"date":1511798400000,"healthLevel":0,"hotItemCount":430,"itemCount":725,"juhuasuan":1,"newItemCount":0,"offer":3703,"outOfSeven":false,"p4p":1,"price":519873,"priceChange":1,"ratio":59.31,"sales":1,"taoke":0,"tbouter":0,"titleChange":1,"updateChange":56,"zuanzhan":1},{"amount":3543,"date":1511884800000,"healthLevel":0,"hotItemCount":410,"itemCount":729,"juhuasuan":1,"newItemCount":0,"offer":3537,"outOfSeven":false,"p4p":1,"price":568320,"priceChange":242,"ratio":56.24,"sales":1,"taoke":0,"tbouter":0,"titleChange":87,"updateChange":45,"zuanzhan":1},{"amount":1837,"date":1511971200000,"healthLevel":0,"hotItemCount":345,"itemCount":729,"juhuasuan":1,"newItemCount":4,"offer":1835,"outOfSeven":false,"p4p":1,"price":649573,"priceChange":676,"ratio":47.33,"sales":1,"taoke":0,"tbouter":0,"titleChange":5,"updateChange":53,"zuanzhan":0},{"amount":1453,"date":1512057600000,"healthLevel":0,"hotItemCount":279,"itemCount":709,"juhuasuan":0,"newItemCount":2,"offer":1452,"outOfSeven":false,"p4p":1,"price":241757,"priceChange":695,"ratio":39.35,"sales":0,"taoke":0,"tbouter":0,"titleChange":10,"updateChange":57,"zuanzhan":1},{"amount":1608,"date":1512144000000,"healthLevel":0,"hotItemCount":290,"itemCount":709,"juhuasuan":0,"newItemCount":0,"offer":1604,"outOfSeven":false,"p4p":1,"price":260382,"priceChange":9,"ratio":40.9,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":68,"zuanzhan":1},{"amount":1464,"date":1512230400000,"healthLevel":0,"hotItemCount":286,"itemCount":707,"juhuasuan":0,"newItemCount":7,"offer":1461,"outOfSeven":false,"p4p":1,"price":246646,"priceChange":0,"ratio":40.45,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":53,"zuanzhan":1},{"amount":7746,"date":1512316800000,"healthLevel":0,"hotItemCount":465,"itemCount":707,"juhuasuan":0,"newItemCount":2,"offer":7736,"outOfSeven":false,"p4p":1,"price":1276072,"priceChange":0,"ratio":65.77,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":64,"zuanzhan":1},{"amount":4691,"date":1512403200000,"healthLevel":0,"hotItemCount":381,"itemCount":688,"juhuasuan":0,"newItemCount":0,"offer":4625,"outOfSeven":false,"p4p":1,"price":763053,"priceChange":0,"ratio":55.38,"sales":0,"taoke":0,"tbouter":0,"titleChange":58,"updateChange":55,"zuanzhan":1},{"amount":3087,"date":1512489600000,"healthLevel":0,"hotItemCount":356,"itemCount":688,"juhuasuan":0,"newItemCount":1,"offer":3083,"outOfSeven":false,"p4p":1,"price":500143,"priceChange":621,"ratio":51.74,"sales":0,"taoke":0,"tbouter":0,"titleChange":35,"updateChange":45,"zuanzhan":1},{"amount":1146,"date":1512576000000,"healthLevel":0,"hotItemCount":276,"itemCount":684,"juhuasuan":0,"newItemCount":5,"offer":1145,"outOfSeven":false,"p4p":1,"price":187981,"priceChange":27,"ratio":40.35,"sales":0,"taoke":0,"tbouter":0,"titleChange":5,"updateChange":51,"zuanzhan":1},{"amount":1191,"date":1512662400000,"healthLevel":0,"hotItemCount":230,"itemCount":684,"juhuasuan":0,"newItemCount":0,"offer":1190,"outOfSeven":false,"p4p":1,"price":207616,"priceChange":21,"ratio":33.63,"sales":0,"taoke":0,"tbouter":0,"titleChange":4,"updateChange":54,"zuanzhan":1},{"amount":756,"date":1512748800000,"healthLevel":0,"hotItemCount":159,"itemCount":684,"juhuasuan":0,"newItemCount":1,"offer":755,"outOfSeven":false,"p4p":1,"price":122534,"priceChange":0,"ratio":23.25,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":65,"zuanzhan":1},{"amount":878,"date":1512835200000,"healthLevel":0,"hotItemCount":227,"itemCount":684,"juhuasuan":0,"newItemCount":0,"offer":877,"outOfSeven":false,"p4p":1,"price":141662,"priceChange":0,"ratio":33.19,"sales":0,"taoke":1,"tbouter":0,"titleChange":0,"updateChange":52,"zuanzhan":1},{"amount":496,"date":1512921600000,"healthLevel":0,"hotItemCount":165,"itemCount":684,"juhuasuan":0,"newItemCount":0,"offer":496,"outOfSeven":false,"p4p":1,"price":90884,"priceChange":0,"ratio":24.12,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":63,"zuanzhan":1},{"amount":65321,"date":1513008000000,"healthLevel":0,"hotItemCount":537,"itemCount":674,"juhuasuan":0,"newItemCount":0,"offer":65056,"outOfSeven":false,"p4p":1,"price":9395613.32,"priceChange":24,"ratio":79.67,"sales":0,"taoke":0,"tbouter":0,"titleChange":2,"updateChange":54,"zuanzhan":1},{"amount":4213,"date":1513094400000,"healthLevel":0,"hotItemCount":464,"itemCount":671,"juhuasuan":0,"newItemCount":10,"offer":4206,"outOfSeven":false,"p4p":1,"price":572687,"priceChange":0,"ratio":69.15,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":43,"zuanzhan":1},{"amount":3328,"date":1513180800000,"healthLevel":0,"hotItemCount":441,"itemCount":671,"juhuasuan":0,"newItemCount":2,"offer":3318,"outOfSeven":false,"p4p":1,"price":475494,"priceChange":0,"ratio":65.72,"sales":0,"taoke":0,"tbouter":0,"titleChange":33,"updateChange":47,"zuanzhan":1},{"amount":2176,"date":1513267200000,"healthLevel":0,"hotItemCount":317,"itemCount":679,"juhuasuan":0,"newItemCount":4,"offer":2175,"outOfSeven":false,"p4p":1,"price":357972,"priceChange":48,"ratio":46.69,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":55,"zuanzhan":0},{"amount":3410,"date":1513353600000,"healthLevel":0,"hotItemCount":397,"itemCount":679,"juhuasuan":0,"newItemCount":1,"offer":3405,"outOfSeven":false,"p4p":1,"price":581960,"priceChange":602,"ratio":58.47,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":62,"zuanzhan":0},{"amount":33,"date":1513440000000,"healthLevel":0,"hotItemCount":8,"itemCount":654,"juhuasuan":0,"newItemCount":3,"offer":33,"outOfSeven":false,"p4p":1,"price":5097,"priceChange":12,"ratio":1.22,"sales":0,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":55,"zuanzhan":0}]
     * result : 1
     */

    private String api_name;
    private int result;
    private List<Offer> data;

    public String getApi_name() {
        return api_name;
    }

    public void setApi_name(String api_name) {
        this.api_name = api_name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<Offer> getData() {
        return data;
    }

    public void setData(List<Offer> data) {
        this.data = data;
    }

    public static class Offer {
        /**
         * amount : 704
         * date : 1510934400000
         * healthLevel : 0
         * hotItemCount : 237
         * itemCount : 733
         * juhuasuan : 1
         * newItemCount : 1
         * offer : 704
         * outOfSeven : false
         * p4p : 1
         * price : 104730
         * priceChange : 5
         * ratio : 32.33
         * sales : 0
         * taoke : 0
         * tbouter : 0
         * titleChange : 0
         * updateChange : 78
         * zuanzhan : 1
         */

        private int amount;
        private long date;
        private int healthLevel;
        private int hotItemCount;
        private int itemCount;
        private int juhuasuan;
        private int newItemCount;
        private int offer;
        private boolean outOfSeven;
        private int p4p;
        private double price;
        private int priceChange;
        private double ratio;
        private int sales;
        private int taoke;
        private int tbouter;
        private int titleChange;
        private int updateChange;
        private int zuanzhan;

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

        public int getHealthLevel() {
            return healthLevel;
        }

        public void setHealthLevel(int healthLevel) {
            this.healthLevel = healthLevel;
        }

        public int getHotItemCount() {
            return hotItemCount;
        }

        public void setHotItemCount(int hotItemCount) {
            this.hotItemCount = hotItemCount;
        }

        public int getItemCount() {
            return itemCount;
        }

        public void setItemCount(int itemCount) {
            this.itemCount = itemCount;
        }

        public int getJuhuasuan() {
            return juhuasuan;
        }

        public void setJuhuasuan(int juhuasuan) {
            this.juhuasuan = juhuasuan;
        }

        public int getNewItemCount() {
            return newItemCount;
        }

        public void setNewItemCount(int newItemCount) {
            this.newItemCount = newItemCount;
        }

        public int getOffer() {
            return offer;
        }

        public void setOffer(int offer) {
            this.offer = offer;
        }

        public boolean isOutOfSeven() {
            return outOfSeven;
        }

        public void setOutOfSeven(boolean outOfSeven) {
            this.outOfSeven = outOfSeven;
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

        public int getPriceChange() {
            return priceChange;
        }

        public void setPriceChange(int priceChange) {
            this.priceChange = priceChange;
        }

        public double getRatio() {
            return ratio;
        }

        public void setRatio(double ratio) {
            this.ratio = ratio;
        }

        public int getSales() {
            return sales;
        }

        public void setSales(int sales) {
            this.sales = sales;
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

        public int getTitleChange() {
            return titleChange;
        }

        public void setTitleChange(int titleChange) {
            this.titleChange = titleChange;
        }

        public int getUpdateChange() {
            return updateChange;
        }

        public void setUpdateChange(int updateChange) {
            this.updateChange = updateChange;
        }

        public int getZuanzhan() {
            return zuanzhan;
        }

        public void setZuanzhan(int zuanzhan) {
            this.zuanzhan = zuanzhan;
        }
    }
}
