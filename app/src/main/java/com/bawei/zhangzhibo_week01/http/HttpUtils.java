package com.bawei.zhangzhibo_week01.http;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.zhangzhibo_week01.app.MyApp;
import com.bawei.zhangzhibo_week01.contract.Contract;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/11/5 08 59 29<p>
 *  * <p>版本号：1<p>
 */
public class HttpUtils {
    //单例
    public static HttpUtils httpUtils;

    private HttpUtils(){}

    private HttpUtils getHttpUtils() {
        return httpUtils;
    }
    //网络判断
    public boolean network(Context context){
        if (context!=null){
            ConnectivityManager systemService = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = systemService.getActiveNetworkInfo();
            if (activeNetworkInfo!=null){
                return activeNetworkInfo.isConnected();
            }
        }
        return  false;
    }
    //网络请求
    public void toget(String url, final Contract.iModle iModle){
       final RequestQueue requestQueue = Volley.newRequestQueue(MyApp.context);
        StringRequest stringRequest = new StringRequest(0, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                 iModle.success(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                 iModle.failure(error.toString());
            }
        });
    }

}
