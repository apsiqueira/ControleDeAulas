package com.example.controledeaulas.Model;

import com.example.controledeaulas.Interfaces.DiasSemana;
import com.example.controledeaulas.Interfaces.HoraAula;

import java.util.Date;

public class Materia {


    private int id;
    private String nomeMateria;
    private String professor;
    private DiasSemana diaSemana;
    private HoraAula horaAula;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public DiasSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiasSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public HoraAula getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(HoraAula horaAula) {
        this.horaAula = horaAula;
    }
}