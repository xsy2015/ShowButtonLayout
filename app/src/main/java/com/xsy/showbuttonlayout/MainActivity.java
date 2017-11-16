package com.xsy.showbuttonlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.xsy.lib.ShowButtonLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ShowButtonLayout mShowBtnLayout;
    private String[] hotWords={"杨幂","父亲逛街发现丢弃儿子","杨紫 落泪","科学家第二次警告","西安退休局长遇害","刘涛十年前旧照"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mListView = findViewById(R.id.mListView);
        mShowBtnLayout = findViewById(R.id.mShowBtnLayout);
    }

    private void initData() {
        for (int i = 0; i < hotWords.length; i++) {
            TextView view = (TextView) LayoutInflater.from(this).inflate(R.layout.hot_search_tv, mShowBtnLayout, false);
            view.setText(hotWords[i]);
            view.setTag(hotWords[i]);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String keyword = (String) view.getTag();
                    Toast.makeText(MainActivity.this,keyword,Toast.LENGTH_LONG).show();
                }
            });
            mShowBtnLayout.addView(view);
        }
    }
}
