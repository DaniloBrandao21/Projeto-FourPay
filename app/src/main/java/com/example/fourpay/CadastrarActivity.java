package com.example.fourpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CadastrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);
    }
    public void voltarInicio(View view){
        startActivity(new Intent(CadastrarActivity.this, MainActivity.class));
    }

    public void verTermos(View view) {
        startActivity(new Intent(CadastrarActivity.this,TermosActivity.class));
    }

    public void enviarFoto(View view) {
        startActivity(new Intent(CadastrarActivity.this,FotoActivity.class));
    }
}