package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView tv;
    EditText edmin,edmax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);
        b = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        edmin = findViewById(R.id.edMin);
        edmax = findViewById(R.id.edMax);

        b.setOnClickListener(v -> {
            String minStr= edmin.getText().toString();
            String maxStr= edmax.getText().toString();
            if (minStr.isEmpty()){
                edmin.setError("Informe o valor mínimo.");
                edmin.requestFocus();
                return;
            }
            if (maxStr.isEmpty()){
                edmax.setError("Informe o valor Máximo.");
                edmax.requestFocus();
                return;
            }

            int min= Integer.parseInt(minStr);
            int max= Integer.parseInt(maxStr);

            Random random = new Random();
            int r = random.nextInt(min, max);
            tv.setText(Integer.toString(r));
        });
    }
}