package com.example.aluno.cantinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

private Button buttoniniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buttoniniciar = (Button) findViewById(R.id.buttoniniciar);


        buttoniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NomeDaTelaOndeEstáOBotãoDeChamar.this, NomeDaTelaASerChamada.class));
            }
        });
    }





}
