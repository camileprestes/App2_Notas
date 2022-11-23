package com.example.notas;

import static java.lang.Integer.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Onclick(View view){
        EditText nome = findViewById(R.id.Nome);
        EditText nota1 = findViewById(R.id.Nota1);
        EditText nota2 = findViewById(R.id.Nota2);
        EditText frequencia = findViewById(R.id.frequencia);



        Intent it = new Intent(this, Tela2.class);
        Bundle params = new Bundle();
        params.putString("nome", nome.getText().toString());
        params.putDouble("nota1", Double.parseDouble(nota1.getText().toString()));
        params.putDouble("nota2", Double.parseDouble(nota2.getText().toString()));
        params.putDouble("frequencia", parseInt(frequencia.getText().toString()));


        it.putExtras(params);
        startActivity(it);
    }
}