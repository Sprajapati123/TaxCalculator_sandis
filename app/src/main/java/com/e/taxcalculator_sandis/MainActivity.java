package com.e.taxcalculator_sandis;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtsalary;
    Button btncalculate;
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtsalary = findViewById(R.id.txtsalary);
        btncalculate = findViewById(R.id.btncalculate);
        display = findViewById(R.id.display);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double salary, tax;

                salary = Double.parseDouble(txtsalary.getText().toString())*12;

                Taxcalculator taxcalculator=new Taxcalculator(salary);

                tax=taxcalculator.calculate();

                display.setText("Your annual tax is : " + tax);


                }
        });

        }
    }

