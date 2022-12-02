package com.example.sprint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText TxtUsuario,TxtNombre,TxtApellido,TxtCorreo,TxtContra;
    Button btnRegistrar;
    String usuario,nombre,apellido,correo,contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        TxtUsuario = findViewById(R.id.TxtUsuario);
        TxtNombre = findViewById(R.id.TxtNombre);
        TxtApellido = findViewById(R.id.TxtApellido);
        TxtCorreo = findViewById(R.id.TxtCorreo);
        TxtContra = findViewById(R.id.TxtContra);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario = TxtUsuario.getText().toString();
                nombre = TxtNombre.getText().toString();
                apellido = TxtApellido.getText().toString();
                correo = TxtCorreo.getText().toString();
                contra = TxtContra.getText().toString();

                Intent i = new Intent(MainActivity.this,datos_registro.class);
                i.putExtra("usuario",usuario);
                i.putExtra("nombre",nombre);
                i.putExtra("apellido",apellido);
                i.putExtra("correo",correo);
                i.putExtra("contra",contra);
                startActivity(i);
            }
        });
    }
}