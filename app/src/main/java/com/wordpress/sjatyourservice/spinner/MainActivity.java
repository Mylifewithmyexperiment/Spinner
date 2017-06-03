package com.wordpress.sjatyourservice.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;






public class MainActivity extends AppCompatActivity
{  Spinner s1;
    String planets[]={"Mercury", "Venus", "Earth", "Mars"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1=(Spinner)findViewById(R.id.spinner1);


        ArrayAdapter adapter= new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item,
                planets);
        s1.setAdapter(adapter);
        //every info we fill in adapter..nd handover d adapter to spinner

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, "This is :"+planets[position],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });


    }
}
