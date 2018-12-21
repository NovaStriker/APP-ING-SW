package ec.comnet.httpwww.comnetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pantalla_soporte_cliente extends AppCompatActivity {

    private Button btnRegistrarTicketSoporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_soporte_cliente);

        btnRegistrarTicketSoporte = (Button)findViewById(R.id.btn_registrar_ticket);

        btnRegistrarTicketSoporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ticket de soporte enviado",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
