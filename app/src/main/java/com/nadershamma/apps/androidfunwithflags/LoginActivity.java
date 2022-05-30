package com.nadershamma.apps.androidfunwithflags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText edit_text_usuario;
    private EditText edit_text_contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edit_text_usuario = findViewById(R.id.editText_usuario);
        edit_text_contraseña = findViewById(R.id.editText_contraseña);
    }


    public void IniciarSesion(View view){

        String usuario = edit_text_usuario.getText().toString();
        String password = edit_text_contraseña.getText().toString();

        if(usuario.equals("miguel") && password.equals("miguel")){
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("nombre", usuario.toUpperCase());
            startActivity(intent);
        }

        if(usuario.equals("enrique") && password.equals("enrique")){
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("nombre", usuario.toUpperCase());
            startActivity(intent);
        }

    }

}