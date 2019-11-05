package com.bawei.zhangzhibo_week01.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.zhangzhibo_week01.R;
import com.bawei.zhangzhibo_week01.bean.Beans;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 *  * <p>文件描述：<p>
 *  * <p>作者：Zhang Zhi Bo<p>
 *  * <p>创建时间：2019/11/5 09 35 34<p>
 *  * <p>版本号：1<p>
 */
public class GridAdapter extends BaseAdapter {
    private List<Beans.GriddataBean> list ;
    private Context context;
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null){
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.image);
            viewHolder.textView = convertView.findViewById(R.id.text);
            convertView.setTag(convertView);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Glide.with(context).load(list.get(position).title).into(viewHolder.imageView);

        return convertView;
    }
    class  ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
