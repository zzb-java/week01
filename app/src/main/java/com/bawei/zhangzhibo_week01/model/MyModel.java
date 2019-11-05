package com.bawei.zhangzhibo_week01.model;

import com.bawei.zhangzhibo_week01.contract.Contract;
import com.bawei.zhangzhibo_week01.http.HttpUtils;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/11/5 08 58 35<p>
 *  * <p>版本号：1<p>
 */
public class MyModel {
    public  void  getJson(String url, Contract.iModle iModle){
        HttpUtils.httpUtils.toget(url, iModle);
    }
}
