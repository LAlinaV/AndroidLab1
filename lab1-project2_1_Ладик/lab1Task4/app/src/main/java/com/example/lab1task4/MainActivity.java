package com.example.lab1task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but = findViewById(R.id.button);
        TextView tg = findViewById(R.id.tg);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tg.setVisibility(View.VISIBLE);
            }
        });
    }
}