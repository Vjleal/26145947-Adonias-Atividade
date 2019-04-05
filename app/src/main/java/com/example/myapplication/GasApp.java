package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class GasApp extends AppCompatActivity {

    private EditText modelo,potencia,gasolina,distancia;
    double resultado,dist,pot,gas,mult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_app);
    modelo=findViewById(R.id.modelo);
    potencia=findViewById(R.id.potencia);
    gasolina=findViewById(R.id.gasolina);
    distancia=findViewById(R.id.distancia);

    }

    public void calcular(View jl){
    dist=Double.parseDouble(distancia.getText().toString());
    pot=Double.parseDouble(potencia.getText().toString());
    gas=Double.parseDouble(gasolina.getText().toString());

        if ( pot <= 1.0){
            mult = 13;
        }else if(pot > 1.0 && pot < 1.4){
            mult = 11;
        }else if(pot > 1.4 && pot < 1.9){
            mult = 9.5;
        }else{
            mult = 7.75;
        }

        resultado=(dist/mult)*gas;
        DecimalFormat d = new DecimalFormat("00.00");




        Intent i = new Intent(this,Resultado.class);
        i.putExtra("resultado",d.format(resultado));
        i.putExtra("modelo",modelo.getText().toString());
        i.putExtra("distancia",distancia.getText().toString());
        i.putExtra("valorGasolina", gasolina.getText().toString());
        i.putExtra("potencia",potencia.getText().toString());
        startActivity(i);
    }
}
