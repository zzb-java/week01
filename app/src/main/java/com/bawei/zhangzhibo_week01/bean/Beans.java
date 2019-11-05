package com.bawei.zhangzhibo_week01.bean;

import java.util.List;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/11/5 09 00 05<p>
 *  * <p>版本号：1<p>
 */
public class Beans  {

    /**
     * code : 200
     * bannerdata : [{"imageurl":"http://blog.zhaoliang5156.cn/api/images/banner01.jpg"},{"imageurl":"http://blog.zhaoliang5156.cn/api/images/banner02.jpg"},{"imageurl":"http://blog.zhaoliang5156.cn/api/images/banner03.jpg"},{"imageurl":"http://blog.zhaoliang5156.cn/api/images/banner04.jpg"},{"imageurl":"http://blog.zhaoliang5156.cn/api/images/banner05.jpg"}]
     * griddata : [{"title":"Yves Saint Laurent 圣罗兰黑管水光唇釉","price":"288","imageurl":"http://blog.zhaoliang5156.cn/api/images/shop01.jpeg"},{"title":"LADUREE 拉杜丽经典玫瑰花瓣腮红","price":"888","imageurl":"http://blog.zhaoliang5156.cn/api/images/shop02.png"},{"title":"BOBBI BROWN 芭比波朗炙恋唇膏","price":"240","imageurl":"http://blog.zhaoliang5156.cn/api/images/shop03.png"},{"title":"韩国nounours 北极熊看护宝宝小夜灯多功能看灯","price":"192","imageurl":"http://blog.zhaoliang5156.cn/api/images/shop04.jpeg"}]
     */

    public String code;
    public List<BannerdataBean> bannerdata;
    public List<GriddataBean> griddata;

    public static class BannerdataBean {
        /**
         * imageurl : http://blog.zhaoliang5156.cn/api/images/banner01.jpg
         */

        public String imageurl;
    }

    public static class GriddataBean {
        /**
         * title : Yves Saint Laurent 圣罗兰黑管水光唇釉
         * price : 288
         * imageurl : http://blog.zhaoliang5156.cn/api/images/shop01.jpeg
         */

        public String title;
        public String price;
        public String imageurl;
    }
}
