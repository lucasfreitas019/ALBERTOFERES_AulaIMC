package com.example.calculoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ImcDetalhesMainActivity extends AppCompatActivity {

    TextView textViewDica, textViewImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc_detalhes_main);

        textViewDica = findViewById(R.id.textViewDica);
        textViewImc = findViewById(R.id.textViewImc);

        double imc = getIntent().getDoubleExtra("imc", 0D);

        if (imc < 18.5){
            textViewImc.setText("Seu IMC está Abaixo do normal");
            textViewDica.setText("Procure seu Nutricionista para ganhar peso da maneira adequada.");
        }else if (imc <= 25){
            textViewImc.setText("Seu IMC está Ótimo");
            textViewDica.setText("Parabéns mantenha sua alimentação e continue se exercitando");
        }else {
            textViewImc.setText("Seu IMC está muito Alto");
            textViewDica.setText("Procura seu Nutricionista para balancear sua alimentação e perder peso se maneira saudável");
        }
    }
}