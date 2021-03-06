package com.leaf2023.ap_cs_agrasp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BaseConversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_conversion);

        EditText numField = findViewById(R.id.editTextNumberDecimalNum);
        EditText fBaseField = findViewById(R.id.editTextNumberDecimalFromBase);
        EditText tBaseField = findViewById(R.id.editTextNumberDecimalToBase);
        TextView result = findViewById(R.id.resultBase);

        // Register listener
        findViewById(R.id.buttonSubmitBase).setOnClickListener(view -> {
            try {
                  // Parse
                  int num = Integer.parseInt((!numField.getText().toString().equals("") ? numField.getText().toString() : "0"));
                  int fBase = Integer.parseInt((!fBaseField.getText().toString().equals("") ? fBaseField.getText().toString() : "0"));
                  int tBase = Integer.parseInt((!tBaseField.getText().toString().equals("") ? tBaseField.getText().toString() : "0"));

                  // Base conversion
                  result.setText(Integer.toString(Integer.parseInt(String.valueOf(num), fBase), tBase));
            } catch (NumberFormatException x) {
                result.setText("Please fill correct values");
            }
        });
    }
}