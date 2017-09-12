package com.donquijote.app.diploclasea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityDiploClaseA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_diplo_clase);
    }

    public void onClick(View v){
        Intent intent=new Intent(MainActivityDiploClaseA.this,MainActivityDiploClaseAIntent.class);
        intent.putExtra("vaina",":: VAINA LINDA ::");
        startActivity(intent);
    }

    public void onClickSpinner(View v){
        Intent intentb=new Intent(MainActivityDiploClaseA.this,ActivitySpinner.class);
        startActivity(intentb);
    }

}
