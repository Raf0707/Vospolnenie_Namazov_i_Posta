package com.example.dolgi_islam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.Bundle;
import android.view.*;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.resnamaz:
                Intent resnamaz = new Intent(this, ResNamazActivity.class);
                startActivity(resnamaz);
                break;

            case R.id.respost:
                Intent respost = new Intent(this, ResPostActivity.class);
                startActivity(respost);
                break;
        }
    }
}