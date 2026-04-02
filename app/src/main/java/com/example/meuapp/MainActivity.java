package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnAvancar, btnVoltar;
    ImageView imageView;
    Integer imagens[] = new Integer[]{
            R.drawable.cachorro,
            R.drawable.gardem,
            R.drawable.happy,
            R.drawable.patinho,
            R.drawable.porquinho
    };
    int posicao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnAvancar=findViewById(R.id.buttonAvancar);
        btnVoltar=findViewById(R.id.buttonVoltar);
        imageView=findViewById(R.id.imageView);
        imageView.setImageResource(imagens[posicao]);

        btnAvancar.setOnClickListener(v -> {
            if (posicao == imagens.length-1){
                posicao =-1;
            }
            posicao++;
            imageView.setImageResource(imagens[posicao]);

        });

        btnVoltar.setOnClickListener(v -> {
            if (posicao <= 0){
                posicao = imagens.length;
            }
            posicao--;
            imageView.setImageResource(imagens[posicao]);
        });

    }
}