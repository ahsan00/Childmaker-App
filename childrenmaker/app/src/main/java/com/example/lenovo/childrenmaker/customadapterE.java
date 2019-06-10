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

public class customadapterE extends PagerAdapter {
    String[]st={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","Y","Z"};
    String[]name={"apple","bird","cat","Dog","Elephent","Fan","Goat","Hen","Icecream","Jag","Kite","Leaf","Mango",
    "Net","Orange","Pen","Queen","Rose","Shoes","Tiger","Umbrella","Van","Watch","Yellow","Zebra"};
    int []image={R.drawable.apple,R.drawable.bird,R.drawable.cat,R.drawable.dog,R.drawable.elephant,R.drawable.fan,
    R.drawable.goat,R.drawable.hen,R.drawable.icecream,R.drawable.jag,R.drawable.kite,R.drawable.leaf,R.drawable.mango,
   R.drawable.net,R.drawable.orange,R.drawable.pen,R.drawable.queen,R.drawable.rose,R.drawable.shoes,R.drawable.tiger
    ,R.drawable.umbrella,R.drawable.van,R.drawable.watch,R.drawable.yellow,R.drawable.zebra};
    Context context;
    LayoutInflater layoutInflater;

    public customadapterE(Context context) {
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
        View item=layoutInflater.inflate(R.layout.custom_layout1,container,false);

        ImageView imageView=(ImageView)item.findViewById(R.id.imageview);
        TextView textView=(TextView)item.findViewById(R.id.textview1);
        TextView textView1=(TextView)item.findViewById(R.id.textview2);
        imageView.setImageResource(image[position]);
        textView.setText(st[position]);
        textView1.setText(name[position]);
        container.addView(item);


        return item;


    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);

    }
}
