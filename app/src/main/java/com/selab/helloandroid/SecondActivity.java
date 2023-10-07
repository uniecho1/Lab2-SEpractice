package com.selab.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private int cnt = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn = findViewById(R.id.btn_hide);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt++;
                if (cnt % 2 == 0){
                    TextView countTextView = findViewById(R.id.textview_1);
                    countTextView.setText("Hello, Welcome to the second activity!");
                    btn.setText("hide");
                }else{
                    TextView countTextView = findViewById(R.id.textview_1);
                    countTextView.setText("");
                    btn.setText("show");
                }

            }
        });

    }
}