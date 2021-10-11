package com.example.practice23;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Text1 = (TextView) findViewById(R.id.Text1);
        TextView Text2 = (TextView) findViewById(R.id.Text2);
        Button GreenBtn = findViewById(R.id.greenBtn);
        Button RedBtn = findViewById(R.id.redBtn);
        GreenBtn.setBackgroundColor(Color.GREEN);
        RedBtn.setBackgroundColor(Color.RED);
        GreenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setTextColor(Color.GREEN);
                Text2.setTextColor(Color.GREEN);
            }
        });
        RedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setTextColor(Color.RED);
                Text2.setTextColor(Color.RED);
            }
        });
    }
}