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

public class RegistroActivity extends Activity {
    EditText etNomeUsuario;
    EditText etEmailUsuario;
    EditText etDataNascimentoUsuario;
    EditText etContatoUsuario;
    EditText etSenhaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        etNomeUsuario = (EditText) findViewById(R.id.etNomeUsuario);
        etEmailUsuario = (EditText) findViewById(R.id.etEmailUsuario);
        etDataNascimentoUsuario = (EditText) findViewById(R.id.etDataNascimentoUsuario);
        etContatoUsuario = (EditText) findViewById(R.id.etContatoUsuario);
        etSenhaUsuario = (EditText) findViewById(R.id.etSenhaUsuario);

    }

    public void register(View view) {
        boolean granted = true;

        if (etNomeUsuario.getText().toString().isEmpty()) {
            etNomeUsuario.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            etNomeUsuario.setBackground(getDrawable(R.drawable.border));
        }
        if (etEmailUsuario.getText().toString().isEmpty()) {
            etEmailUsuario.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            etNomeUsuario.setBackground(getDrawable(R.drawable.border));
        }
        if (etDataNascimentoUsuario.getText().toString().isEmpty()) {
            etDataNascimentoUsuario.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            etNomeUsuario.setBackground(getDrawable(R.drawable.border));
        }
        if (etContatoUsuario.getText().toString().isEmpty()) {
            etContatoUsuario.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            etNomeUsuario.setBackground(getDrawable(R.drawable.border));
        }
        if (etSenhaUsuario.getText().toString().isEmpty()) {
            etSenhaUsuario.setBackground(getDrawable(R.drawable.border_error));
            Toast.makeText(this, "Campo Incorreto!.", Toast.LENGTH_SHORT).show();
            granted = false;
        } else {
            etNomeUsuario.setBackground(getDrawable(R.drawable.border));
        }

        if (granted == true) {
            Toast.makeText(this, "Registrado Com Sucesso!.", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(RegistroActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    }
}

