package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static int CADATRADO_SUCESSO = 10;
    public  static  String  CADASTRO_NOME_SUCESSO= "Nome cadastradp, prossiga  com as notas";
    private EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nome = findViewById(R.id.formNome);

        Button botaoProximo = (Button) findViewById(R.id.formSendName);

        botaoProximo.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v) {
                String nomeUsuario = nome.getText().toString();

                Intent intentVaiProFormulario = new Intent (MainActivity.this, CadastroActivity.class);
                intentVaiProFormulario.putExtra("nome", nomeUsuario);

//                setResult(MainActivity.CADATRADO_SUCESSO, intentVaiProFormulario);
                startActivityForResult(intentVaiProFormulario, CADATRADO_SUCESSO);
            }
        });

            }
}