package com.donquijote.app.diploclasea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivityDiploClaseAIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_diplo_clase_aintent);
        getData();
    }

    private void getData() {
        Intent intent=getIntent();
        String vaina=intent.getStringExtra("vaina");

        Toast.makeText(this, vaina, Toast.LENGTH_LONG).show();
    }
}
