package com.example.lenovo.childrenmaker;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main6Activity extends AppCompatActivity {
    ViewPager viewPager;
    customadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        viewPager=(ViewPager)findViewById(R.id.viewpage);
        adapter=new customadapter(this);
        viewPager.setAdapter(adapter);
    }
}
