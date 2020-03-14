package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    public static final int REGISTRO_SALVO = 1;
    public static final int QUANTIDADE_NOTAS = 3;
    private EditText nota1;
    private EditText nota2;
    private EditText nota3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nota1 = findViewById(R.id.formNota1);
        nota2 = findViewById(R.id.formNota2);
        nota3 = findViewById(R.id.formNota3);

        Button botaoSalvar = (Button) findViewById(R.id.formSend);
        botaoSalvar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v) {
                Float notaUmValue = Float.parseFloat(nota1.getText().toString());
                Float notaDoisValue = Float.parseFloat(nota2.getText().toString());
                Float notaTresValue = Float.parseFloat(nota3.getText().toString());

                Float media = calculateMedia(notaUmValue, notaDoisValue, notaTresValue);


                Intent intentMostraMedia = new Intent (CadastroActivity.this, MediaActivity.class );
                intentMostraMedia.putExtra("media", media);
                startActivityForResult(intentMostraMedia, REGISTRO_SALVO);


            }
        });

    }

    private Float calculateMedia(Float notaUmValue, Float notaDoisValue, Float notaTresValue) {
        return (notaUmValue + notaDoisValue + notaTresValue) / QUANTIDADE_NOTAS;
    }
}
