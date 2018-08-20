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

    private Button buttonsmaisbo;
    private Button buttonsmenosbo;

    private Button buttonsmaispa;
    private Button buttonsmenospa;

    private int conta;
    private int contare;
    private int contabo;
    private int contapa;


    private TextView contsalgado;
    private TextView contre;
    private TextView contbo;
    private TextView contpa;

    private TextView vl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsmais = (Button) findViewById(R.id.buttonsmais);
        buttonsmenos = (Button) findViewById(R.id.buttonsmenos);

        buttonsmaisre = (Button) findViewById(R.id.buttonmaisre);
        buttonsmenosre = (Button) findViewById(R.id.buttonmenosre);

        buttonsmaisbo = (Button) findViewById(R.id.maisbo);
        buttonsmenosbo = (Button) findViewById(R.id.menosbo);

        buttonsmaispa = (Button) findViewById(R.id.maispa);
        buttonsmenospa = (Button) findViewById(R.id.menospa);

        vl = (TextView) findViewById(R.id.textViewvalor);

        contsalgado = (TextView) findViewById(R.id.textViewcont);
        contre = (TextView) findViewById(R.id.textViewcontre);
        contbo = (TextView) findViewById(R.id.textViewcontbo);
        contpa = (TextView) findViewById(R.id.textViewcontpa);



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
                buttonsmaisbo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contabo = Integer.parseInt(contbo.getText().toString()) ;

                        contabo = contabo +1;

                        contbo.setText(""+contabo);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ (2.00 + vt)+"");

                    }
                });
                buttonsmenosbo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contabo = Integer.parseInt(contbo.getText().toString()) ;

                        contabo = contabo -1;

                        contbo.setText(""+contabo);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ ( vt-2.00)+"");
                    }
                });
                buttonsmaispa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contapa = Integer.parseInt(contpa.getText().toString()) ;

                        contapa = contapa +1;

                        contpa.setText(""+contabo);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ (0.50 + vt)+"");

                    }
                });
                buttonsmenospa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contapa = Integer.parseInt(contpa.getText().toString()) ;

                        contapa = contapa -1;

                        contpa.setText(""+contapa);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ ( vt-0.50)+"");
                    }
                });


    }
}
