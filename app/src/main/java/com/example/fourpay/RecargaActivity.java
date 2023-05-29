package com.example.fourpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecargaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recarga);
    }
    public void voltaHome(View view){
        startActivity(new Intent(RecargaActivity.this, HomeActivity.class));
    }

    public void RecargaConfirma(View view) {
        startActivity(new Intent(RecargaActivity.this, RecargaConfirmaActivity.class));
    }
}