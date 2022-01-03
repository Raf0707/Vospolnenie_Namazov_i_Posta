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
    private int dolg;
    public int dney;
    private int namazov;
    private String strDney;
    private String strNamazov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_dolg_namaz);

        Button starter = findViewById(R.id.startt);
        starter.setOnClickListener(this);

        tsel = findViewById(R.id.tsel);
        podschet = findViewById(R.id.podschet);
        ok = findViewById(R.id.ok);
        ok.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ok:
                dolg = Integer.parseInt(tsel.getText().toString());
                if (dolg <= 0) {
                    Toast.makeText(this, "Введите число больше нуля",Toast.LENGTH_SHORT).show();
                    break;
                }
                dney = dolg * 365;
                namazov = dolg * 365 * 6;
                strDney = Integer.toString(dney);
                strNamazov = Integer.toString(namazov);
                podschet.setText(String.format("Вам надо восполнить долг за %s дней, совершить %s намазов. ", strDney, strNamazov));
                break;

            case R.id.startt:
                Intent start = new Intent(this, DolgNamazActivity.class);
                start.putExtra("dney", dney);
                startActivity(start);
        }
    }
}