package entity;

import java.util.List;

/**
 * @author serverliu on 2017/12/20.
 */
public class ShopDetailEntity {
    /**
     * api_name : data_shop_detail
     * data : {"list":[{"amount":496,"date":1512921600000,"healthLevel":0,"hotItemCount":165,"itemCount":684,"juhuasuan":0,"mp4p_itemcnt":35,"mp4p_keycnt":139,"msearch_itemcnt":194,"msearch_keycnt":331,"newItemCount":0,"offer":496,"outOfSeven":false,"p4p":1,"p4p_itemcnt":128,"p4p_keycnt":1434,"price":90884,"priceChange":0,"ratio":24.12,"sales":0,"search_itemcnt":525,"search_keycnt":1122,"spmsearch_itemcnt":19,"spmsearch_keycnt":28,"spsearch_itemcnt":40,"spsearch_keycnt":67,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":63,"zuanzhan":1},{"amount":65321,"date":1513008000000,"healthLevel":0,"hotItemCount":537,"itemCount":674,"juhuasuan":0,"mp4p_itemcnt":39,"mp4p_keycnt":192,"msearch_itemcnt":180,"msearch_keycnt":273,"newItemCount":0,"offer":65056,"outOfSeven":false,"p4p":1,"p4p_itemcnt":127,"p4p_keycnt":1193,"price":9395613.32,"priceChange":24,"ratio":79.67,"sales":0,"search_itemcnt":512,"search_keycnt":999,"spmsearch_itemcnt":25,"spmsearch_keycnt":27,"spsearch_itemcnt":28,"spsearch_keycnt":51,"taoke":0,"tbouter":0,"titleChange":2,"updateChange":54,"zuanzhan":1},{"amount":4213,"date":1513094400000,"healthLevel":0,"hotItemCount":464,"itemCount":671,"juhuasuan":0,"mp4p_itemcnt":46,"mp4p_keycnt":175,"msearch_itemcnt":129,"msearch_keycnt":145,"newItemCount":10,"offer":4206,"outOfSeven":false,"p4p":1,"p4p_itemcnt":126,"p4p_keycnt":1063,"price":572687,"priceChange":0,"ratio":69.15,"sales":0,"search_itemcnt":524,"search_keycnt":966,"spmsearch_itemcnt":9,"spmsearch_keycnt":8,"spsearch_itemcnt":31,"spsearch_keycnt":68,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":43,"zuanzhan":1},{"amount":3328,"date":1513180800000,"healthLevel":0,"hotItemCount":441,"itemCount":671,"juhuasuan":0,"mp4p_itemcnt":37,"mp4p_keycnt":137,"msearch_itemcnt":113,"msearch_keycnt":101,"newItemCount":2,"offer":3318,"outOfSeven":false,"p4p":1,"p4p_itemcnt":129,"p4p_keycnt":1092,"price":475494,"priceChange":0,"ratio":65.72,"sales":0,"search_itemcnt":426,"search_keycnt":635,"spmsearch_itemcnt":15,"spmsearch_keycnt":16,"spsearch_itemcnt":29,"spsearch_keycnt":58,"taoke":0,"tbouter":0,"titleChange":33,"updateChange":47,"zuanzhan":1},{"amount":2176,"date":1513267200000,"healthLevel":0,"hotItemCount":317,"itemCount":679,"juhuasuan":0,"mp4p_itemcnt":36,"mp4p_keycnt":151,"msearch_itemcnt":81,"msearch_keycnt":86,"newItemCount":4,"offer":2175,"outOfSeven":false,"p4p":1,"p4p_itemcnt":126,"p4p_keycnt":1036,"price":357972,"priceChange":48,"ratio":46.69,"sales":0,"search_itemcnt":417,"search_keycnt":611,"spmsearch_itemcnt":9,"spmsearch_keycnt":15,"spsearch_itemcnt":24,"spsearch_keycnt":58,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":55,"zuanzhan":0},{"amount":3410,"date":1513353600000,"healthLevel":0,"hotItemCount":397,"itemCount":679,"juhuasuan":0,"mp4p_itemcnt":34,"mp4p_keycnt":148,"msearch_itemcnt":107,"msearch_keycnt":116,"newItemCount":1,"offer":3405,"outOfSeven":false,"p4p":1,"p4p_itemcnt":118,"p4p_keycnt":959,"price":581960,"priceChange":602,"ratio":58.47,"sales":0,"search_itemcnt":403,"search_keycnt":556,"spmsearch_itemcnt":16,"spmsearch_keycnt":25,"spsearch_itemcnt":26,"spsearch_keycnt":67,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":62,"zuanzhan":0},{"amount":3156,"date":1513440000000,"healthLevel":0,"hotItemCount":387,"itemCount":654,"juhuasuan":0,"mp4p_itemcnt":34,"mp4p_keycnt":153,"msearch_itemcnt":111,"msearch_keycnt":113,"newItemCount":3,"offer":3149,"outOfSeven":false,"p4p":1,"p4p_itemcnt":117,"p4p_keycnt":755,"price":533254,"priceChange":564,"ratio":59.17,"sales":0,"search_itemcnt":376,"search_keycnt":552,"spmsearch_itemcnt":8,"spmsearch_keycnt":11,"spsearch_itemcnt":26,"spsearch_keycnt":66,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":52,"zuanzhan":0},{"amount":1174,"date":1513526400000,"healthLevel":0,"hotItemCount":253,"itemCount":654,"juhuasuan":0,"mp4p_itemcnt":32,"mp4p_keycnt":188,"msearch_itemcnt":124,"msearch_keycnt":97,"newItemCount":4,"offer":1173,"outOfSeven":false,"p4p":1,"p4p_itemcnt":107,"p4p_keycnt":761,"price":207046,"priceChange":66,"ratio":38.69,"sales":0,"search_itemcnt":406,"search_keycnt":544,"spmsearch_itemcnt":8,"spmsearch_keycnt":9,"spsearch_itemcnt":27,"spsearch_keycnt":66,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":63,"zuanzhan":1},{"amount":1917,"date":1513612800000,"healthLevel":0,"hotItemCount":328,"itemCount":660,"juhuasuan":0,"mp4p_itemcnt":40,"mp4p_keycnt":256,"msearch_itemcnt":115,"msearch_keycnt":102,"newItemCount":0,"offer":1919,"outOfSeven":false,"p4p":1,"p4p_itemcnt":114,"p4p_keycnt":886,"price":279699.6,"priceChange":25,"ratio":49.7,"sales":0,"search_itemcnt":435,"search_keycnt":567,"spmsearch_itemcnt":11,"spmsearch_keycnt":10,"spsearch_itemcnt":25,"spsearch_keycnt":84,"taoke":0,"tbouter":0,"titleChange":4,"updateChange":54,"zuanzhan":1}],"total":8}
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
         * list : [{"amount":496,"date":1512921600000,"healthLevel":0,"hotItemCount":165,"itemCount":684,"juhuasuan":0,"mp4p_itemcnt":35,"mp4p_keycnt":139,"msearch_itemcnt":194,"msearch_keycnt":331,"newItemCount":0,"offer":496,"outOfSeven":false,"p4p":1,"p4p_itemcnt":128,"p4p_keycnt":1434,"price":90884,"priceChange":0,"ratio":24.12,"sales":0,"search_itemcnt":525,"search_keycnt":1122,"spmsearch_itemcnt":19,"spmsearch_keycnt":28,"spsearch_itemcnt":40,"spsearch_keycnt":67,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":63,"zuanzhan":1},{"amount":65321,"date":1513008000000,"healthLevel":0,"hotItemCount":537,"itemCount":674,"juhuasuan":0,"mp4p_itemcnt":39,"mp4p_keycnt":192,"msearch_itemcnt":180,"msearch_keycnt":273,"newItemCount":0,"offer":65056,"outOfSeven":false,"p4p":1,"p4p_itemcnt":127,"p4p_keycnt":1193,"price":9395613.32,"priceChange":24,"ratio":79.67,"sales":0,"search_itemcnt":512,"search_keycnt":999,"spmsearch_itemcnt":25,"spmsearch_keycnt":27,"spsearch_itemcnt":28,"spsearch_keycnt":51,"taoke":0,"tbouter":0,"titleChange":2,"updateChange":54,"zuanzhan":1},{"amount":4213,"date":1513094400000,"healthLevel":0,"hotItemCount":464,"itemCount":671,"juhuasuan":0,"mp4p_itemcnt":46,"mp4p_keycnt":175,"msearch_itemcnt":129,"msearch_keycnt":145,"newItemCount":10,"offer":4206,"outOfSeven":false,"p4p":1,"p4p_itemcnt":126,"p4p_keycnt":1063,"price":572687,"priceChange":0,"ratio":69.15,"sales":0,"search_itemcnt":524,"search_keycnt":966,"spmsearch_itemcnt":9,"spmsearch_keycnt":8,"spsearch_itemcnt":31,"spsearch_keycnt":68,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":43,"zuanzhan":1},{"amount":3328,"date":1513180800000,"healthLevel":0,"hotItemCount":441,"itemCount":671,"juhuasuan":0,"mp4p_itemcnt":37,"mp4p_keycnt":137,"msearch_itemcnt":113,"msearch_keycnt":101,"newItemCount":2,"offer":3318,"outOfSeven":false,"p4p":1,"p4p_itemcnt":129,"p4p_keycnt":1092,"price":475494,"priceChange":0,"ratio":65.72,"sales":0,"search_itemcnt":426,"search_keycnt":635,"spmsearch_itemcnt":15,"spmsearch_keycnt":16,"spsearch_itemcnt":29,"spsearch_keycnt":58,"taoke":0,"tbouter":0,"titleChange":33,"updateChange":47,"zuanzhan":1},{"amount":2176,"date":1513267200000,"healthLevel":0,"hotItemCount":317,"itemCount":679,"juhuasuan":0,"mp4p_itemcnt":36,"mp4p_keycnt":151,"msearch_itemcnt":81,"msearch_keycnt":86,"newItemCount":4,"offer":2175,"outOfSeven":false,"p4p":1,"p4p_itemcnt":126,"p4p_keycnt":1036,"price":357972,"priceChange":48,"ratio":46.69,"sales":0,"search_itemcnt":417,"search_keycnt":611,"spmsearch_itemcnt":9,"spmsearch_keycnt":15,"spsearch_itemcnt":24,"spsearch_keycnt":58,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":55,"zuanzhan":0},{"amount":3410,"date":1513353600000,"healthLevel":0,"hotItemCount":397,"itemCount":679,"juhuasuan":0,"mp4p_itemcnt":34,"mp4p_keycnt":148,"msearch_itemcnt":107,"msearch_keycnt":116,"newItemCount":1,"offer":3405,"outOfSeven":false,"p4p":1,"p4p_itemcnt":118,"p4p_keycnt":959,"price":581960,"priceChange":602,"ratio":58.47,"sales":0,"search_itemcnt":403,"search_keycnt":556,"spmsearch_itemcnt":16,"spmsearch_keycnt":25,"spsearch_itemcnt":26,"spsearch_keycnt":67,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":62,"zuanzhan":0},{"amount":3156,"date":1513440000000,"healthLevel":0,"hotItemCount":387,"itemCount":654,"juhuasuan":0,"mp4p_itemcnt":34,"mp4p_keycnt":153,"msearch_itemcnt":111,"msearch_keycnt":113,"newItemCount":3,"offer":3149,"outOfSeven":false,"p4p":1,"p4p_itemcnt":117,"p4p_keycnt":755,"price":533254,"priceChange":564,"ratio":59.17,"sales":0,"search_itemcnt":376,"search_keycnt":552,"spmsearch_itemcnt":8,"spmsearch_keycnt":11,"spsearch_itemcnt":26,"spsearch_keycnt":66,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":52,"zuanzhan":0},{"amount":1174,"date":1513526400000,"healthLevel":0,"hotItemCount":253,"itemCount":654,"juhuasuan":0,"mp4p_itemcnt":32,"mp4p_keycnt":188,"msearch_itemcnt":124,"msearch_keycnt":97,"newItemCount":4,"offer":1173,"outOfSeven":false,"p4p":1,"p4p_itemcnt":107,"p4p_keycnt":761,"price":207046,"priceChange":66,"ratio":38.69,"sales":0,"search_itemcnt":406,"search_keycnt":544,"spmsearch_itemcnt":8,"spmsearch_keycnt":9,"spsearch_itemcnt":27,"spsearch_keycnt":66,"taoke":0,"tbouter":0,"titleChange":0,"updateChange":63,"zuanzhan":1},{"amount":1917,"date":1513612800000,"healthLevel":0,"hotItemCount":328,"itemCount":660,"juhuasuan":0,"mp4p_itemcnt":40,"mp4p_keycnt":256,"msearch_itemcnt":115,"msearch_keycnt":102,"newItemCount":0,"offer":1919,"outOfSeven":false,"p4p":1,"p4p_itemcnt":114,"p4p_keycnt":886,"price":279699.6,"priceChange":25,"ratio":49.7,"sales":0,"search_itemcnt":435,"search_keycnt":567,"spmsearch_itemcnt":11,"spmsearch_keycnt":10,"spsearch_itemcnt":25,"spsearch_keycnt":84,"taoke":0,"tbouter":0,"titleChange":4,"updateChange":54,"zuanzhan":1}]
         * total : 8
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
             * amount : 496
             * date : 1512921600000
             * healthLevel : 0
             * hotItemCount : 165
             * itemCount : 684
             * juhuasuan : 0
             * mp4p_itemcnt : 35
             * mp4p_keycnt : 139
             * msearch_itemcnt : 194
             * msearch_keycnt : 331
             * newItemCount : 0
             * offer : 496
             * outOfSeven : false
             * p4p : 1
             * p4p_itemcnt : 128
             * p4p_keycnt : 1434
             * price : 90884
             * priceChange : 0
             * ratio : 24.12
             * sales : 0
             * search_itemcnt : 525
             * search_keycnt : 1122
             * spmsearch_itemcnt : 19
             * spmsearch_keycnt : 28
             * spsearch_itemcnt : 40
             * spsearch_keycnt : 67
             * taoke : 0
             * tbouter : 0
             * titleChange : 0
             * updateChange : 63
             * zuanzhan : 1
             */

