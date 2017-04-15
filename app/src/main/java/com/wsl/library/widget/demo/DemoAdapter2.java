package com.wsl.library.widget.demo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.wsl.library.widget.DdNineGridAppendAdapter;

import java.util.List;
import java.util.Random;

/**
 * Created by wsl on 17/4/15.
 */

public class DemoAdapter2 extends DdNineGridAppendAdapter<Bean> {

    private LayoutInflater mLayoutInflater;
    private Context mContext;

    public DemoAdapter2(Context context, List<Bean> objects) {
        this(context, objects, 9);
    }

    public DemoAdapter2(Context context, List<Bean> objects, int max) {
        super(objects, max);
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    protected View getNormalView(int position) {
        View view = mLayoutInflater.inflate(R.layout.item2, null);
        ImageView imageView = (ImageView) view;
        Bean bean = getItem(position);
        Glide
                .with(mContext)
                .load(bean.url)
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .crossFade()
                .into(imageView);

        return view;
    }

    @Override
    protected View getAddView() {
        View view = mLayoutInflater.inflate(R.layout.item_add, null);
        return view;
    }

    private int getNormalColor() {
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}
