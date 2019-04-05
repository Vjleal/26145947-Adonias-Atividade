package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    private TextView tela;
    String tudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        tela = findViewById(R.id.tela);
        Bundle dados = getIntent().getExtras();


        tela.setText(dados.getString("modelo")+" "+dados.getString("potencia")+" gasta R$"+dados.getString("resultado")+" para percorer "+
                     dados.getString("distancia")+"km com gasolina a "+dados.getString("valorGasolina")+" por litro.");

        tudo = (dados.getString("modelo")+" "+dados.getString("potencia")+" gasta R$"+dados.getString("resultado")+" para percorer "+
                dados.getString("distancia")+"km com gasolina a "+dados.getString("valorGasolina")+" por litro.");
    }

    public void compartilhar(View jl){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT,tudo);
        startActivity(Intent.createChooser(i,"compartilhar"));
}
}