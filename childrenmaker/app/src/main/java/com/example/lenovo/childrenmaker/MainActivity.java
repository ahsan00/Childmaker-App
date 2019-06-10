package com.example.lenovo.childrenmaker;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                counter++;

            }

            @Override
            public void onFinish() {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);


            }
        }.start();
    }
}
