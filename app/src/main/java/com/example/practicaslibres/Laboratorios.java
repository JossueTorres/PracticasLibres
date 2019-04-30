package com.example.practicaslibres;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Laboratorios extends AppCompatActivity {
    private ListView lvLaboratorios;
    private LaboratorioListAdapter adapter;
    private List<LaboratorioClase> laboratoriosList;

    String  sCodigo="", sNombre="", sDescripcion="";
    EditText edtCodigo, edtNombre, edtDescripcion ,edtFilas,edtColumnas;
    Button btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratorios);
        //listview: se manda a llamar con un adaptador
        lvLaboratorios = findViewById(R.id.lvListadoLaboratorios);
        laboratoriosList = new ArrayList<>();

        laboratoriosList.add(new LaboratorioClase(1,"10","Laboratorio 10","Laboratorio Microsoft",10,9));
        laboratoriosList.add(new LaboratorioClase(1,"8","Laboratorio 8","Laboratorio de Redes",10,15));
        laboratoriosList.add(new LaboratorioClase(1,"3","Laboratorio 3","Laboratorio",20,10));

        adapter = new LaboratorioListAdapter(getApplicationContext(), laboratoriosList);
      //  lvLaboratorios.setAdapter(adapter);
        //PENDIENTE:  implementar la funcion que al dar clic sobre el listview me mande a otro form y el separador de registros

    }
    //Metodo que al dar clic en el boton invoca un AlertDialog
    public void nuevoLaboratorio(View v){

        final AlertDialog.Builder mBuilder = new AlertDialog.Builder(Laboratorios.this);
        final View mView = getLayoutInflater().inflate(R.layout.dialog_laboratorio, null);

        edtCodigo = mView.findViewById(R.id.edtLaboratorio_codigo);
        edtNombre = mView.findViewById(R.id.edtLaboratorio_nombre);
        edtDescripcion = mView.findViewById(R.id.edtLaboratorio_descripcion);
        edtFilas = mView.findViewById(R.id.edtLaboratorio_filas);
        edtColumnas = mView.findViewById(R.id.edtLaboratorio_columnas);
        btnGuardar = findViewById(R.id.btnLaboratorio_guardar);

        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();
        dialog.show();
    }
}
