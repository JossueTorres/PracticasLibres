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

public class Encargados extends AppCompatActivity {

    private ListView LvEncargados;
    private EncargadosListAdapter adapter;
    private List<EncargadoClase> encargadoList;

    String  sCodigo="", sNombre="", sCorreo="", sNacimiento, sSexo, sDUI, sCelular, sEstado;
    EditText edtEncargado_Apellido, edtEncargado_Nombre, edtEncargado_Correo, edtEncargado_Nacimiento, edtEncargado_Sexo, edtEncargado_DUI, edtEncargado_Celular, edtEncargado_Estado;
    Button btnEncargado_Guardar,btnEncargado_Cancelar,btnEncargado_Nuevo;
    Switch swEstado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encargados);

        LvEncargados = findViewById(R.id.lvListadoEncargado);
        encargadoList = new ArrayList<>();

        encargadoList.add(new EncargadoClase(1,"Jorge Acevedo","0","jorge.acevedo@utec.edu.sv","0","","","","Activo"));
        encargadoList.add(new EncargadoClase(2,"Carlos Alberto","0","carlos.sanchez@mail.utec.edu.sv","0","","","","Activo"));
        encargadoList.add(new EncargadoClase(3,"Jorge Rodriguez","0","jorge.rodriguez@mail.utec.edu.sv","0","","","","Activo"));

        adapter = new EncargadosListAdapter(getApplicationContext(), encargadoList);
        LvEncargados.setAdapter(adapter);




    }


        public void EncargadoNuevo(View v) {
            final AlertDialog.Builder Builder = new AlertDialog.Builder(Encargados.this);
            final View mView = getLayoutInflater().inflate(R.layout.dialog_encargados, null);

            edtEncargado_Nombre = mView.findViewById(R.id.edtEncargado_Nombre);
            edtEncargado_Apellido = mView.findViewById(R.id.edtEncargado_Apellidos);
            edtEncargado_Correo = mView.findViewById(R.id.edtEncargado_Correo);
            edtEncargado_Nacimiento = mView.findViewById(R.id.edtEncargado_Nacimiento);
            edtEncargado_Sexo = mView.findViewById(R.id.edtEncargado_Sexo);
            edtEncargado_Celular = mView.findViewById(R.id.edtEncargado_Celular);
            edtEncargado_DUI = mView.findViewById(R.id.edtEncargado_Dui);
            swEstado = mView.findViewById(R.id.swEncargado_Estado);
            btnEncargado_Guardar = findViewById(R.id.btnEncargado_Guardar);
            btnEncargado_Cancelar = findViewById(R.id.btnEncargado_Cancelar);

            Builder.setView(mView);
            final AlertDialog dialog = Builder.create();
            dialog.show();
        }




}

