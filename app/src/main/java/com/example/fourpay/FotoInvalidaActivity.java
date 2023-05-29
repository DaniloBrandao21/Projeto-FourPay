package com.example.fourpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FotoInvalidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_invalida);
    }

    public void voltarFotoValidada(View view) {
        startActivity(new Intent(FotoInvalidaActivity.this,FotoValidadaActivity.class));
    }

    public void telaCartoes(View view) {
        startActivity(new Intent(FotoInvalidaActivity.this,CartoesActivity.class));
    }
}