            private int amount;
            private long date;
            private int healthLevel;
            private int hotItemCount;
            private int itemCount;
            private int juhuasuan;
            private int mp4p_itemcnt;
            private int mp4p_keycnt;
            private int msearch_itemcnt;
            private int msearch_keycnt;
            private int newItemCount;
            private int offer;
            private boolean outOfSeven;
            private int p4p;
            private int p4p_itemcnt;
            private int p4p_keycnt;
            private int price;
            private int priceChange;
            private double ratio;
            private int sales;
            private int search_itemcnt;
            private int search_keycnt;
            private int spmsearch_itemcnt;
            private int spmsearch_keycnt;
            private int spsearch_itemcnt;
            private int spsearch_keycnt;
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

            public int getMp4p_itemcnt() {
                return mp4p_itemcnt;
            }

            public void setMp4p_itemcnt(int mp4p_itemcnt) {
                this.mp4p_itemcnt = mp4p_itemcnt;
            }

            public int getMp4p_keycnt() {
                return mp4p_keycnt;
            }

            public void setMp4p_keycnt(int mp4p_keycnt) {
                this.mp4p_keycnt = mp4p_keycnt;
            }

            public int getMsearch_itemcnt() {
                return msearch_itemcnt;
            }

            public void setMsearch_itemcnt(int msearch_itemcnt) {
                this.msearch_itemcnt = msearch_itemcnt;
            }

