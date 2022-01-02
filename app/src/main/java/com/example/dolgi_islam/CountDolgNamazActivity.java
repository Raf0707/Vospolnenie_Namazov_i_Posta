package com.example.dolgi_islam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class CountDolgNamazActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText tsel;
    private TextView podschet;
    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_dolg_namaz);

        Button start = findViewById(R.id.back);
        start.setOnClickListener(this);

        tsel = findViewById(R.id.tsel);
        podschet = findViewById(R.id.podschet);
        ok = findViewById(R.id.ok);
        ok.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ok:
                int dolg = Integer.parseInt(tsel.getText().toString());
                int dney = dolg * 365;
                int namazov = dolg * 365 * 6;
                String strDney = Integer.toString(dney);
                String strNamazov = Integer.toString(namazov);
                podschet.setText("Вам надо восполнить долг за " + strDney + " дней, совершить " + strNamazov + " намазов. ");
                break;
            case R.id.startt:
                Intent start = new Intent(this, DolgNamazActivity.class);
                startActivity(start);
        }
    }
}