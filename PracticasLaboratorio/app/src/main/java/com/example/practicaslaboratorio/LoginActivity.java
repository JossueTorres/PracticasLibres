package com.example.practicaslaboratorio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText edtUsuario, edtClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtClave = findViewById(R.id.edtClave);

    }

    public void Ingresar(View v){
        String usu = "" + edtUsuario.getText().toString(), cla = "" + edtClave.getText().toString();
        if(TextUtils.isEmpty(usu)){
            edtUsuario.requestFocus();
            edtUsuario.setError("El campo Usuario es requerido");
        }else if(TextUtils.isEmpty(cla)){
            edtClave.requestFocus();
            edtClave.setError("El campo Clave es requerido");
        }else{
            if (usu.equals("admin") && cla.equals("123")){
                Intent i = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(i);
            }
        }
    }

}
