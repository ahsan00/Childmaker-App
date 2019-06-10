package com.example.lenovo.childrenmaker;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main9Activity extends AppCompatActivity {
    ViewPager viewPager;
    customadapterE adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        viewPager=(ViewPager)findViewById(R.id.viewpage);
        adapter=new customadapterE(this);
        viewPager.setAdapter(adapter);
    }
}
