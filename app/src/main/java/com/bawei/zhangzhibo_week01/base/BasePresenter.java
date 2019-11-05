package com.bawei.zhangzhibo_week01.base;

import com.bawei.zhangzhibo_week01.contract.Contract;
import com.bawei.zhangzhibo_week01.view.MainActivity;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/11/5 08 57 53<p>
 *  * <p>版本号：1<p>
 */
public abstract class BasePresenter <V extends BaseActivity>{
    public MainActivity v;
    public  BasePresenter(){
        iModel();
    }

    protected abstract void iModel();
    public void attach(V v){
        this.v =v;
    }
    public void  attach(){
        v =null;
    }
}
