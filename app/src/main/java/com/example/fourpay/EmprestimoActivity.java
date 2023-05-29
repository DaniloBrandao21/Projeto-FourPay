package com.example.fourpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmprestimoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emprestimo);
    }

    public void voltaHome(View view) {
        startActivity(new Intent(EmprestimoActivity.this, HomeActivity.class));
    }

    public void AbrirEmprestimoConfirma(View view) {
        startActivity(new Intent(EmprestimoActivity.this, EmprestimoConfirmaActivity.class));
    }
}