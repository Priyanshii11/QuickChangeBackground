package com.priyu.quickchange;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.priyu.quickchange.R.id;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.radio);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                switch (checked){
                    case R.id.blue:
                        layout.setBackgroundColor(Color.parseColor("#12B0E8"));
                        break;
                    case R.id.yellow:
                        layout.setBackgroundColor(Color.parseColor("#F7CD2E"));
                        break;
                    case R.id.red:
                        layout.setBackgroundColor(Color.parseColor("#E6425E"));
                        break;
                }

            }
        });
    }
}