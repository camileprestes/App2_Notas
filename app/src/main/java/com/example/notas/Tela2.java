package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        CalculaMedia();
    }

    protected void CalculaMedia(){
        TextView out = findViewById(R.id.Output);
        TextView outmedianotas = findViewById(R.id.medianotas);
        TextView situacao = findViewById(R.id.situacaoaluno);
        Intent it = getIntent();
        if (it != null) {
            Bundle params = it.getExtras();
            if (params != null) {
                String nome = params.getString("nome");
                Double nota1 = params.getDouble("nota1");
                Double nota2 = params.getDouble("nota2");
                Double frequencia = params.getDouble("frequencia");
                Double mediafinal = ((nota1+nota2)/2);
                out.setText("Aluno: "+ nome);
                outmedianotas.setText("Média Final Aluno: "+ Double.toString(mediafinal) + "\n " +
                        "Frequencia: " + frequencia);
                if (mediafinal >= 7 && frequencia >= 75){
                    situacao.setText("Aprovado");
                }
                else if (mediafinal >= 4 && mediafinal <= 69 && frequencia >= 75){
                    situacao.setText("Final");
                }
                else if (frequencia < 75){
                    situacao.setText("Reprovado por Falta");
                }
                else if (mediafinal < 4){
                    situacao.setText("Reprovado por Nota");
                }
            }
        }
    }
}