package com.example.practicaslibres;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CicloListAdapter extends BaseAdapter {

    private Context context;
    private List<CicloClase> ciclosList;

    //constructor

    public CicloListAdapter(Context context, List<CicloClase> ciclosList) {
        this.context = context;
        this.ciclosList = ciclosList;
    }

    @Override

    //Metodos implementados de base adapter********************
    public int getCount() {
        return ciclosList.size();
    }

    @Override
    public Object getItem(int position) {

        return ciclosList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.items_ciclos_list, null);
        TextView tvCodigo= v.findViewById(R.id.tvCiclo_codigo);
        TextView tvCiclo = v.findViewById(R.id.tvCiclo_ciclo);

        //set text id para tag
        tvCodigo.setText(ciclosList.get(position).getCodigo());
        tvCiclo.setText(ciclosList.get(position).getCiclo());

        //guardar ciclos en tag
        v.setTag(ciclosList.get(position).getId());
        return v;
    }
    //Metodos implementados de base adapter********************

}
