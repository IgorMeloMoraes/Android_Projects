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
                "Ama e faze o que quiseres - Santo Agostinho",
                "Você não possui uma alma. Você é uma alma. Você tem um corpo. - C.S.Lewis - Mero Cristianismo",
                "Não podemos sempre fazer grandes coisas na vida, mas podemos fazer pequenas coisas com grande amor - Madre " +
                        "Tereza de Calcutá",
                "Comece fazendo o que é necessário; depois faça o que é possível; e de repente você estará fazendo o impossível" +
                        ". - São Francisco de Assis",
                "O amor é a única coisa que se multiplica quando se divide - Dietrich Bonhoeffer",
                "A oração é um ato de amor - Santa Tereza de Avila",
                "A vida é agora - Eckhart Tolle ",
                "No escuro, a alma é purificada - São João da Cruz",
                "Reze como se tudo dependesse de Deus. Trabalhe como se tudo dependesse de você. - Santo Inacio de Loyola",
                "A fé é a luz que nos orienta - Bento XVI"

        };

        txtFrase.setText(frases[indiceAleatorio]);
    }
}