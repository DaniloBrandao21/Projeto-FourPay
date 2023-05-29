package com.example.fourpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecargaConfirmaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recarga_confirma);
    }

    public void voltaRecarga(View view) {
        startActivity(new Intent(RecargaConfirmaActivity.this, RecargaActivity.class));

    }

}