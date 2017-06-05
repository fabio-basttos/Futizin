package com.example.khristian.futizinbeta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Khristian on 11/05/2017.
 */

public class PartidaRegistroActivity extends Activity {
    EditText localPartida;
    EditText horarioPartida;
    EditText dataPartida;
    EditText faixaEtaria;
    EditText valorPartida;
    EditText quantidadeJogadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_partida);

        localPartida = (EditText) findViewById(R.id.etLocalPartida);
        horarioPartida = (EditText) findViewById(R.id.etHorarioPartida);
        dataPartida = (EditText) findViewById(R.id.etDataPartida);
        faixaEtaria = (EditText) findViewById(R.id.etFaixaEtaria);
        valorPartida = (EditText) findViewById(R.id.etValorPartida);
        quantidadeJogadores = (EditText) findViewById(R.id.etQuantidadeJogadores);

    }

    public void criarPartida(View view) {
        boolean granted = true;

        if (localPartida.getText().toString().isEmpty()) {
            localPartida.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            localPartida.setBackground(getDrawable(R.drawable.border));
        }
        if (horarioPartida.getText().toString().isEmpty()) {
            horarioPartida.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            horarioPartida.setBackground(getDrawable(R.drawable.border));
        }
        if (dataPartida.getText().toString().isEmpty()) {
            dataPartida.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            dataPartida.setBackground(getDrawable(R.drawable.border));
        }
        if (faixaEtaria.getText().toString().isEmpty()) {
            faixaEtaria.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            faixaEtaria.setBackground(getDrawable(R.drawable.border));
        }
        if (valorPartida.getText().toString().isEmpty()) {
            valorPartida.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            valorPartida.setBackground(getDrawable(R.drawable.border));
        }
        if (quantidadeJogadores.getText().toString().isEmpty()) {
            quantidadeJogadores.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            quantidadeJogadores.setBackground(getDrawable(R.drawable.border));
        }

        if (granted == true) {
            Toast.makeText(this, "Partida criada com Sucesso!.", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(PartidaRegistroActivity.this, ListaPartidasActivity.class);
            startActivity(intent);
        }
    }
}
