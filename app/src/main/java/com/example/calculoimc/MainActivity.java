package com.example.calculoimc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    EditText editTextAltura;
    EditText editTextPeso;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAltura = findViewById(R.id.editTextAltura);
        editTextPeso = findViewById(R.id.editTextPeso);
        textViewResultado = findViewById(R.id.textViewResultado);

    }

    public void calcularIMC(View view){

        double peso = Double.parseDouble(editTextPeso.getText().toString());
        double altura = Double.parseDouble(editTextAltura.getText().toString());

        double imc = peso / (altura * altura);
        textViewResultado.setText(String.format("Seu IMC é %.2f", imc));

        Intent intent = new Intent(getApplicationContext(), ImcDetalhesMainActivity.class);
        intent.putExtra("imc", imc);

        startActivity(intent);

    }

}