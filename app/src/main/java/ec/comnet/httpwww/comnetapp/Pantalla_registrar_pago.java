package ec.comnet.httpwww.comnetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class Pantalla_registrar_pago extends AppCompatActivity {

    private Button btnRegistrarPago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registrar_pago);

        btnRegistrarPago = (Button)findViewById(R.id.btn_enviar_registro);

        btnRegistrarPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Registro de pago enviado",Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}
