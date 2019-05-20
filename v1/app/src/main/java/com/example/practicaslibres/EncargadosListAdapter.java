package com.example.practicaslibres;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class EncargadosListAdapter extends BaseAdapter {

    private Context context;
    private List<EncargadoClase> encargadosList;

    public EncargadosListAdapter(Context context, List<EncargadoClase> encargadosList){

        this.context=context;
        this.encargadosList=encargadosList;


    }
    @Override

    public int getCount (){
        return encargadosList.size();
    }

    @Override

    public Object getItem (int position){
        return encargadosList.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override

    public View getView(int Position, View convertView, ViewGroup parent){
        View v = View.inflate(context,R.layout.items_encargados_list, null);
        TextView tvEncargado_Nombre = v.findViewById(R.id.tvEncargado_Nombre);
        TextView tvEncargado_Correo = v.findViewById(R.id.tvEncargado_Correo);
        TextView tvEncargado_Estado = v.findViewById(R.id.tvEncargado_Estado);

        tvEncargado_Nombre.setText(encargadosList.get(Position).getNombre());
        tvEncargado_Correo.setText(encargadosList.get(Position).getCorreo());
        tvEncargado_Estado.setText(encargadosList.get(Position).getEstado());

        v.setTag(encargadosList.get(Position).getId());
        return v;
    }
}
