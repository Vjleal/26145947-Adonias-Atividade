package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class TarifaOperadora extends AppCompatActivity {
    private EditText tempLig;
    private Spinner opSpinn;
    private  tela;
    String opcao;
    double temp;
    double temp2;
    double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifa_operadora);
        tempLig = findViewById(R.id.tempLig);
        opSpinn = findViewById(R.id.opSpinn);
        tela = findViewById(R.id.tela);


    }

    public void calcular(View jl){
        opcao=opSpinn.getSelectedItem().toString();
        temp=Double.parseDouble(tempLig.getText().toString());
        temp2=(temp*60)-5;

        if (opcao.equals("Vivo")){
            resultado=temp2*0.02;

        }else if(opcao.equals("oi")){
                resultado=temp2*0.025;

        }else{
                resultado=temp2*0.019;

        }

        if (resultado<0.0) {
                resultado = 0.0;
        }
            tela.setText("Preço: "+resultado);
    }
}
