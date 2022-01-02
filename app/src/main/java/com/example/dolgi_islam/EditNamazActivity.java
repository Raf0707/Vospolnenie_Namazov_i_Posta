package com.example.dolgi_islam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class EditNamazActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_namaz);

        Button main = findViewById(R.id.backk);
        main.setOnClickListener(this);

        Button new_dolg = findViewById(R.id.new_dolg);
        new_dolg.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.backk:
                Intent mainn = new Intent(this, MainActivity.class);
                startActivity(mainn);
                break;
            case R.id.new_dolg:
                Intent count_dolg = new Intent(this, CountDolgNamazActivity.class);
                startActivity(count_dolg);
                break;
        }
    }
}