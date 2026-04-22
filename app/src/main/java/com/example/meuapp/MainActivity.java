package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btCaucular;
    ImageView imageView;
    EditText etPeso, etAltura;
    TextView tvResultado, tvClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCaucular=findViewById(R.id.btCalcular);
        etPeso=findViewById(R.id.etPeso);
        etAltura=findViewById(R.id.etAltura);


        btCaucular.setOnClickListener(v -> {
            String strPeso = etPeso.getText().toString();
            String strAltura = etAltura.getText().toString();

            Double peso = Double.parseDouble(strPeso);
            Double altura = Double.parseDouble(strAltura);
            Intent i = new Intent(getApplicationContext(), ActivityB.class);
            startActivity(i);
            i.putExtra("peso", peso);
            i.putExtra("altura", altura);
            startActivity(i);

        });



    }
;}