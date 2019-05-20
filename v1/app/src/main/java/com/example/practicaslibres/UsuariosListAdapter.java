package com.example.practicaslibres;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class UsuariosListAdapter extends BaseAdapter {

    private Context context;
    private List<UsuariosClase> usuariosList;

    public UsuariosListAdapter (Context context, List<UsuariosClase> usuariosList){

        this.context=context;
        this.usuariosList=usuariosList;


    }
    @Override

    public int getCount (){
        return usuariosList.size();
    }

    @Override

    public Object getItem (int position){
        return usuariosList.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override

    public View getView(int Position, View convertView, ViewGroup parent){
        View v = View.inflate(context,R.layout.items_usuarios_list, null);
        TextView tvUsuario_Nombre = v.findViewById(R.id.tvUsuario_Nombre);
        TextView tvUsuario_Correo = v.findViewById(R.id.tvUsuario_Correo);
        TextView tvUsuario_Estado = v.findViewById(R.id.tvUsuario_Estado);

        tvUsuario_Nombre.setText(usuariosList.get(Position).getNombre());
        tvUsuario_Correo.setText(usuariosList.get(Position).getCorreo());
        tvUsuario_Estado.setText(usuariosList.get(Position).getEstado());

        v.setTag(usuariosList.get(Position).getId());
        return v;
    }
}
