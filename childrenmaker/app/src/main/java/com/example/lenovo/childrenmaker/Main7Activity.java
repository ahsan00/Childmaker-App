package com.example.lenovo.childrenmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    canvasview cavas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        cavas=(canvasview)findViewById(R.id.canvasview);
        button =(Button)findViewById(R.id.button1);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1)
        {
            cavas.clearcanvas();
        }

    }
}
