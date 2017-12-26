package entity;

import java.util.List;

public class OfferDetailInfo{
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
            private String date;
            private int amount;
            private String amountGrowth;
            private String brand;
            private int catId;
            private String catName;
            private long id;
            private String image;
            private int juhuasuan;
            private double oriPrice;
            private int p4p;
            private double price;
            private double price1;
            private String priceGrowth;
            private int sales;
            private int shopId;
            private int taoke;
            private int tbouter;
            private String title;
            private int zuanzhan;
            private List<CatListBean> catList;

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

            public double getPrice1() {
                return price1;
            }

            public void setPrice1(double price1) {
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

            public List<CatListBean> getCatList() {
                return catList;
            }

            public void setCatList(List<CatListBean> catList) {
                this.catList = catList;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public static class CatListBean {
                /**
                 * cid : 50012029
                 * isParent : 1
                 * level : 0
                 * name : 运动鞋new
                 * parentCid : 9
                 */

                private int cid;
                private int isParent;
                private int level;
                private String name;
                private int parentCid;

                public int getCid() {
                    return cid;
                }

                public void setCid(int cid) {
                    this.cid = cid;
                }

                public int getIsParent() {
                    return isParent;
                }

                public void setIsParent(int isParent) {
                    this.isParent = isParent;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getParentCid() {
                    return parentCid;
                }

                public void setParentCid(int parentCid) {
                    this.parentCid = parentCid;
                }

            }
        }
    }
}