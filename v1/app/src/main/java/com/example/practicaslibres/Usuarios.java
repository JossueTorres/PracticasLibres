package com.example.practicaslibres;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class Usuarios extends AppCompatActivity {

    private ListView LvUsuarios;
    private UsuariosListAdapter adapter;
    private List<UsuariosClase> usuarioList;

    String  sCodigo="", sNombre="", sCorreo="", sNacimiento, sSexo, sDUI, sCelular, sEstado;
    EditText edtUsuario_Apellido, edtUsuario_Nombre, edtUsuario_Correo, edtUsuario_Nacimiento, edtUsuario_Sexo, edtUsuario_DUI, edtUsuario_Celular;
    Button btnUsuario_Guardar,btnUsuario_Cancelar,btnUsuario_Nuevo;
    Switch swEstado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);

        LvUsuarios = findViewById(R.id.lvListadoUsuario);
        usuarioList = new ArrayList<>();

        usuarioList.add(new UsuariosClase (1,"Jorge Acevedo","0","jorge.acevedo@utec.edu.sv","0","","","","Activo"));
        usuarioList.add(new UsuariosClase(2,"Carlos Alberto","0","carlos.sanchez@mail.utec.edu.sv","0","","","","Activo"));
        usuarioList.add(new UsuariosClase(3,"Jorge Rodriguez","0","jorge.rodriguez@mail.utec.edu.sv","0","","","","Activo"));

        adapter = new UsuariosListAdapter(getApplicationContext(), usuarioList);
        LvUsuarios.setAdapter(adapter);




    }


    public void UsuarioNuevo(View v) {
        final AlertDialog.Builder Builder = new AlertDialog.Builder(Usuarios.this);
        final View mView = getLayoutInflater().inflate(R.layout.dialog_usuarios, null);

        edtUsuario_Nombre = mView.findViewById(R.id.edtUsuario_Nombre);
        edtUsuario_Apellido = mView.findViewById(R.id.edtUsuario_Apellidos);
        edtUsuario_Correo = mView.findViewById(R.id.edtUsuario_Correo);
        edtUsuario_Nacimiento = mView.findViewById(R.id.edtUsuario_Nacimiento);
        edtUsuario_Sexo = mView.findViewById(R.id.edtUsuario_Sexo);
        edtUsuario_Celular = mView.findViewById(R.id.edtUsuario_Celular);
        edtUsuario_DUI = mView.findViewById(R.id.edtUsuario_Dui);
        swEstado = mView.findViewById(R.id.swUsuario_Estado);
        btnUsuario_Guardar = findViewById(R.id.btnUsuario_Guardar);
        btnUsuario_Cancelar = findViewById(R.id.btnUsuario_Cancelar);

        Builder.setView(mView);
        final AlertDialog dialog = Builder.create();
        dialog.show();
    }

}
