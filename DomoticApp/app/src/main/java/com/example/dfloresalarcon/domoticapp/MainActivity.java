package com.example.dfloresalarcon.domoticapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //cargamos el layout que solo tiene un Framelayout
        setContentView(R.layout.activity_main);

        final Bundle estado = savedInstanceState;

        Button temperatura = (Button)findViewById(R.id.Temperatura);
        Button humedad = (Button)findViewById(R.id.Humedad);

        temperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cargamos el fragment en el 'container'
                // este esta en el layout de la Activity
                if (estado == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.container, new FragmentTemperatura())
                            .commit();
                }
            }
        });

        humedad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cargamos el fragment en el 'container'
                // este esta en el layout de la Activity
                if (estado == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.container, new FragmentHumedad())
                            .commit();
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
