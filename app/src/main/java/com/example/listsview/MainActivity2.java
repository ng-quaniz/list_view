package com.example.listsview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
     TextView text;
    @Override




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv = (TextView) findViewById(androidx.constraintlayout.widget.R.id.actionUp);
        Intent intent= getIntent();
        tv.setText(intent.getStringExtra("dulieu"));
    }
}