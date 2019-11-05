package com.bawei.zhangzhibo_week01.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/11/5 08 57 42<p>
 *  * <p>版本号：1<p>
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    public P p;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        p = getP();
        initView();
        initData();
    }

    protected abstract P getP();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract int initLayout();
}
