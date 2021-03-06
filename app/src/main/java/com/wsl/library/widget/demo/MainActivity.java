package com.wsl.library.widget.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.wsl.library.widget.DdNineGridMoreLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<String> URLS = new ArrayList<>();

    DemoAdapter2 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImage();

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.add(generateBean());
            }
        });

        findViewById(R.id.remove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int size = adapter.getCount();
                Random random = new Random();
                int position = random.nextInt(size);
                Log.d("ddd", "remove position:" + position);
                adapter.remove(position);
            }
        });

        List<Bean> beanList = new ArrayList<>();
        beanList.add(generateBean());
        beanList.add(generateBean());
        beanList.add(generateBean());
        beanList.add(generateBean());
        adapter = new DemoAdapter2(this, beanList);
        DdNineGridMoreLayout ddNineGridLayout = (DdNineGridMoreLayout) findViewById(R.id.nineGridLayout);
        ddNineGridLayout.setAdapter(adapter);
    }

    private void initImage() {
        URLS.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1067699850,3255733045&fm=23&gp=0.jpg");
        URLS.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=196405673,1932175745&fm=23&gp=0.jpg");
        URLS.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1147036207,1265769283&fm=23&gp=0.jpg");
        URLS.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3405336042,1143145290&fm=23&gp=0.jpg");
        URLS.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=120005798,172011230&fm=23&gp=0.jpg");
        URLS.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=4276847717,552115419&fm=23&gp=0.jpg");
        URLS.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3893101144,2877209892&fm=23&gp=0.jpg");
        URLS.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1796530425,466061007&fm=23&gp=0.jpg");
        URLS.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1307857613,1734402135&fm=23&gp=0.jpg");
        URLS.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=730397068,25124339&fm=23&gp=0.jpg");
    }

    private Bean generateBean() {
        int size = URLS.size();
        Random random = new Random();
        int index = random.nextInt(size);
        String url = URLS.get(index);
        return new Bean(url);
    }
}
