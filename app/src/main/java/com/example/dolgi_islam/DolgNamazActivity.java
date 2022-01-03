package com.example.dolgi_islam;


import android.content.*;
import android.graphics.*;
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

    private TextView vosp;
    private TextView ost;

    private int dolg;
    private int sdel;

    private Button reset;
    private Button plus;
    private Button minus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolg_namaz);


        vosp = findViewById(R.id.vospolnil);
        ost = findViewById(R.id.ostalos);
        int this_dolg = getIntent().getIntExtra("dney", 0);
        ost.setText(Integer.toString(this_dolg));
        ost.setTextColor(Color.rgb(18,112,90));
        vosp.setText("0");

        reset = findViewById(R.id.reset);
        reset.setOnClickListener(this);

        plus = findViewById(R.id.plus);
        plus.setOnClickListener(this);

        minus = findViewById(R.id.minus);
        minus.setOnClickListener(this);

        Button nmainn = findViewById(R.id.backback);
        nmainn.setOnClickListener(this);

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

        this.fadjr_fard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkFajr(isChecked);
            }
        });

        this.zuckhr_fard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkZuckhr(isChecked);
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

        this.isha_fard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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

    private void checkFajr (boolean isChecked) {
        if (fadjr_fard.isChecked()) {
            this.fajr.setChecked(isChecked);
        }
    }

    private void checkZuckhr (boolean isChecked) {
        if (zuckhr_fard.isChecked()) {
            this.zuckhr.setChecked(isChecked);
        }
    }

    private void checkAsr (boolean isChecked) {
        if (asr_fard.isChecked()) {
            this.asr.setChecked(isChecked);
        }
    }

    private void checkMagrib (boolean isChecked) {
        if (magrib_fard.isChecked()) {
            this.magrib.setChecked(isChecked);
        }
    }

    private void checkIsha (boolean isChecked) {
        if (isha_fard.isChecked()& witr_vajib.isChecked()) {
            this.isha.setChecked(isChecked);
        }
    }







    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backback:
                Intent main = new Intent(this, MainActivity.class);
                startActivity(main);
                break;

            case R.id.reset:
                this.fajr.setChecked(false);
                this.fadjr_fard.setChecked(false);
                this.zuckhr.setChecked(false);
                this.zuckhr_fard.setChecked(false);
                this.asr.setChecked(false);
                this.asr_fard.setChecked(false);
                this.magrib.setChecked(false);
                this.magrib_fard.setChecked(false);
                this.isha.setChecked(false);
                this.isha_fard.setChecked(false);
                this.witr_vajib.setChecked(false);
                break;

            case R.id.plus:
                this.fajr.setChecked(false);
                this.fadjr_fard.setChecked(false);
                this.zuckhr.setChecked(false);
                this.zuckhr_fard.setChecked(false);
                this.asr.setChecked(false);
                this.asr_fard.setChecked(false);
                this.magrib.setChecked(false);
                this.magrib_fard.setChecked(false);
                this.isha.setChecked(false);
                this.isha_fard.setChecked(false);
                this.witr_vajib.setChecked(false);

                dolg = Integer.parseInt(ost.getText().toString());
                dolg--;
                ost.setText(Integer.toString(dolg));
                sdel = Integer.parseInt(vosp.getText().toString());
                sdel++;
                vosp.setText(Integer.toString(sdel));
                break;

            case R.id.minus:

                this.fajr.setChecked(false);
                this.fadjr_fard.setChecked(false);
                this.zuckhr.setChecked(false);
                this.zuckhr_fard.setChecked(false);
                this.asr.setChecked(false);
                this.asr_fard.setChecked(false);
                this.magrib.setChecked(false);
                this.magrib_fard.setChecked(false);
                this.isha.setChecked(false);
                this.isha_fard.setChecked(false);
                this.witr_vajib.setChecked(false);

                dolg = Integer.parseInt(ost.getText().toString());
                sdel = Integer.parseInt(vosp.getText().toString());
                final int a = dolg;
                if ((Integer.parseInt(ost.getText().toString()) <= a) & (sdel > 0)) {
                    dolg++;
                    ost.setText(Integer.toString(dolg));
                    sdel--;
                    vosp.setText(Integer.toString(sdel));
                }

                break;

        }
    }
}