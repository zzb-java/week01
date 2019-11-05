package com.bawei.zhangzhibo_week01.contract;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/11/5 08 58 14<p>
 *  * <p>版本号：1<p>
 */
public interface Contract {
    interface iView{
        void success(String s);
    }
    interface iModle{
        void success(String s);
        void failure(String f);
    }
    interface iPresenter{
        void getRequest(String request);
    }
}
