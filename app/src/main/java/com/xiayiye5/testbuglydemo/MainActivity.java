package com.xiayiye5.testbuglydemo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvText = findViewById(R.id.tvText);
        tvText.setTextColor(Color.RED);
        tvText.setText("修复了bug");
        tvText.setTextSize(30);
    }
}
