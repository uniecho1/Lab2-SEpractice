package com.selab.helloandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {

    private int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        Button btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt++;
                TextView countTextView = findViewById(R.id.text_counter);
                countTextView.setText("The current number is: "+cnt+".");
            }
        });

        Button btnReduce = findViewById(R.id.btn_reduce);
        btnReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt--;
                TextView countTextView = findViewById(R.id.text_counter);
                countTextView.setText("The current number is: "+cnt+".");
            }
        });

        Button btnClear = findViewById(R.id.btn_clear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt = 0;
                TextView countTextView = findViewById(R.id.text_counter);
                countTextView.setText("The current number is: "+cnt+".");
            }
        });

    }
}