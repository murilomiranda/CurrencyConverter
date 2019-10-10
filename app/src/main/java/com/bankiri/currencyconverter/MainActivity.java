package com.bankiri.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertMoney(View view) {
        EditText editText = findViewById(R.id.editText);
        Log.i("Info", "Button pressed");

        double amountDollar = Double.parseDouble(editText.getText().toString());
        double amountEuro = amountDollar*0.911257;

        Toast.makeText(this, "$" + String.format("%.2f", amountDollar) + " is €" + String.format("%.2f", amountEuro), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
