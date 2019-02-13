package com.example.controledeaulas.DataModel;

public class MateriaDataModel {

    //dados para criar o banco
    //MOR modelo objeto relacional


    //nome da tabela
    private final static String TABELA="Aulas";


    //colunas da tabela
    private final static String id= "id";
    private final static String nomeMateria="materia";
    private final static String professor="professor";
    private final static String diaSemana="diaSemana";
    private final static String horaAula ="horaAula";

    //query para receber comandos para o banco de dados
    private static String queryCriarTabela="";


    //metodo para criar tabela

    public static String criarTabela(){
        queryCriarTabela=" CREATE TABLE "+TABELA;

        queryCriarTabela+="( ";

        queryCriarTabela+=id+" INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela+=nomeMateria+" TEXT, ";
        queryCriarTabela+=professor+" TEXT, ";
        queryCriarTabela+=diaSemana+" TEXT, ";
        queryCriarTabela+=horaAula+" TEXT ";
        queryCriarTabela+=" )";




       return queryCriarTabela;
    }

    public static String getTABELA() {
        return TABELA;
    }

    public static String getId() {
        return id;
    }

    public static String getNomeMateria() {
        return nomeMateria;
    }

    public static String getProfessor() {
        return professor;
    }

    public static String getDiaSemana() {
        return diaSemana;
    }

    public static String getHoraAula() {
        return horaAula;
    }

    public static String getQueryCriarTabela() {
        return queryCriarTabela;
    }

    public static void setQueryCriarTabela(String queryCriarTabela) {
        MateriaDataModel.queryCriarTabela = queryCriarTabela;
    }
}