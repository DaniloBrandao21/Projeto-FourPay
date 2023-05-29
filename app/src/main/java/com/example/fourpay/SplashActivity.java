package com.example.fourpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // APRESENTANDO A TELA EM FULLSCREEN
        // getWindow -> Pega a tela
        // setFlags -> Seta configurações
        //Window Manager -> Chama o Gerenciador de Telas
        // LayoutParams -> Define os parametros
        // Flag FullScreen -> Define os valores como Fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //FAZENDO A CONTAGEM DE TEMPO E TROCANDO A TELA DE FORMA AUTOMÁTICA
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // startActivity é o método responsável por chamar a nova tela
                //Intent é a intenção de trocar a tela
                // (origem e destino)
                //finish mata o processo da tela atual
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }
        },4000); // 4000 4s
    }
}