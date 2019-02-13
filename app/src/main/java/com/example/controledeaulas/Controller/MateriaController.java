package com.example.controledeaulas.Controller;

import android.content.Context;

import com.example.controledeaulas.DataSource.materiaDataSource;
import com.example.controledeaulas.Model.Materia;

public class MateriaController extends materiaDataSource {
    public MateriaController(Context context) {
        super(context);
    }

    public boolean salvar(Materia obj){


        return true;
    }

}
