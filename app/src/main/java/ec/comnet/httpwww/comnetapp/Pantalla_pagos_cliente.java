package ec.comnet.httpwww.comnetapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla_pagos_cliente extends AppCompatActivity {

    private Button btnRegistroPago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_pagos_cliente);

        btnRegistroPago = (Button) findViewById(R.id.btn_ir_registro_pago);

        btnRegistroPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchPantallaRegistroPago();
            }
        });
    }

    private void launchPantallaRegistroPago() {
        Intent intent = new Intent(this, Pantalla_registrar_pago.class);
        startActivity(intent);
    }
}
