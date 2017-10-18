package com.example.android.personasmaterialclase;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by android on 17/10/2017.
 */

public class AdaptadorPersona extends RecyclerView.Adapter<AdaptadorPersona.PersonaViewHolder>{
    @Override
    public PersonaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PersonaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class PersonaViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView cedula;
        private TextView nombre;
        private TextView apellido;

        public PersonaViewHolder(View item){
            super(item);
            foto = (ImageView) item.findViewById(R.id.imgFoto);
            cedula = (TextView) item.findViewById(R.id.lblCedula);
            nombre = (TextView) item.findViewById(R.id.lblNombre);
            apellido = (TextView) item.findViewById(R.id.lblApellido);

        }
    }
}
