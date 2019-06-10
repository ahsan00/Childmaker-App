package com.example.lenovo.childrenmaker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class customadapter extends PagerAdapter {
    String[]st={"আ","প","ব","ক","জ","ঘ","ম","ছ","ঈ","ফ"};
    String[]name={"আপেল","পাখি","বিড়াল","কমলা","জুতা","ঘুড়ি","মুরগী","ছাগল","ঈগল","ফ্যান"};
    int []image={R.drawable.apple,R.drawable.bird,R.drawable.cat,R.drawable.orange,
            R.drawable.shoes,R.drawable.kite,R.drawable.hen,R.drawable.goat,R.drawable.egol,
            R.drawable.fan};
    Context context;
    LayoutInflater layoutInflater;

    public customadapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(  View view, @NonNull Object object) {
        return (view==(LinearLayout)object);
    }


    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item=layoutInflater.inflate(R.layout.custom_layout,container,false);

        ImageView imageView=(ImageView)item.findViewById(R.id.imageview);
        TextView textView=(TextView)item.findViewById(R.id.textview1);
       TextView textView1=(TextView)item.findViewById(R.id.textview2);

        imageView.setImageResource(image[position]);
        textView.setText(name[position]);
        textView1.setText(st[position]);
        container.addView(item);


        return item;


    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);

    }
}
