package com.example.aluno.cantinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    private Button buttonsmais;
    private Button buttonsmenos;

    private Button buttonsmaisre;
    private Button buttonsmenosre;

    private Button buttonsmaisrebo;
    private Button buttonsmenosrebo;

    private int conta;
    private int contare;

    private TextView contsalgado;
    private TextView contre;
    private TextView vl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsmais = (Button) findViewById(R.id.buttonsmais);
        buttonsmenos = (Button) findViewById(R.id.buttonsmenos);

        buttonsmaisre = (Button) findViewById(R.id.buttonmaisre);
        buttonsmenosre = (Button) findViewById(R.id.buttonmenosre);

       // buttonsmaisbo = (Button) findViewById(R.id.buttonsmais);
        //buttonsmenosbo = (Button) findViewById(R.id.buttonsmenos);

        vl = (TextView) findViewById(R.id.textViewvalor);
        contsalgado = (TextView) findViewById(R.id.textViewcont);
        contre = (TextView) findViewById(R.id.textViewcontre);



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
                         conta = Integer.parseInt(contsalgado.getText().toString()) ;

                         conta = conta -1;

                         contsalgado.setText(""+conta);

                         double vt = Double.parseDouble(vl.getText().toString());
                         vl.setText(""+ ( vt-3.80)+"");
                         }
                 });
                buttonsmaisre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contare = Integer.parseInt(contre.getText().toString()) ;

                        contare = contare +1;

                        contre.setText(""+contare);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ (1.50 + vt)+"");

                    }
                });
                buttonsmenosre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contare = Integer.parseInt(contre.getText().toString()) ;

                        contare = contare -1;

                        contre.setText(""+contare);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ ( vt-1.50)+"");
                    }
                });



    }
}
