package com.example.controledeaulas.DataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.controledeaulas.DataModel.MateriaDataModel;

public class materiaDataSource extends SQLiteOpenHelper {

    private static final String DB_NAME="Aulas.sqlite";
    private static final int DB_VERSION=1;

    SQLiteDatabase db;


    public materiaDataSource(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db=getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(MateriaDataModel.criarTabela());

        }
        catch ( Exception e ){
            Log.e("Erro no banco ", "DB error "+e.getMessage() );

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insert(String tabela, ContentValues dados){

        try {

        }catch (Exception e ){



        }


        return true;
    }
}
