package ec.comnet.httpwww.comnetapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla_principal_cliente extends AppCompatActivity {

    private Button btnSoporteCliente;
    private Button btnPagos;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal_cliente);

        btnSoporteCliente = (Button) findViewById(R.id.btn_soporte);
        btnPagos = (Button) findViewById(R.id.btn_pagos);
        btnSalir = (Button) findViewById(R.id.btn_salir);

        btnSoporteCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivitySoporteCliente();
            }
        });

        btnPagos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivityPagoCliente();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void launchActivitySoporteCliente() {
        Intent intent = new Intent(this, Pantalla_soporte_cliente.class);
        startActivity(intent);
    }

    private void launchActivityPagoCliente() {
        Intent intent = new Intent(this, Pantalla_pagos_cliente.class);
        startActivity(intent);
    }



}
