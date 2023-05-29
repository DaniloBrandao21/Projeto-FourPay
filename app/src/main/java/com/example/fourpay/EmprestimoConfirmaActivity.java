package com.example.fourpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmprestimoConfirmaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emprestimo_confirma);
    }

    public void voltaEmprestimo(View view) {
        startActivity(new Intent(EmprestimoConfirmaActivity.this, EmprestimoActivity.class));
    }
}