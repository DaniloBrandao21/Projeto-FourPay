package com.example.fourpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);
    }

    public void fotoValidada(View view) {
        startActivity(new Intent(FotoActivity.this, FotoValidadaActivity.class));
    }


    public void voltaCadastro(View view) {
        startActivity(new Intent(FotoActivity.this,CadastrarActivity.class));
    }
}