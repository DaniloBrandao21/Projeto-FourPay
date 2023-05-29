package com.example.fourpay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
public class HomeActivity extends AppCompatActivity {
    int verificador = 1;
    String valor;
    ImageView esconder_saldo_home;
    TextView saldo_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        esconder_saldo_home = findViewById(R.id.btn_eye);
        saldo_home = findViewById(R.id.saldo);
        valor = saldo_home.getText().toString();
        esconder_saldo_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificador == 1) {
                    esconder_saldo_home.setImageResource(R.drawable.ic_eye_off);
                    saldo_home.setText(valor.replaceAll("(?s).", "*"));
                    verificador = 0;
                } else {
                    esconder_saldo_home.setImageResource(R.drawable.ic_eye);
                    saldo_home.setText(valor);
                    verificador = 1;
                }
            }
        });
    }

    public void abrirRecarga(View view){
        startActivity(new Intent(HomeActivity.this, RecargaActivity.class));
    }

    public void abrirEmprestimo(View view){
        startActivity(new Intent(HomeActivity.this, EmprestimoActivity.class));
    }

}