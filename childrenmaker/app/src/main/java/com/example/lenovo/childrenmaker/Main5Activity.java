package com.example.lenovo.childrenmaker;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void click(View view)
    {

        Button button = (Button)findViewById(R.id.btn1);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.oo);
        mp.start();
    }
    public void click1(View view)
    {
        Button button = (Button)findViewById(R.id.btn2);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.na);
        mp.start();
    }
    public void click2(View view)
    {
        Button button = (Button)findViewById(R.id.btn3);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.ni);
        mp.start();
    }
    public void click3(View view)
    {
        Button button = (Button)findViewById(R.id.btn4);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.nio);
        mp.start();
    }
    public void click4(View view)
    {
        Button button = (Button)findViewById(R.id.btn5);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.nrou);
        mp.start();
    }
    public void click5(View view)
    {
        Button button = (Button)findViewById(R.id.btn6);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.nrou);
        mp.start();
    }
    public void click6(View view)
    {
        Button button = (Button)findViewById(R.id.btn7);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.nr);
        mp.start();
    }
    public void click7(View view)
    {
        Button button = (Button)findViewById(R.id.btn8);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.ne);
        mp.start();
    }
    public void click8(View view)
    {
        Button button = (Button)findViewById(R.id.btn9);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.noi);
        mp.start();
    }
    public void click9(View view)
    {
        Button button = (Button)findViewById(R.id.btn10);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.nuu);
        mp.start();
    }
    public void click10(View view)
    {
        Button button = (Button)findViewById(R.id.btn11);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.noou);
        mp.start();
    }


}
