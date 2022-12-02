package com.example.sprint1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class datos_registro extends AppCompatActivity {

    TextView TxtUsuario,TxtNombre,TxtApellido,TxtCorreo,TxtContra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_registro);

        TxtUsuario = findViewById(R.id.textViewUsuario);
        TxtNombre = findViewById(R.id.textViewNombre);
        TxtApellido = findViewById(R.id.textViewApellido);
        TxtCorreo = findViewById(R.id.textViewCorreo);
        TxtContra = findViewById(R.id.textViewContra);

        String usuario = getIntent().getStringExtra("usuario");
        String nombre = getIntent().getStringExtra("nombre");
        String correo = getIntent().getStringExtra("correo");
        String apellido = getIntent().getStringExtra("apellido");
        String contra = getIntent().getStringExtra("contra");

        TxtUsuario.setText(usuario);
        TxtNombre.setText(nombre);
        TxtApellido.setText(apellido);
        TxtCorreo.setText(correo);
        TxtContra.setText(contra);

    }
}