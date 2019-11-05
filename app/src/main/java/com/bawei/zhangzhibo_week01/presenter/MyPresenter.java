package com.bawei.zhangzhibo_week01.presenter;

import android.util.Log;

import com.bawei.zhangzhibo_week01.base.BasePresenter;
import com.bawei.zhangzhibo_week01.bean.Beans;
import com.bawei.zhangzhibo_week01.contract.Contract;
import com.bawei.zhangzhibo_week01.model.MyModel;

import com.google.gson.Gson;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/11/5 08 58 52<p>
 *  * <p>版本号：1<p>
 */
public class MyPresenter extends BasePresenter implements Contract.iPresenter  {
    public com.bawei.zhangzhibo_week01.model.MyModel myModel;
    @Override
    protected void iModel() {
        myModel = new MyModel();
    }

    @Override
    public void getRequest(String request) {
        myModel.getJson(request, new Contract.iModle() {
            @Override
            public void success(String s) {
                Log.e("asd",""+s);
                Gson gson = new Gson();
                Beans beans = gson.fromJson(s, Beans.class);


            }

            @Override
            public void failure(String f) {

            }
        });
    }
}
