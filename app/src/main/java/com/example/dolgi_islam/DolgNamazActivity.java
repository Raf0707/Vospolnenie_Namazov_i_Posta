package com.example.dolgi_islam;


import android.content.*;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.*;

public class DolgNamazActivity extends AppCompatActivity implements View.OnClickListener {
    private CheckBox fajr;
    private CheckBox fadjr_fard;
    private CheckBox zuckhr;
    private CheckBox zuckhr_fard;
    private CheckBox asr;
    private CheckBox asr_fard;
    private CheckBox magrib;
    private CheckBox magrib_fard;
    private CheckBox isha;
    private CheckBox isha_fard;
    private CheckBox witr_vajib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolg_namaz);

        Button main = findViewById(R.id.back);
        main.setOnClickListener(this);

        this.fajr = findViewById(R.id.fadjr);
        this.fadjr_fard = findViewById(R.id.fadjr_fard);

        this.zuckhr = findViewById(R.id.Zuckhr);
        this.zuckhr_fard = findViewById(R.id.Zuckhr_fard);

        this.asr = findViewById(R.id.asr);
        this.asr_fard = findViewById(R.id.asr_fard);

        this.magrib = findViewById(R.id.Magrib);
        this.magrib_fard = findViewById(R.id.Magrib_fard);

        this.isha = findViewById(R.id.Isha);
        this.isha_fard = findViewById(R.id.Isha_fard);
        this.witr_vajib = findViewById(R.id.Witr);

        this.fajr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAllFajrCheckedChange(isChecked);
            }
        });

        this.zuckhr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAllZuckrCheckedChange(isChecked);
            }
        });

        this.asr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAllAsrCheckedChange(isChecked);
            }
        });

        this.magrib.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAllMagribCheckedChange(isChecked);
            }
        });

        this.isha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAllIshaCheckedChange(isChecked);
            }
        });

    }

    private void checkAllFajrCheckedChange(boolean isChecked)  {
        this.fadjr_fard.setChecked(isChecked);
    }

    private void checkAllZuckrCheckedChange(boolean isChecked) {
        this.zuckhr_fard.setChecked(isChecked);
    }

    private void checkAllAsrCheckedChange(boolean isChecked) {
        this.asr_fard.setChecked(isChecked);
    }

    private void checkAllMagribCheckedChange(boolean isChecked) {
        this.magrib_fard.setChecked(isChecked);
    }

    private void checkAllIshaCheckedChange(boolean isChecked) {
        this.isha_fard.setChecked(isChecked);
        this.witr_vajib.setChecked(isChecked);

    }


    @Override
    public void onClick(View view) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}