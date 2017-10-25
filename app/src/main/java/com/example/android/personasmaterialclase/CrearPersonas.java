package com.example.android.personasmaterialclase;

import android.content.Intent;
import android.content.res.Resources;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class CrearPersonas extends AppCompatActivity {
    private EditText txtCedula;
    private EditText txtNombre;
    private EditText txtApellido;
    private ArrayList<Integer>fotos;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        txtCedula = (EditText)findViewById(R.id.txtCedula);
        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtApellido = (EditText)findViewById(R.id.txtApellido);
        res = this.getResources();
        inicializar_fotos();
    }


    public void inicializar_fotos(){
        fotos.add(R.drawable.images);
        fotos.add(R.drawable.images2);
        fotos.add(R.drawable.images3);
    }
    public boolean validar(){
        String aux = res.getString(R.string.mensaje_error_vacio);
        if(Metodos.validar_aux(txtCedula,aux)) return false;
        else if(Metodos.validar_aux(txtNombre,aux)) return false;
        else if(Metodos.validar_aux(txtApellido, aux)) return false;
        return true;
    }
    public void agregar(View v){
        if(validar()){
            Persona p = new Persona(Metodos.fotoAleatoria(fotos),
                    txtCedula.getText().toString(),
                    txtNombre.getText().toString(),
                    txtApellido.getText().toString());
            p.guardar();
            Snackbar.make(v,res.getString(R.string.mensaje_persona_guardada),Snackbar.LENGTH_LONG).setAction("Action",null).show();
            limpiar();
        }
    }
    public void limpiar(View v){
        limpiar();

    }
    public void limpiar(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.requestFocus();
    }
    public void onBackPressed() {
        finish();
        Intent i = new Intent(CrearPersonas.this,Principal.class);
        startActivity(i);
    }
}
