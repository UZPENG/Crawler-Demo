package entity;

import java.util.List;

/**
 * @author serverliu on 2017/12/20.
 */
public class DiamondEntity {
    /**
     * api_name : shop_get_market_zuanzhan_list
     * data : {"list":[{"amount":1917,"date":1513612800000,"displayRate":4061,"imageUrl":"https://img.alicdn.com/simba/img/TB1wsgKijuhSKJjSspaSutFgFXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":279699},{"amount":1183,"date":1513526400000,"displayRate":1402,"imageUrl":"https://img.alicdn.com/simba/img/TB1fueImwoQMeJjy0FoSuwShVXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_天猫首页通栏2","positionType":"通投","price":209177},{"amount":115,"date":1513180800000,"displayRate":789,"imageUrl":"https://img.alicdn.com/simba/img/TB1cQQJijuhSKJjSspaSutFgFXa.jpg","position":"PC_网上购物_淘宝首页焦点图2","positionType":"通投","price":14625},{"amount":4043,"date":1513094400000,"displayRate":2000,"imageUrl":"https://img.alicdn.com/simba/img/TB1fueImwoQMeJjy0FoSuwShVXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3","positionType":"通投","price":550647},{"amount":61216,"date":1513008000000,"displayRate":4061,"imageUrl":"https://img.alicdn.com/simba/img/TB1chg0cpYM8KJjSZFuSuwf7FXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":8799656},{"amount":581,"date":1512921600000,"displayRate":3371,"imageUrl":"https://img.alicdn.com/simba/img/TB12_43g0fJ8KJjy0FeSutKEXXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":91791},{"amount":855,"date":1512835200000,"displayRate":4061,"imageUrl":"https://img.alicdn.com/simba/img/TB1zMSegZnI8KJjSspeSuwwIpXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":139975},{"amount":778,"date":1512748800000,"displayRate":4061,"imageUrl":"https://img.alicdn.com/simba/img/TB1AXX0g0zJ8KJjSspkSuvF7VXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":125252},{"amount":701,"date":1512576000000,"displayRate":3274,"imageUrl":"https://img.alicdn.com/simba/img/TB1zMSegZnI8KJjSspeSuwwIpXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":116499},{"amount":3103,"date":1512489600000,"displayRate":4061,"imageUrl":"https://img.alicdn.com/simba/img/TB1HFkMiaigSKJjSsppSuubnpXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":509607}],"total":24}
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
         * list : [{"amount":1917,"date":1513612800000,"displayRate":4061,"imageUrl":"https://img.alicdn.com/simba/img/TB1wsgKijuhSKJjSspaSutFgFXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":279699},{"amount":1183,"date":1513526400000,"displayRate":1402,"imageUrl":"https://img.alicdn.com/simba/img/TB1fueImwoQMeJjy0FoSuwShVXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_天猫首页通栏2","positionType":"通投","price":209177},{"amount":115,"date":1513180800000,"displayRate":789,"imageUrl":"https://img.alicdn.com/simba/img/TB1cQQJijuhSKJjSspaSutFgFXa.jpg","position":"PC_网上购物_淘宝首页焦点图2","positionType":"通投","price":14625},{"amount":4043,"date":1513094400000,"displayRate":2000,"imageUrl":"https://img.alicdn.com/simba/img/TB1fueImwoQMeJjy0FoSuwShVXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3","positionType":"通投","price":550647},{"amount":61216,"date":1513008000000,"displayRate":4061,"imageUrl":"https://img.alicdn.com/simba/img/TB1chg0cpYM8KJjSZFuSuwf7FXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":8799656},{"amount":581,"date":1512921600000,"displayRate":3371,"imageUrl":"https://img.alicdn.com/simba/img/TB12_43g0fJ8KJjy0FeSutKEXXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":91791},{"amount":855,"date":1512835200000,"displayRate":4061,"imageUrl":"https://img.alicdn.com/simba/img/TB1zMSegZnI8KJjSspeSuwwIpXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":139975},{"amount":778,"date":1512748800000,"displayRate":4061,"imageUrl":"https://img.alicdn.com/simba/img/TB1AXX0g0zJ8KJjSspkSuvF7VXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":125252},{"amount":701,"date":1512576000000,"displayRate":3274,"imageUrl":"https://img.alicdn.com/simba/img/TB1zMSegZnI8KJjSspeSuwwIpXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":116499},{"amount":3103,"date":1512489600000,"displayRate":4061,"imageUrl":"https://img.alicdn.com/simba/img/TB1HFkMiaigSKJjSsppSuubnpXa.jpg","position":"PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4","positionType":"通投","price":509607}]
         * total : 24
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
             * amount : 1917
             * date : 1513612800000
             * displayRate : 4061
             * imageUrl : https://img.alicdn.com/simba/img/TB1wsgKijuhSKJjSspaSutFgFXa.jpg
             * position : PC_网上购物_淘宝首页焦点图2,PC_网上购物_淘宝首页焦点图右侧banner二,PC_网上购物_天猫首页焦点图2,PC_网上购物_天猫首页通栏2,PC_网上购物_天猫首页通栏3,PC_网上购物_天猫首页通栏4
             * positionType : 通投
             * price : 279699
             */

            private int amount;
            private long date;
            private int displayRate;
            private String imageUrl;
            private String position;
            private String positionType;
            private double price;

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

            public int getDisplayRate() {
                return displayRate;
            }

            public void setDisplayRate(int displayRate) {
                this.displayRate = displayRate;
            }

            public String getImageUrl() {
                return imageUrl;
            }

            public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getPositionType() {
                return positionType;
            }

            public void setPositionType(String positionType) {
                this.positionType = positionType;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }
        }
    }
}
