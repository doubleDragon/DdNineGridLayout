package com.wsl.library.widget.demo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;

import com.wsl.library.widget.DdNineGridAppendAdapter;

import java.util.List;
import java.util.Random;

/**
 * Created by wsl on 17/4/15.
 */

public class DemoAdapter1 extends DdNineGridAppendAdapter<Bean> {

    private LayoutInflater mLayoutInflater;

    public DemoAdapter1(Context context, List<Bean> objects) {
        this(context, objects, 9);
    }

    public DemoAdapter1(Context context, List<Bean> objects, int max) {
        super(objects, max);
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    protected View getNormalView(int position) {
        View view = mLayoutInflater.inflate(R.layout.item, null);
        view.setBackgroundColor(getNormalColor());
        return view;
    }

    @Override
    protected View getAddView() {
        View view = mLayoutInflater.inflate(R.layout.item, null);
        view.setBackgroundColor(Color.BLACK);
        return view;
    }

    private int getNormalColor() {
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}
