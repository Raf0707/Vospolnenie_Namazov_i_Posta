package com.example.dolgi_islam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.*;

import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import com.google.android.material.floatingactionbutton.*;

import java.lang.ref.*;

public class EditNamazActivity extends AppCompatActivity {
    Boolean isAllFabsVisible;
    private FloatingActionButton add_fub;
    private FloatingActionButton new_dolg;
    private FloatingActionButton contin;
    private FloatingActionButton main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_namaz);

        //DolgNamazActivity.weakReference = new WeakReference<DolgNamazActivity>(DolgNamazActivity.getApplicationContext());

        main = findViewById(R.id.backk);
        contin = findViewById(R.id.contin);
        new_dolg = findViewById(R.id.new_dolg);
        add_fub = findViewById(R.id.add_fab);

        
        new_dolg.setVisibility(View.GONE);
        contin.setVisibility(View.GONE);
        main.setVisibility(View.GONE);

        isAllFabsVisible = false;

        add_fub.setOnClickListener(view -> {
            if (!isAllFabsVisible) {

                // when isAllFabsVisible becomes
                // true make all the action name
                // texts and FABs VISIBLE.
                new_dolg.show();
                main.show();
                contin.show();

                // make the boolean variable true as
                // we have set the sub FABs
                // visibility to GONE
                isAllFabsVisible = true;

            } else {

                // when isAllFabsVisible becomes
                // true make all the action name
                // texts and FABs GONE.
                new_dolg.hide();
                main.hide();
                contin.hide();

                // make the boolean variable false
                // as we have set the sub FABs
                // visibility to GONE
                isAllFabsVisible = false;
            }
        });

        // below is the sample action to handle add person
        // FAB. Here it shows simple Toast msg. The Toast
        // will be shown only when they are visible and only
        // when user clicks on them
        new_dolg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent count_dolg = new Intent(view.getContext(), CountDolgNamazActivity.class);
                        startActivity(count_dolg);
                    }
                });

        // below is the sample action to handle add alarm
        // FAB. Here it shows simple Toast msg The Toast
        // will be shown only when they are visible and only
        // when user clicks on them
        main.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent mainn = new Intent(view.getContext(), MainActivity.class);
                        startActivity(mainn);
                    }
                });
        contin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent my_save_dolg = new Intent(view.getContext(), DolgNamazActivity.class);
                        startActivity(my_save_dolg);
                    }
                });


    }


}