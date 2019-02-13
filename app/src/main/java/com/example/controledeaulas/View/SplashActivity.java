package com.example.controledeaulas.View;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.controledeaulas.DataSource.materiaDataSource;
import com.example.controledeaulas.R;

public class SplashActivity extends AppCompatActivity {

    private final static int TEMPO_EXECUCAO_SPLASH=5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startSplash();


    }

    private void startSplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                materiaDataSource ds=new materiaDataSource(getApplicationContext());

                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();

            }
        },TEMPO_EXECUCAO_SPLASH);


    }
}
