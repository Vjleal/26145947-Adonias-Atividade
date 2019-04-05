package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class RestauranteDesconto extends AppCompatActivity {

    private EditText nome,conta;
    private TextView tela;
    String check;
    double cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante_desconto);
    tela=findViewById(R.id.tela);
    nome=findViewById(R.id.nome);
    conta=findViewById(R.id.conta);

    }


    public void calcular(View jl){
        check=nome.getText().toString();
        cont=Double.parseDouble(conta.getText().toString());
        DecimalFormat d = new DecimalFormat("0.00");
        if (check.startsWith("a")||check.startsWith("e")||check.startsWith("i")||check.startsWith("o")||check.startsWith("u")||
                check.startsWith("A")||check.startsWith("E")||check.startsWith("I")||check.startsWith("O")||check.startsWith("U")){
            cont=cont*0.7;

            tela.setText("Valor da conta: "+d.format(cont));
        }else{
            tela.setText("Que pena! Nesta semana o desconto não é para seu nome, mas continue nos prestigiando que sua vez chegará.");
        }
    }
}
