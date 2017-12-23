package entity;

import java.util.List;

/**
 * @author serverliu on 2017/12/19.
 */
public class NewItemEntity {

    /**
     * api_name : shop_get_item_new_list
     * data : {"list":[{"createDate":1513582269000,"date":1513582269000,"id":562840756838},{"createDate":1513581482000,"date":1513581482000,"id":562840400712},{"createDate":1513580921000,"date":1513580921000,"id":562941637737},{"createDate":1513580401000,"date":1513580401000,"id":563005038266},{"createDate":1513490297000,"date":1513490297000,"id":562786820576,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB13940dfjM8KJjSZFsXXXdZpXa_!!0-item_pic.jpg","title":"鸿星尔克erke2018新品炮炮兵女子小白鞋防滑耐磨女滑板运动鞋板鞋"},{"createDate":1513347869000,"date":1513347869000,"id":562790842594,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB1tUotiMvD8KJjy0FlXXagBFXa_!!0-item_pic.jpg","title":"鸿星尔克男羽绒服2017冬季新品男子休闲羽绒夹克防风保暖男外套"},{"createDate":1513346454000,"date":1513346454000,"id":562627748508,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1gqlti3vD8KJjSsplXXaIEFXa_!!0-item_pic.jpg","title":"鸿星尔克正品女鞋2018春季新款跑鞋跑步鞋休闲网面透气轻便运动鞋"},{"createDate":1513342835000,"date":1513342835000,"id":562866219702,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB10WtPi4rI8KJjy0FpXXb5hVXa_!!0-item_pic.jpg","title":"鸿星尔克erke2018新款女子时尚防滑耐磨休闲跑步运动鞋女气垫跑鞋"},{"createDate":1513314353000,"date":1513314353000,"id":562725897754,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1p_AmiNHI8KJjy1zbXXaxdpXa_!!0-item_pic.jpg","title":"鸿星尔克erke2018新款春季女子套头卫衣修身简约时尚百搭女运动服"},{"createDate":1513224060000,"date":1513224060000,"id":562382568380,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1ssXphm_I8KJjy0FoXXaFnVXa_!!0-item_pic.jpg","title":"鸿星尔克男跑鞋2017冬季新品男子休闲运动鞋防滑减震耐磨跑步鞋"}],"total":55}
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
         * list : [{"createDate":1513582269000,"date":1513582269000,"id":562840756838},{"createDate":1513581482000,"date":1513581482000,"id":562840400712},{"createDate":1513580921000,"date":1513580921000,"id":562941637737},{"createDate":1513580401000,"date":1513580401000,"id":563005038266},{"createDate":1513490297000,"date":1513490297000,"id":562786820576,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB13940dfjM8KJjSZFsXXXdZpXa_!!0-item_pic.jpg","title":"鸿星尔克erke2018新品炮炮兵女子小白鞋防滑耐磨女滑板运动鞋板鞋"},{"createDate":1513347869000,"date":1513347869000,"id":562790842594,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB1tUotiMvD8KJjy0FlXXagBFXa_!!0-item_pic.jpg","title":"鸿星尔克男羽绒服2017冬季新品男子休闲羽绒夹克防风保暖男外套"},{"createDate":1513346454000,"date":1513346454000,"id":562627748508,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1gqlti3vD8KJjSsplXXaIEFXa_!!0-item_pic.jpg","title":"鸿星尔克正品女鞋2018春季新款跑鞋跑步鞋休闲网面透气轻便运动鞋"},{"createDate":1513342835000,"date":1513342835000,"id":562866219702,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB10WtPi4rI8KJjy0FpXXb5hVXa_!!0-item_pic.jpg","title":"鸿星尔克erke2018新款女子时尚防滑耐磨休闲跑步运动鞋女气垫跑鞋"},{"createDate":1513314353000,"date":1513314353000,"id":562725897754,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1p_AmiNHI8KJjy1zbXXaxdpXa_!!0-item_pic.jpg","title":"鸿星尔克erke2018新款春季女子套头卫衣修身简约时尚百搭女运动服"},{"createDate":1513224060000,"date":1513224060000,"id":562382568380,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1ssXphm_I8KJjy0FoXXaFnVXa_!!0-item_pic.jpg","title":"鸿星尔克男跑鞋2017冬季新品男子休闲运动鞋防滑减震耐磨跑步鞋"}]
         * total : 55
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
             * createDate : 1513582269000
             * date : 1513582269000
             * id : 562840756838
             * image : http://img.alicdn.com/imgextra/i2/349740505/TB13940dfjM8KJjSZFsXXXdZpXa_!!0-item_pic.jpg
             * title : 鸿星尔克erke2018新品炮炮兵女子小白鞋防滑耐磨女滑板运动鞋板鞋
             */

            private long createDate;
            private long date;
            private long id;
            private String image;
            private String title;

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public long getDate() {
                return date;
            }

            public void setDate(long date) {
                this.date = date;
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

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
