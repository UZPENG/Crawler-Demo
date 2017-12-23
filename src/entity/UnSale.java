package entity;

import java.util.List;

/**
 * @author serverliu on 2017/12/19.
 */
public class UnSale {
    /**
     * api_name : data_shop_item_unsale_list
     * data : {"list":[{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":1356,"id":43587399839,"image":"http://img.alicdn.com/imgextra/i4/TB1ljrqNFXXXXcsXFXXXXXXXXXX_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":299,"p4p":0,"price":129,"price30":0,"promotionRatio":0.43,"rate":633,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"【清仓】鸿星尔克男鞋正品男子网面透气鞋减震轻便跑鞋男鞋休闲鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":706,"id":526029496777,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB29w6Raqi5V1BjSszdXXXUJXXa_!!349740505.jpg","juhuasuan":0,"offer30":0,"oriPrice":259,"p4p":0,"price":99,"price30":0,"promotionRatio":0.38,"rate":351,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克女鞋跑步鞋透气网鞋运动新款休闲慢跑鞋运动鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50013228,"changeDate":1513429528000,"favor":372,"id":549963379679,"image":"http://img.alicdn.com/imgextra/i1/TB1YLGURpXXXXcAXpXXXXXXXXXX_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":139,"p4p":0,"price":79,"price30":0,"promotionRatio":0.57,"rate":168,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克短袖女T恤 2017夏季新品休闲时尚女圆领短袖针织衫","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50023108,"changeDate":1513240822000,"favor":86,"id":551080316671,"image":"http://img.alicdn.com/imgextra/i2/TB1hz_QRXXXXXc0apXXXXXXXXXX_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":179,"p4p":0,"price":89,"price30":0,"promotionRatio":0.5,"rate":66,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男2017夏季新品运动短裤纯色舒适松紧修身针织裤男运动裤","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50023108,"changeDate":1513239286000,"favor":114,"id":551162722573,"image":"http://img.alicdn.com/imgextra/i1/TB1Avv1RXXXXXaNapXXXXXXXXXX_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":179,"p4p":0,"price":89,"price30":0,"promotionRatio":0.5,"rate":104,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克2017夏季新品男短裤户外运动健身裤轻便透气轻便男运动裤","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011718,"changeDate":1513622169000,"favor":1510,"id":554669684463,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1KiEoiRDH8KJjSspnXXbNAVXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":199,"price30":0,"promotionRatio":0.59,"rate":263,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克加厚2017秋季运动男风衣户外休闲时尚外套运动上衣","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011718,"changeDate":1513582556000,"favor":644,"id":554780882750,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB1faQTiHYI8KJjy0FaXXbAiVXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":199,"price30":0,"promotionRatio":0.59,"rate":118,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克2017秋季运动男风衣户外休闲时尚外套上衣综训系列训练服","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011718,"changeDate":1513620735000,"favor":236,"id":554781890146,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB1g.4bcAfb_uJkSmLyXXcxoXXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":359,"p4p":0,"price":209,"price30":0,"promotionRatio":0.58,"rate":82,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克2017秋季运动男开衫加厚运动上衣户外休闲时尚外套男上衣","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50023107,"changeDate":1513497682000,"favor":154,"id":556891021006,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB17PMbiIrI8KJjy0FhXXbfnpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":259,"p4p":0,"price":149,"price30":0,"promotionRatio":0.58,"rate":42,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克女运动长裤2017秋季新品舒适百搭时尚保暖针织运动长裤女","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50014493,"favor":46,"id":559092703358,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB1_kT_h9YH8KJjSspdXXcRgVXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":259,"p4p":0,"price":179,"price30":0,"promotionRatio":0.69,"rate":21,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克双肩包男大容量电脑包户外旅行休闲包学生书包","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":8706,"id":560481652550,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB19w66b7fb_uJkSndVXXaBkpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"p4p":0,"price":659,"price30":0,"rate":826,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"【2双装-每个ID限拍一次】鸿星尔克2双装男女福袋 商品随机","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":10,"id":562618863509,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB16iIliMnH8KJjSspcXXb3QFXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":259,"p4p":0,"price":199,"price30":0,"promotionRatio":0.77,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2017新款女综合训练鞋防滑耐磨女子透气跑步鞋运动鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50023107,"changeDate":1513136669000,"favor":6,"id":562620048997,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1bnwViH_I8KJjy1XaXXbsxpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":279,"p4p":0,"price":199,"price30":0,"promotionRatio":0.71,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新款男运动生活长裤假两件时尚个性针织运动裤","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50023107,"favor":6,"id":562620351123,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1O6r6iTnI8KJjSszgXXc8ApXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":199,"p4p":0,"price":159,"price30":0,"promotionRatio":0.8,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新款女子跑步针织运动长裤女休闲舒适简约小脚裤","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011717,"changeDate":1513144890000,"favor":4,"id":562624100595,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1QjwOiL6H8KJjSspmXXb2WXXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":239,"price30":0,"promotionRatio":0.71,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男子运动开衫外套2018春季新品综训上衣男运动休闲外套","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011717,"changeDate":1513147264000,"favor":6,"id":562626504967,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1L7QziL6H8KJjy0FjXXaXepXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":299,"p4p":0,"price":209,"price30":0,"promotionRatio":0.7,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新品春季女子运动服开衫卫衣女简约时尚修身卫衣","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011717,"changeDate":1513314353000,"favor":2,"id":562725897754,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1p_AmiNHI8KJjy1zbXXaxdpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":239,"p4p":0,"price":169,"price30":0,"promotionRatio":0.71,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新款春季女子套头卫衣修身简约时尚百搭女运动服","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012043,"favor":8,"id":562786820576,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB13940dfjM8KJjSZFsXXXdZpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":259,"p4p":0,"price":159,"price30":0,"promotionRatio":0.61,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新品炮炮兵女子小白鞋防滑耐磨女滑板运动鞋板鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":6,"id":562840400712,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB119E_iRDH8KJjSszcXXbDTFXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":209,"price30":0,"promotionRatio":0.62,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男跑步鞋2018春季新品潮鞋男子休闲运动防滑舒适慢跑步鞋","zuanzhan":0},{"amount30":0,"catId":0,"changeDate":1513582269000,"favor":0,"id":562840756838,"image":"//gw2.alicdn.com/bao/uploaded/i2/349740505/TB1YS5ai3DD8KJjy0FdXXcjvXXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":209,"price30":0,"promotionRatio":0.62,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男子跑步鞋2018春季新品黑色跑鞋防滑耐磨减震休闲运动鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"changeDate":1513342835000,"favor":14,"id":562866219702,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB10WtPi4rI8KJjy0FpXXb5hVXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":479,"p4p":0,"price":349,"price30":0,"promotionRatio":0.73,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新款女子时尚防滑耐磨休闲跑步运动鞋女气垫跑鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012041,"changeDate":1513146300000,"favor":6,"id":562867987179,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1inFFcWzB9uJjSZFMXXXq4XXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":239,"price30":0,"promotionRatio":0.71,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男鞋2018春季新品防滑耐磨跑鞋轻便训练鞋网面时尚综训鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":4,"id":562941637737,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB1Ei9viZLJ8KJjy0FnXXcFDpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":399,"p4p":0,"price":249,"price30":0,"promotionRatio":0.62,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男运动鞋2018春季新品男子休闲运动鞋防滑耐磨男慢跑步鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":125088030,"favor":4,"id":563005038266,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB1FE8Di3nH8KJjSspcXXb3QFXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":99,"p4p":0,"price":79,"price30":0,"promotionRatio":0.8,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新品男士平角内裤舒适两件装运动内裤","zuanzhan":0}],"total":24}
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
         * list : [{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":1356,"id":43587399839,"image":"http://img.alicdn.com/imgextra/i4/TB1ljrqNFXXXXcsXFXXXXXXXXXX_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":299,"p4p":0,"price":129,"price30":0,"promotionRatio":0.43,"rate":633,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"【清仓】鸿星尔克男鞋正品男子网面透气鞋减震轻便跑鞋男鞋休闲鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":706,"id":526029496777,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB29w6Raqi5V1BjSszdXXXUJXXa_!!349740505.jpg","juhuasuan":0,"offer30":0,"oriPrice":259,"p4p":0,"price":99,"price30":0,"promotionRatio":0.38,"rate":351,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克女鞋跑步鞋透气网鞋运动新款休闲慢跑鞋运动鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50013228,"changeDate":1513429528000,"favor":372,"id":549963379679,"image":"http://img.alicdn.com/imgextra/i1/TB1YLGURpXXXXcAXpXXXXXXXXXX_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":139,"p4p":0,"price":79,"price30":0,"promotionRatio":0.57,"rate":168,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克短袖女T恤 2017夏季新品休闲时尚女圆领短袖针织衫","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50023108,"changeDate":1513240822000,"favor":86,"id":551080316671,"image":"http://img.alicdn.com/imgextra/i2/TB1hz_QRXXXXXc0apXXXXXXXXXX_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":179,"p4p":0,"price":89,"price30":0,"promotionRatio":0.5,"rate":66,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男2017夏季新品运动短裤纯色舒适松紧修身针织裤男运动裤","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50023108,"changeDate":1513239286000,"favor":114,"id":551162722573,"image":"http://img.alicdn.com/imgextra/i1/TB1Avv1RXXXXXaNapXXXXXXXXXX_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":179,"p4p":0,"price":89,"price30":0,"promotionRatio":0.5,"rate":104,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克2017夏季新品男短裤户外运动健身裤轻便透气轻便男运动裤","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011718,"changeDate":1513622169000,"favor":1510,"id":554669684463,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1KiEoiRDH8KJjSspnXXbNAVXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":199,"price30":0,"promotionRatio":0.59,"rate":263,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克加厚2017秋季运动男风衣户外休闲时尚外套运动上衣","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011718,"changeDate":1513582556000,"favor":644,"id":554780882750,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB1faQTiHYI8KJjy0FaXXbAiVXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":199,"price30":0,"promotionRatio":0.59,"rate":118,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克2017秋季运动男风衣户外休闲时尚外套上衣综训系列训练服","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011718,"changeDate":1513620735000,"favor":236,"id":554781890146,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB1g.4bcAfb_uJkSmLyXXcxoXXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":359,"p4p":0,"price":209,"price30":0,"promotionRatio":0.58,"rate":82,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克2017秋季运动男开衫加厚运动上衣户外休闲时尚外套男上衣","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50023107,"changeDate":1513497682000,"favor":154,"id":556891021006,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB17PMbiIrI8KJjy0FhXXbfnpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":259,"p4p":0,"price":149,"price30":0,"promotionRatio":0.58,"rate":42,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克女运动长裤2017秋季新品舒适百搭时尚保暖针织运动长裤女","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50014493,"favor":46,"id":559092703358,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB1_kT_h9YH8KJjSspdXXcRgVXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":259,"p4p":0,"price":179,"price30":0,"promotionRatio":0.69,"rate":21,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克双肩包男大容量电脑包户外旅行休闲包学生书包","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":8706,"id":560481652550,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB19w66b7fb_uJkSndVXXaBkpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"p4p":0,"price":659,"price30":0,"rate":826,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"【2双装-每个ID限拍一次】鸿星尔克2双装男女福袋 商品随机","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":10,"id":562618863509,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB16iIliMnH8KJjSspcXXb3QFXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":259,"p4p":0,"price":199,"price30":0,"promotionRatio":0.77,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2017新款女综合训练鞋防滑耐磨女子透气跑步鞋运动鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50023107,"changeDate":1513136669000,"favor":6,"id":562620048997,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1bnwViH_I8KJjy1XaXXbsxpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":279,"p4p":0,"price":199,"price30":0,"promotionRatio":0.71,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新款男运动生活长裤假两件时尚个性针织运动裤","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50023107,"favor":6,"id":562620351123,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1O6r6iTnI8KJjSszgXXc8ApXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":199,"p4p":0,"price":159,"price30":0,"promotionRatio":0.8,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新款女子跑步针织运动长裤女休闲舒适简约小脚裤","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011717,"changeDate":1513144890000,"favor":4,"id":562624100595,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1QjwOiL6H8KJjSspmXXb2WXXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":239,"price30":0,"promotionRatio":0.71,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男子运动开衫外套2018春季新品综训上衣男运动休闲外套","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011717,"changeDate":1513147264000,"favor":6,"id":562626504967,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1L7QziL6H8KJjy0FjXXaXepXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":299,"p4p":0,"price":209,"price30":0,"promotionRatio":0.7,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新品春季女子运动服开衫卫衣女简约时尚修身卫衣","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50011717,"changeDate":1513314353000,"favor":2,"id":562725897754,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB1p_AmiNHI8KJjy1zbXXaxdpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":239,"p4p":0,"price":169,"price30":0,"promotionRatio":0.71,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新款春季女子套头卫衣修身简约时尚百搭女运动服","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012043,"favor":8,"id":562786820576,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB13940dfjM8KJjSZFsXXXdZpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":259,"p4p":0,"price":159,"price30":0,"promotionRatio":0.61,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新品炮炮兵女子小白鞋防滑耐磨女滑板运动鞋板鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":6,"id":562840400712,"image":"http://img.alicdn.com/imgextra/i1/349740505/TB119E_iRDH8KJjSszcXXbDTFXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":209,"price30":0,"promotionRatio":0.62,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男跑步鞋2018春季新品潮鞋男子休闲运动防滑舒适慢跑步鞋","zuanzhan":0},{"amount30":0,"catId":0,"changeDate":1513582269000,"favor":0,"id":562840756838,"image":"//gw2.alicdn.com/bao/uploaded/i2/349740505/TB1YS5ai3DD8KJjy0FdXXcjvXXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":209,"price30":0,"promotionRatio":0.62,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男子跑步鞋2018春季新品黑色跑鞋防滑耐磨减震休闲运动鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"changeDate":1513342835000,"favor":14,"id":562866219702,"image":"http://img.alicdn.com/imgextra/i2/349740505/TB10WtPi4rI8KJjy0FpXXb5hVXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":479,"p4p":0,"price":349,"price30":0,"promotionRatio":0.73,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新款女子时尚防滑耐磨休闲跑步运动鞋女气垫跑鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012041,"changeDate":1513146300000,"favor":6,"id":562867987179,"image":"http://img.alicdn.com/imgextra/i4/349740505/TB1inFFcWzB9uJjSZFMXXXq4XXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":339,"p4p":0,"price":239,"price30":0,"promotionRatio":0.71,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男鞋2018春季新品防滑耐磨跑鞋轻便训练鞋网面时尚综训鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":50012036,"favor":4,"id":562941637737,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB1Ei9viZLJ8KJjy0FnXXcFDpXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":399,"p4p":0,"price":249,"price30":0,"promotionRatio":0.62,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克男运动鞋2018春季新品男子休闲运动鞋防滑耐磨男慢跑步鞋","zuanzhan":0},{"amount30":0,"brand":"erke/鸿星尔克 ","catId":125088030,"favor":4,"id":563005038266,"image":"http://img.alicdn.com/imgextra/i3/349740505/TB1FE8Di3nH8KJjSspcXXb3QFXa_!!0-item_pic.jpg","juhuasuan":0,"offer30":0,"oriPrice":99,"p4p":0,"price":79,"price30":0,"promotionRatio":0.8,"rate":0,"sales":0,"shopId":59915065,"taoke":0,"tbouter":0,"title":"鸿星尔克erke2018新品男士平角内裤舒适两件装运动内裤","zuanzhan":0}]
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
             * amount30 : 0
             * brand : erke/鸿星尔克
             * catId : 50012036
             * favor : 1356
             * id : 43587399839
             * image : http://img.alicdn.com/imgextra/i4/TB1ljrqNFXXXXcsXFXXXXXXXXXX_!!0-item_pic.jpg
             * juhuasuan : 0
             * offer30 : 0
             * oriPrice : 299
             * p4p : 0
             * price : 129
             * price30 : 0
             * promotionRatio : 0.43
             * rate : 633
             * sales : 0
             * shopId : 59915065
             * taoke : 0
             * tbouter : 0
             * title : 【清仓】鸿星尔克男鞋正品男子网面透气鞋减震轻便跑鞋男鞋休闲鞋
             * zuanzhan : 0
             * changeDate : 1513429528000
             */

            private int amount30;
            private String brand;
            private int catId;
            private int favor;
            private long id;
            private String image;
            private int juhuasuan;
            private int offer30;
            private int oriPrice;
            private int p4p;
            private int price;
            private int price30;
            private double promotionRatio;
            private int rate;
            private int sales;
            private int shopId;
            private int taoke;
            private int tbouter;
            private String title;
            private int zuanzhan;
            private long changeDate;

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

            public int getFavor() {
                return favor;
            }

            public void setFavor(int favor) {
                this.favor = favor;
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

            public int getOffer30() {
                return offer30;
            }

            public void setOffer30(int offer30) {
                this.offer30 = offer30;
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

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getPrice30() {
                return price30;
            }

            public void setPrice30(int price30) {
                this.price30 = price30;
            }

            public double getPromotionRatio() {
                return promotionRatio;
            }

            public void setPromotionRatio(double promotionRatio) {
                this.promotionRatio = promotionRatio;
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

            public long getChangeDate() {
                return changeDate;
            }

            public void setChangeDate(long changeDate) {
                this.changeDate = changeDate;
            }
        }
    }
}
