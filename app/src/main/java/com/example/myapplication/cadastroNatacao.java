package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cadastroNatacao extends AppCompatActivity {
    private EditText idade;
    private TextView tela;
    double id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_natacao);
    idade=findViewById(R.id.conta);
    tela=findViewById(R.id.tela);
    }

    public void calcular(View jl){
    id=Double.parseDouble(idade.getText().toString());

    if (id >= 5 && id <= 7){
        tela.setText("Infantil A");

    }else if (id >= 8 && id <= 10){
        tela.setText("Infantil B");
    }else if (id >= 11 && id <= 13){
        tela.setText("Juvenil A");
    }else if (id >= 14 && id <= 17){
        tela.setText("Juvenil B");
    }else if (id >= 18 && id <= 99) {
        tela.setText("Sênior");

    }else if (id < 5 || id > 99){
        tela.setText("Idade não permitida...");
    }
    }
}
