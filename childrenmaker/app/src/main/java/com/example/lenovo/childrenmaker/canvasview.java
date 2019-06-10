package com.example.lenovo.childrenmaker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class canvasview extends View {

    int width;
    int height;
    Bitmap bitmap;
    Canvas canvas;
    Path mpath;
    Paint mpaint;
    float mx,my;
    Context context;
    final float Tolerance=5;

    public canvasview(Context context,  AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        mpath=new Path();
        mpaint=new Paint();

        mpaint.setAntiAlias(true);
        mpaint.setColor(Color.BLACK);
        mpaint.setStyle(Paint.Style.STROKE);
        mpaint.setStrokeJoin(Paint.Join.ROUND);
        mpaint.setStrokeWidth(4f);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(mpath,mpaint);
        super.onDraw(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        bitmap=Bitmap.createBitmap(w,h,Bitmap.Config.ARGB_8888);
        canvas=new Canvas(bitmap);

    }
    public  void starttouch(float x,float y)
    {
        mpath.moveTo(x,y);
        mx=x;
        my=y;
    }
    public void movetouch(float x,float y)
    {
        float dx=Math.abs(x-mx);
        float dy=Math.abs(y-my);

        if(dx>=Tolerance || dy>=Tolerance)
        {
            mpath.quadTo(mx,my,(x+mx)/2,(y+my)/2);
            mx=x;
            my=y;
        }


    }
    public  void clearcanvas()
    {
        mpath.reset();
        invalidate();
    }
    public void uptouch()
    {
        mpath.lineTo(mx,my);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x=event.getX();
        float y=event.getY();
        switch (event.getAction())
        {
            case  MotionEvent.ACTION_DOWN:
                starttouch(x,y);
                invalidate();
                break;

            case  MotionEvent.ACTION_MOVE:
                movetouch(x,y);
                invalidate();
                break;

            case  MotionEvent.ACTION_UP:
                uptouch();
                invalidate();
                break;


        }


        return true;
    }
}

