package com.example.aluno.cantinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonsmais;
    private Button buttonsmenos;
    private double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsmais = (Button) findViewById(R.id.buttonsmais);
        buttonsmenos = (Button) findViewById(R.id.buttonsmenos);


        buttonsmais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            total = + 3.80;

            }
        });


    }
}
