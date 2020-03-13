package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private EditText nome;
    private EditText endereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = findViewById(R.id.formulario_nome);
        endereco = findViewById(R.id.formulario_endereco);

        Button botaoSalvar = (Button) findViewById(R.id.formulario_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v) {
                String enderecoValue = endereco.getText().toString();
                String nomeValue = nome.getText().toString();

                Intent intent = new Intent();

                intent.putExtra("nome", nomeValue);
                intent.putExtra("endereco", enderecoValue );

                setResult(MainActivity.CADATRADO_SUCESSO, intent);

                Toast.makeText(CadastroActivity.this, "Registro salvo!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}
