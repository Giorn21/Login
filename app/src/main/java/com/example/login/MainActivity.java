package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickRegistra(View view){
        Intent intent = new Intent(this, Registra.class);
        startActivity(intent);
    }

    public void onClickVolver(View view){
        Intent intent = new Intent(this, Volver.class);
        startActivity(intent);
    }
}