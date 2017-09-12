package com.donquijote.app.diploclasea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ActivityRedSocial extends AppCompatActivity {

    private Spinner sincronizarAppsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_social);
        initSpinner();
    }

    public void initSpinner(){
        sincronizarAppsSpinner=(Spinner) findViewById(R.id.spinner_sincronizar_apps);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(ActivityRedSocial.this,R.array.sincronizar_apps, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sincronizarAppsSpinner.setAdapter(adapter);
    }

}
