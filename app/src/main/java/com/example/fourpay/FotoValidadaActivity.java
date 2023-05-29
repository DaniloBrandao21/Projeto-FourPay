package com.example.fourpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FotoValidadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotovalidada);
    }
    public void voltaenvioFoto(View view) {
        startActivity(new Intent(FotoValidadaActivity.this,FotoActivity.class));
    }

    public void fotoInvalidada(View view) {
        startActivity(new Intent(FotoValidadaActivity.this,FotoInvalidaActivity.class));
    }
}