package com.example.thamirysrsantos.calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void soma(View view) {
        EditText edNumero1 = findViewById(R.id.txtNumero1);
        EditText edNumero2 = findViewById(R.id.txtNumero2);
        TextView textResultado = findViewById(R.id.tvResultado);
        int numero1 = Integer.parseInt(edNumero1.getText().toString());
        int numero2 = Integer.parseInt(edNumero2.getText().toString());
        int soma = numero1 + numero2;
        textResultado.setText("Resultado: " + soma);

    }

    public void subtracao(View view) {
        EditText edNumero1 = findViewById(R.id.txtNumero1);
        EditText edNumero2 = findViewById(R.id.txtNumero2);
        TextView textResultado = findViewById(R.id.tvResultado);
        int numero1 = Integer.parseInt(edNumero1.getText().toString());
        int numero2 = Integer.parseInt(edNumero2.getText().toString());
        int subtracao = numero1 - numero2;
        textResultado.setText("Resultado: " + subtracao);

    }

    public void multiplicacao(View view) {
        EditText edNumero1 = findViewById(R.id.txtNumero1);
        EditText edNumero2 = findViewById(R.id.txtNumero2);
        TextView textResultado = findViewById(R.id.tvResultado);
        int numero1 = Integer.parseInt(edNumero1.getText().toString());
        int numero2 = Integer.parseInt(edNumero2.getText().toString());
        int multiplicacao = numero1 * numero2;
        textResultado.setText("Resultado: " + multiplicacao);
    }

    public void divisao(View view) {
        EditText edNumero1 = findViewById(R.id.txtNumero1);
        EditText edNumero2 = findViewById(R.id.txtNumero2);
        TextView textResultado = findViewById(R.id.tvResultado);
        int numero1 = Integer.parseInt(edNumero1.getText().toString());
        int numero2 = Integer.parseInt(edNumero2.getText().toString());
        int divisao = numero1 / numero2;
        textResultado.setText("Resultado: " + divisao);
    }
}
