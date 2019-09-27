package com.example.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import abhiandroid.com.splashscreen.R;

public class MainActivity extends AppCompatActivity {
    ToggleButton btn;
    EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn = findViewById(R.id.btn);
        this.eText = findViewById(R.id.editText);

        this.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn.isChecked()) {
                    eText.setEnabled(false);

                } else {
                    eText.setEnabled(true);
                }

            }
        });

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //
    }
    }
