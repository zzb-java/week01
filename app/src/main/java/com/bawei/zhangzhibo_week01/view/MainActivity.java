package com.bawei.zhangzhibo_week01.view;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.GridView;
import android.widget.ImageView;

import com.bawei.zhangzhibo_week01.R;
import com.bawei.zhangzhibo_week01.adapter.GridAdapter;
import com.bawei.zhangzhibo_week01.base.BaseActivity;
import com.bawei.zhangzhibo_week01.base.BasePresenter;
import com.bawei.zhangzhibo_week01.bean.Beans;
import com.bawei.zhangzhibo_week01.contract.Contract;
import com.bawei.zhangzhibo_week01.presenter.MyPresenter;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.List;

public class MainActivity extends BaseActivity implements Contract.iView  {

    private MyPresenter presenter;
    private Banner banner;
    private GridView gridView;

    @Override
    protected BasePresenter getP() {
        presenter = new MyPresenter();
        return presenter;
    }

    @Override
    protected void initView() {
        banner = findViewById(R.id.banner);
        gridView = findViewById(R.id.gridview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

    }

    @Override
    protected void initData() {
        MyPresenter myPresenter = new MyPresenter();
        myPresenter.getRequest("http://blog.zhaoliang5156.cn/api/shop/jingdong.json");

    }

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void success(final String s) {
        final GridAdapter gridAdapter = new GridAdapter();
        gridView.setAdapter(gridAdapter);

        new AsyncTask<Integer, Integer, Beans.BannerdataBean>() {
            @Override
            protected Beans.BannerdataBean doInBackground(Integer... integers) {
                Gson gson = new Gson();
                Beans beans = gson.fromJson(s,Beans.class);
                List<Beans.BannerdataBean> list  = beans.bannerdata;
                list.addAll(beans.bannerdata);
                return null;
            }

            @Override
            protected void onPostExecute(Beans.BannerdataBean bannerdataBean) {

                banner.setImageLoader(new ImageLoader() {
                    @Override
                    public void displayImage(Context context, Object path, ImageView imageView) {
                        Beans.BannerdataBean b = (Beans.BannerdataBean) path;
                        Glide.with(context).load("http://blog.zhaoliang5156.cn/api/shop/jingdong.json")
                        .into(imageView);

                    }
                });
                super.onPostExecute(bannerdataBean);
                banner.start();
                banner.isAutoPlay(true);
                banner.setDelayTime(2000);


            }
        }.execute();
    }
}
