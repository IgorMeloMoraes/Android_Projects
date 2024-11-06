package com.example.projetosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PedraPapelTesoura extends AppCompatActivity {

    private TextView txtOponente, txtPlayer, txtResultado;
    private ImageView imgPedra, imgPapel, imgTesoura, imgOponente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedra_papel_tesoura);

        // Referencias
        imgOponente = findViewById(R.id.img_escolha_oponente);
        txtResultado = findViewById(R.id.txt_resultado);

    }

    // Metodos de Click para cada escolha
    public void escolhaPedra(View view){
        this.jogadaSelecionada("pedra");
    }

    public void escolhaPapel(View view){
        this.jogadaSelecionada("papel");
    }

    public void escolhaTesoura(View view){
        this.jogadaSelecionada("tesoura");
    }



    // Metodo de Escolha Geral
    public void jogadaSelecionada(String jogadaSelecionada){

        // Gerando jogadas aleatorias para o oponentes
        int random = new Random().nextInt(3);
        String[] opcoes = {
                "pedra", "papel", "tesoura"
        };
        String opcoesOponente = opcoes[random];

        // Alterando a imagem da jogada do oponente de forma aleatoria
        switch (opcoesOponente){
            case "pedra":
                imgOponente.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imgOponente.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imgOponente.setImageResource(R.drawable.tesoura);
                break;
        }

        // Jogadas e Placares de Ganhadores
            // Player Vencedor
        if ((jogadaSelecionada.equals("pedra") && opcoesOponente.equals("tesoura")) ||
           (jogadaSelecionada.equals("papel") && opcoesOponente.equals("pedra")) ||
           (jogadaSelecionada.equals("tesoura") && opcoesOponente.equals("papel"))) {
            txtResultado.setText("Vitoria do Player!!!");
        }
        // Inimigo Vencedor
        else if ((opcoesOponente.equals("pedra") && jogadaSelecionada.equals("tesoura")) ||
                (opcoesOponente.equals("papel") && jogadaSelecionada.equals("pedra")) ||
                (opcoesOponente.equals("tesoura") && jogadaSelecionada.equals("papel"))) {
                txtResultado.setText("Vitoria do Inimigo!!!");
        }
        // Empate
        else {
            txtResultado.setText("Empate!!!");
        }


    }


}