package com.example.dolgi_islam;


import android.content.*;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.*;

public class TodayNamasActivity extends AppCompatActivity implements View.OnClickListener{
    private CheckBox fajr;
    private CheckBox fadjr_sunna;
    private CheckBox fadjr_fard;
    private CheckBox zuckhr;
    private CheckBox zuckhr_sunna_4;
    private CheckBox zuckhr_fard;
    private CheckBox zuckhr_sunna_2;
    private CheckBox asr;
    private CheckBox asr_sunna;
    private CheckBox asr_fard;
    private CheckBox magrib;
    private CheckBox magrib_fard;
    private CheckBox magrib_sunna;
    private CheckBox isha;
    private CheckBox isha_sunna_4;
    private CheckBox isha_fard;
    private CheckBox isha_sunna_2;
    private CheckBox tahajud;
    private CheckBox witr_vajib;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todaynamaz);

        Button main = findViewById(R.id.back);
        main.setOnClickListener(this);

        this.fajr = findViewById(R.id.fadjr);
        this.fadjr_sunna = findViewById(R.id.fadjr_sunna);
        this.fadjr_fard = findViewById(R.id.fadjr_fard);

        this.zuckhr = findViewById(R.id.Zuckhr);
        this.zuckhr_sunna_4 = findViewById(R.id.Zuckhr_sunna_4);
        this.zuckhr_fard = findViewById(R.id.Zuckhr_fard);
        this.zuckhr_sunna_2 = findViewById(R.id.Zuckhr_sunna_2);

        this.asr = findViewById(R.id.asr);
        this.asr_sunna = findViewById(R.id.asr_sunna);
        this.asr_fard = findViewById(R.id.asr_fard);

        this.magrib = findViewById(R.id.Magrib);
        this.magrib_fard = findViewById(R.id.Magrib_fard);
        this.magrib_sunna = findViewById(R.id.Magrib_sunna);

        this.isha = findViewById(R.id.Isha);
        this.isha_sunna_4 = findViewById(R.id.Isha_sunna_4);
        this.isha_fard = findViewById(R.id.Isha_fard);
        this.isha_sunna_2 = findViewById(R.id.Isha_sunna_2);
        this.tahajud = findViewById(R.id.Tahajud);
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

        this.fadjr_sunna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkFajr(isChecked);
            }
        });

        this.fadjr_fard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkFajr(isChecked);
            }
        });

        this.zuckhr_sunna_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkZuckhr(isChecked);
            }
        });

        this.zuckhr_fard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkZuckhr(isChecked);
            }
        });

        this.zuckhr_sunna_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkZuckhr(isChecked);
            }
        });

        this.asr_sunna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAsr(isChecked);
            }
        });

        this.asr_fard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAsr(isChecked);
            }
        });

        this.magrib_fard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkMagrib(isChecked);
            }
        });

        this.magrib_sunna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkMagrib(isChecked);
            }
        });

        this.isha_sunna_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkIsha(isChecked);
            }
        });

        this.isha_fard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkIsha(isChecked);
            }
        });

        this.isha_sunna_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkIsha(isChecked);
            }
        });

        this.tahajud.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkIsha(isChecked);
            }
        });

        this.witr_vajib.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkIsha(isChecked);
            }
        });

    }

    private void checkAllFajrCheckedChange(boolean isChecked)  {
        this.fadjr_sunna.setChecked(isChecked);
        this.fadjr_fard.setChecked(isChecked);
    }

    private void checkAllZuckrCheckedChange(boolean isChecked) {
        this.zuckhr_sunna_4.setChecked(isChecked);
        this.zuckhr_fard.setChecked(isChecked);
        this.zuckhr_sunna_2.setChecked(isChecked);
    }

    private void checkAllAsrCheckedChange(boolean isChecked) {
        this.asr_sunna.setChecked(isChecked);
        this.asr_fard.setChecked(isChecked);
    }

    private void checkAllMagribCheckedChange(boolean isChecked) {
        this.magrib_fard.setChecked(isChecked);
        this.magrib_sunna.setChecked(isChecked);
    }

    private void checkAllIshaCheckedChange(boolean isChecked) {
        this.isha_sunna_4.setChecked(isChecked);
        this.isha_fard.setChecked(isChecked);
        this.isha_sunna_2.setChecked(isChecked);
        this.tahajud.setChecked(isChecked);
        this.witr_vajib.setChecked(isChecked);
    }

    private void checkFajr (boolean isChecked) {
        if (fadjr_sunna.isChecked() & fadjr_fard.isChecked()) {
            this.fajr.setChecked(isChecked);
        }
    }

    private void checkZuckhr (boolean isChecked) {
        if (zuckhr_sunna_4.isChecked() & zuckhr_fard.isChecked() & zuckhr_sunna_2.isChecked()) {
            this.zuckhr.setChecked(isChecked);
        }
    }

    private void checkAsr (boolean isChecked) {
        if (asr_sunna.isChecked() & asr_fard.isChecked()) {
            this.asr.setChecked(isChecked);
        }
    }

    private void checkMagrib (boolean isChecked) {
        if (magrib_fard.isChecked() & magrib_sunna.isChecked()) {
            this.magrib.setChecked(isChecked);
        }
    }

    private void checkIsha (boolean isChecked) {
        if (isha_sunna_4.isChecked() & isha_fard.isChecked() & isha_sunna_2.isChecked() & tahajud.isChecked() & witr_vajib.isChecked()) {
            this.isha.setChecked(isChecked);
        }
    }


    @Override
    public void onClick(View view) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}