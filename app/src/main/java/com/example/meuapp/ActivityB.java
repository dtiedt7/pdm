package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity {

    ImageView iv;
    TextView tvPeso, tvAltura, tvIMC;
    Button btnFinish;

    String[] classificacao = {
            "Abaixo do peso",
            "Normal",
            "Sobrepeso",
            "Obesidade",
            "Obesidade Grave"
    };

    int[] imagens = {
            R.drawable.abaixopeso,
            R.drawable.normal,
            R.drawable.sobrepeso,
            R.drawable.obesidade1,
            R.drawable.obesidade3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_b);

        iv = findViewById(R.id.imageView);
        tvPeso = findViewById(R.id.tvPeso);
        tvAltura = findViewById(R.id.tvAltura);
        tvIMC = findViewById(R.id.tvIMC);

        double altura = getIntent().getDoubleExtra("altura", 0);
        double peso = getIntent().getDoubleExtra("peso", 0);

        tvPeso.setText(String.valueOf(peso));
        tvAltura.setText(String.valueOf(altura));

        double imc = peso / (altura * altura);

        int indice = getIndiceIMC(imc);

        tvIMC.setText(String.format("%.2f - %s", imc, classificacao[indice]));

        iv.setImageResource(imagens[indice]);
    }

    private int getIndiceIMC(double imc) {
        if (imc < 18.5) return 0;
        else if (imc < 25) return 1;
        else if (imc < 30) return 2;
        else if (imc < 40) return 3;
        else return 4;
    }
}