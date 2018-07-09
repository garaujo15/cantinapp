package com.example.aluno.cantinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    private Button buttonsmais;
    private Button buttonsmenos;
    private double total;
    private double t;
    private int conta;
    private double c;
    private TextView contsalgado;
    private TextView vl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsmais = (Button) findViewById(R.id.buttonsmais);
        buttonsmenos = (Button) findViewById(R.id.buttonsmenos);
        vl = (TextView) findViewById(R.id.textViewvalor);
        contsalgado = (TextView) findViewById(R.id.textViewcont);



                buttonsmais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        conta = Integer.parseInt(contsalgado.getText().toString()) ;

                        conta = conta +1;

                        contsalgado.setText(""+conta);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ (3.80 + vt)+"");

                    }
                });
                buttonsmenos.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     c = conta - 1;
                     String con = contsalgado.getText().toString();
                     contsalgado.setText(""+c+"");

                    t = (total - 3.80);

                  String nome = vl.getText().toString();
                    vl.setText(""+t+"");
                }
        });



    }
}
