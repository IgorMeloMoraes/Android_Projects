package com.example.projetosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SorteioApp extends AppCompatActivity {

    TextView txtNumeroSorteado;
    Button btnSortear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteio_app);

        // Referecia dos Elementos
        txtNumeroSorteado = findViewById(R.id.txt_num_sorteado);
        btnSortear = findViewById(R.id.btn_sortear);

        // Evento de Click utilizando o setOnClickListener para captar quando o botão for acionado
        btnSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gera um numero aleatorio utilizando a classe Random
                int numeroAleatorio = new Random().nextInt(51);
                txtNumeroSorteado.setText("Número Sorteado: " + numeroAleatorio);
            }
        });
    }
}