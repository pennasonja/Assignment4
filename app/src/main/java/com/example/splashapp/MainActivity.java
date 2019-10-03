package com.example.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

import abhiandroid.com.splashscreen.R;

import static android.accounts.AccountManager.KEY_BOOLEAN_RESULT;

public class MainActivity extends AppCompatActivity {
    ToggleButton btn;
    EditText eText;
    static final String KEY_TEXT_VALUE="textValue";

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
        if (savedInstanceState!=null){
            CharSequence savedText = savedInstanceState.getCharSequence(KEY_TEXT_VALUE);
            eText.setText(savedText);
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putCharSequence(KEY_TEXT_VALUE,eText.getText());
        outState.putBoolean("boolean",eText.isEnabled());
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        eText.setEnabled(savedInstanceState.getBoolean("boolean"));
    }
}

