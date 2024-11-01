package com.example.projetosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FrasesDoDia extends AppCompatActivity {

    TextView txtFrase;
    Button btnGerador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases_do_dia);
    }

    public void GerarFraseDia(View view){
        txtFrase = findViewById(R.id.txt_frase);
        int indiceAleatorio = new Random().nextInt(5);

        String frases[] = {
                "Frase 1",
                "Frase 2",
                "Frase 3",
                "Frase 4",
                "Frase 5"
        };

        txtFrase.setText(frases[indiceAleatorio]);
    }
}