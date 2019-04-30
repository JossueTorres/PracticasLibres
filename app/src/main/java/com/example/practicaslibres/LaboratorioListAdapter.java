package com.example.practicaslibres;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class LaboratorioListAdapter extends BaseAdapter {

    private Context context;
    private List<LaboratorioClase> LaboratoriosList;

    //constructor

    public LaboratorioListAdapter(Context context, List<LaboratorioClase> LaboratoriosList) {
        this.context = context;
        this.LaboratoriosList = LaboratoriosList;
    }

    @Override

    //Metodos implementados de base adapter********************
    public int getCount() {
        return LaboratoriosList.size();
    }

    @Override
    public Object getItem(int position) {

        return LaboratoriosList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.items_laboratorios_list, null);
        TextView tvCodigo= v.findViewById(R.id.tvLaboratorioCodigo);
        TextView tvnombre = v.findViewById(R.id.tvLaboratorioNombre);
        TextView tvFilas = v.findViewById(R.id.tvLaboratorioFilas);
        TextView tvColumnas = v.findViewById(R.id.tvLaboratorioColumnas);
        TextView tvDescrip= v.findViewById(R.id.tvLaboratorioDescripcion);

        //set text id para tag
        tvCodigo.setText(LaboratoriosList.get(position).getCodigo());
        tvnombre.setText(LaboratoriosList.get(position).getNombre());
        tvFilas.setText(LaboratoriosList.get(position).getFilas());
        tvColumnas.setText(LaboratoriosList.get(position).getColumnas());
        tvDescrip.setText(LaboratoriosList.get(position).getDescripcion());
        //guardar Laboratorios en tag
        v.setTag(LaboratoriosList.get(position).getId());
        return v;
    }
    //Metodos implementados de base adapter********************

}
