package com.example.mobile;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import static com.example.mobile.CadastroActivity.REGISTRO_SALVO;

public class MediaActivity extends AppCompatActivity {
    private EditText mediaText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        //mediaText = findViewById(R.id.textMedia);
       // String media = String.valueOf(getParentActivityIntent().getExtras().getCharSequence("media"));
        // mediaText.setText(media);

    }

    protected  void onActivityResult(int request, int result, @Nullable Intent data){
        super.onActivityResult(request, result, data);

        if (result == REGISTRO_SALVO){
            if(data != null){
                String media = String.valueOf(data.getExtras().getCharSequence("media"));
                 mediaText.setText(media);

            }
        }
    }

}
