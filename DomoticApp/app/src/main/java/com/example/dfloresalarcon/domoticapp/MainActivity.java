package com.example.dfloresalarcon.domoticapp;

import android.app.Activity;
import android.content.Intent;
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

        Button temperatura = (Button)findViewById(R.id.btnTem);
        Button humedad = (Button)findViewById(R.id.btnHum);
        Button luz = (Button)findViewById(R.id.btnLuz);
        Button portal = (Button)findViewById(R.id.btnPor);
        Button salir = (Button)findViewById(R.id.btnSal);
        Button ayuda = (Button)findViewById(R.id.btnAyu);
        Button acercade = (Button)findViewById(R.id.btnAce);
        // Button salirsi = (Button)findViewById(R.id.btnSalSi);

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

        luz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cargamos el fragment en el 'container'
                // este esta en el layout de la Activity
                if (estado == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.container, new FragmentLuz())
                            .commit();
                }
            }
        });

        portal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cargamos el fragment en el 'container'
                // este esta en el layout de la Activity
                if (estado == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.container, new FragmentPortal())
                            .commit();
                }
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cargamos el fragment en el 'container'
                // este esta en el layout de la Activity
                if (estado == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.container, new FragmentSalir())
                            .commit();
                }
            }
        });

        ayuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cargamos el fragment en el 'container'
                // este esta en el layout de la Activity
                if (estado == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.container, new FragmentAyuda())
                            .commit();
                }
            }
        });

        acercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cargamos el fragment en el 'container'
                // este esta en el layout de la Activity
                if (estado == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.container, new FragmentAcercaDe())
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
