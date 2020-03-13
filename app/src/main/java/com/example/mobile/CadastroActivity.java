package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    public static final String REGISTRO_SALVO = "Registro salvo!";
    private EditText name;
    private EditText address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        name = findViewById(R.id.formName);
        address = findViewById(R.id.formAddress);

        Button botaoSalvar = (Button) findViewById(R.id.formSave);
        botaoSalvar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v) {
                String enderecoValue = address.getText().toString();
                String nomeValue = name.getText().toString();

                Intent intent = new Intent();

                intent.putExtra("name", nomeValue);
                intent.putExtra("address", enderecoValue );

                setResult(MainActivity.CADATRADO_SUCESSO, intent);

                Toast.makeText(CadastroActivity.this, REGISTRO_SALVO, Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}
