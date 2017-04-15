package com.wsl.library.widget.demo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wsl.library.widget.DdNineGridArrayAdapter;

import java.util.List;

/**
 * Created by wsl on 17/4/15.
 */

public class DemoAdapter extends DdNineGridArrayAdapter<Bean> {

    private LayoutInflater mLayoutInflater;
    private Context mContext;

    public DemoAdapter(Context context, List<Bean> objects) {
        super(objects);
        this.mContext = mContext;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.item, parent, false);
        view.setBackgroundColor(Color.RED);
        return view;
    }
}
