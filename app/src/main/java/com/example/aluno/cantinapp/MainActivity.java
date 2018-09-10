package com.example.aluno.cantinapp;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class  MainActivity extends AppCompatActivity {

    private Button buttonsmais;
    private Button buttonsmenos;

    private Button buttonsmaisre;
    private Button buttonsmenosre;

    private Button buttonsmaisbo;
    private Button buttonsmenosbo;

    private Button buttonsmaispa;
    private Button buttonsmenospa;
    private Button btntroco;

    private int conta;
    private int contare;
    private int contabo;
    private int contapa;
    private Double vldev;

    private TextView contsalgado;
    private TextView contre;
    private TextView contbo;
    private TextView contpa;

    private TextView vl;
    private TextView vltroco;
    private EditText vrec;
    DecimalFormat df;

 


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

        btntroco = (Button) findViewById(R.id.buttontroco);

        vl = (TextView) findViewById(R.id.textViewvalor);
        vltroco = (TextView) findViewById(R.id.textViewvltroco);

        contsalgado = (TextView) findViewById(R.id.textViewcont);
        contre = (TextView) findViewById(R.id.textViewcontre);
        contbo = (TextView) findViewById(R.id.textViewcontbo);
        contpa = (TextView) findViewById(R.id.textViewcontpa);

        vrec   = (EditText) findViewById(R.id.editvrec);

         df = new DecimalFormat("#0.00");





        buttonsmais.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        conta = Integer.parseInt(contsalgado.getText().toString()) ;

                        conta = conta +1;

                        contsalgado.setText(""+conta);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ df.format(3.80 + vt)+"");

                    }
                });
                buttonsmenos.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                         conta = Integer.parseInt(contsalgado.getText().toString()) ;
                         if(conta <= 0){
                             Toast.makeText(MainActivity.this, "A quantidade é negativa", Toast.LENGTH_SHORT).show();

                         }else {
                             conta = conta - 1;

                         contsalgado.setText(""+conta);

                         double vt = Double.parseDouble(vl.getText().toString());
                         vl.setText(""+ df.format( vt-3.80)+"");
                         }
                         }
                 });
                buttonsmaisre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contare = Integer.parseInt(contre.getText().toString()) ;

                        contare = contare +1;

                        contre.setText(""+contare);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ df.format(1.50 + vt)+"");

                    }
                });
                buttonsmenosre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contare = Integer.parseInt(contre.getText().toString()) ;
                        if(conta <= 0){
                            Toast.makeText(MainActivity.this, "A quantidade é negativa", Toast.LENGTH_SHORT).show();

                        }else{
                            contare = contare -1;

                        contre.setText(""+contare);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ df.format( vt-1.50)+"");}
                    }
                });
                buttonsmaisbo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contabo = Integer.parseInt(contbo.getText().toString()) ;

                        contabo = contabo +1;

                        contbo.setText(""+contabo);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ df.format(2.00 + vt)+"");

                    }
                });
                buttonsmenosbo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contabo = Integer.parseInt(contbo.getText().toString()) ;
                        if(conta <= 0){
                            Toast.makeText(MainActivity.this, "A quantidade é negativa", Toast.LENGTH_SHORT).show();

                        }else{
                            contabo = contabo -1;

                        contbo.setText(""+contabo);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ df.format( vt-2.00)+"");}
                    }
                });
                buttonsmaispa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contapa = Integer.parseInt(contpa.getText().toString()) ;

                        contapa = contapa +1;

                        contpa.setText(""+contabo);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ df.format(0.50 + vt)+"");

                    }
                });
                buttonsmenospa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contapa = Integer.parseInt(contpa.getText().toString()) ;
                        if(conta <= 0){
                            Toast.makeText(MainActivity.this, "A quantidade é negativa", Toast.LENGTH_SHORT).show();

                        }else{
                            contapa = contapa -1;

                        contpa.setText(""+contapa);

                        double vt = Double.parseDouble(vl.getText().toString());
                        vl.setText(""+ df.format( vt-0.50)+"");}
                    }
                });
                btntroco.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                        double vt = Double.parseDouble(vl.getText().toString());
                        double vrec2 = Double.parseDouble(vrec.getText().toString());

                        vldev = (vrec2 - vt);

                        vltroco.setText(""+df.format(vldev));
                        }
                });


    }
}