            public int getMsearch_keycnt() {
                return msearch_keycnt;
            }

            public void setMsearch_keycnt(int msearch_keycnt) {
                this.msearch_keycnt = msearch_keycnt;
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

            public int getP4p_itemcnt() {
                return p4p_itemcnt;
            }

            public void setP4p_itemcnt(int p4p_itemcnt) {
                this.p4p_itemcnt = p4p_itemcnt;
            }

            public int getP4p_keycnt() {
                return p4p_keycnt;
            }

            public void setP4p_keycnt(int p4p_keycnt) {
                this.p4p_keycnt = p4p_keycnt;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
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

            public int getSearch_itemcnt() {
                return search_itemcnt;
            }

            public void setSearch_itemcnt(int search_itemcnt) {
                this.search_itemcnt = search_itemcnt;
            }

            public int getSearch_keycnt() {
                return search_keycnt;
            }

            public void setSearch_keycnt(int search_keycnt) {
                this.search_keycnt = search_keycnt;
            }

            public int getSpmsearch_itemcnt() {
                return spmsearch_itemcnt;
            }

            public void setSpmsearch_itemcnt(int spmsearch_itemcnt) {
                this.spmsearch_itemcnt = spmsearch_itemcnt;
            }

            public int getSpmsearch_keycnt() {
                return spmsearch_keycnt;
            }

            public void setSpmsearch_keycnt(int spmsearch_keycnt) {
                this.spmsearch_keycnt = spmsearch_keycnt;
            }

            public int getSpsearch_itemcnt() {
                return spsearch_itemcnt;
            }

            public void setSpsearch_itemcnt(int spsearch_itemcnt) {
                this.spsearch_itemcnt = spsearch_itemcnt;
            }

            public int getSpsearch_keycnt() {
                return spsearch_keycnt;
            }

            public void setSpsearch_keycnt(int spsearch_keycnt) {
                this.spsearch_keycnt = spsearch_keycnt;
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
}
