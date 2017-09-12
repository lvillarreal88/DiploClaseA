package com.donquijote.app.diploclasea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivitySpinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner animalsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initSpinner();
    }

    public void initSpinner(){
        animalsSpinner=(Spinner) findViewById(R.id.activityspinner_animals);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(ActivitySpinner.this,R.array.animals_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        animalsSpinner.setAdapter(adapter);

        animalsSpinner.setOnItemSelectedListener(ActivitySpinner.this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String animal = (String ) parent.getSelectedItem();
        Toast.makeText(this, animal, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
