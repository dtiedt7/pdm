package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityB extends AppCompatActivity {

    ImageView iv;
    TextView tvPeso, tvAltura, tvIMC;
    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_b);
        iv= findViewById(R.id.imageView);
        tvPeso= findViewById(R.id.tvPeso);
        tvAltura= findViewById(R.id.tvAltura);
        tvIMC= findViewById(R.id.tvIMC);
        double altura = getIntent().getExtras().getDouble("altura");
        double peso = getIntent().getExtras().getDouble("peso");
        tvPeso.setText(peso);
        tvAltura.setText(altura);
        double imc = peso / (altura * altura);
        Double.toString(imc);
        tvIMC.setText(imc);

    }
}