package com.example.practicaslibres;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class Ciclos extends AppCompatActivity {
    private ListView lvCiclos;
    private CicloListAdapter adapter;
    private List<CicloClase> cicloList;

    String  sCodigo="", sCiclo="", sFechaInicio="",sFechaFin="",sEstado="";
    EditText edtCodigo, edtCiclo, edtFechaInico,edtFechaFin;
    Switch swCiclo_estado;
    Button btnGuardar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(1);
        setContentView(R.layout.activity_ciclos);
        System.out.println(2);
        //listview: se manda a llamar con un adaptador
        lvCiclos = findViewById(R.id.lvListadoCiclos);
        cicloList = new ArrayList<>();
        System.out.println(3);

        cicloList.add(new CicloClase(1,"1", "01-2018", "20/01/2018","10/06/2018","Inactivo"));
        cicloList.add(new CicloClase(1,"2", "02-2018", "19/08/2018","12/12/2018","Inactivo"));
        cicloList.add(new CicloClase(1,"3", "03-2018", "12/06/2018","17/08/2018","Inactivo"));
        cicloList.add(new CicloClase(1,"4", "01-2019", "20/01/2018","10/06/2018","Activo"));

        adapter = new CicloListAdapter(getApplicationContext(), cicloList);
        lvCiclos.setAdapter(adapter);

        //PENDIENTE:  implementar la funcion que al dar clic sobre el listview me mande a otro form y el separador de registros
        
    }

    //Metodo que al dar clic en el boton invoca un AlertDialog
    public void nuevoCiclo(View v){

        final AlertDialog.Builder mBuilder = new AlertDialog.Builder(Ciclos.this);
        final View mView = getLayoutInflater().inflate(R.layout.dialog_ciclos, null);

        edtCodigo = mView.findViewById(R.id.edtCiclo_codigo);
        edtCiclo = mView.findViewById(R.id.edtCiclo_ciclo);
        edtFechaInico = mView.findViewById(R.id.edtCiclo_fechaInicio);
        edtFechaFin=mView.findViewById(R.id.edtCiclo_fechaFinalizacion);
        swCiclo_estado=mView.findViewById(R.id.swCiclo_estado);
        btnGuardar = findViewById(R.id.btnCiclo_guardar);

        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();
        dialog.show();
    }
    public void cancelar(View v){
        this.finish();
    }

}
