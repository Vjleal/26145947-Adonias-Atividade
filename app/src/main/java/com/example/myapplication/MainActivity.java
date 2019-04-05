package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private TextView tela;
    private EditText x;
    double result,valor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tela = findViewById(R.id.tela);
        x = findViewById(R.id.x);
    }
    public void calc(View p){
        valor = Double.parseDouble(x.getText().toString());
        DecimalFormat d = new DecimalFormat("0.00");
        result = 8/(2-valor);
        System.out.println(result);
        tela.setText("Valor de y: "+d.format(result));
    }
}
