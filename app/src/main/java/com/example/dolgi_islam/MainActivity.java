package com.example.dolgi_islam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button namaz = findViewById(R.id.namaz);
        namaz.setOnClickListener(this);

        Button post = findViewById(R.id.post);
        post.setOnClickListener(this);

        Button today = findViewById(R.id.today);
        today.setOnClickListener(this);

        Button ramadan = findViewById(R.id.ramadan);
        ramadan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.namaz:
                Intent namaz = new Intent(this, EditNamazActivity.class);
                startActivity(namaz);
                break;

            case R.id.post:
                Intent post = new Intent(this, DolgPostActivity.class);
                startActivity(post);
                break;

            case R.id.today:
                Intent today = new Intent(this, TodayNamasActivity.class);
                startActivity(today);
                break;

            case R.id.ramadan:
                Intent ramadan = new Intent(this, RamadanActivity.class);
                startActivity(ramadan);
                break;
        }
    }
}

