package com.example.ejercicio3101listiviewcrossfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvCrossfit;

    ArrayList<Crossfit> lista_crossfit = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();

        lvCrossfit=(ListView)findViewById(R.id.lvCrossfit);

        AdaptadorCrossfit adaptadorCrossfit = new AdaptadorCrossfit(this, lista_crossfit);
        lvCrossfit.setAdapter(adaptadorCrossfit);

        lvCrossfit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Crossfit c =((Crossfit)parent.getItemAtPosition(position));
                String pesom = c.getPesom();
                Toast.makeText(getApplicationContext(),"Máx. Rep.: "+pesom,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void cargarDatos(){

        lista_crossfit.add(new Crossfit("Dominada", "Sin peso", "5kg", 100, 4, 45, "dominada"));
        lista_crossfit.add(new Crossfit("Snatch", "30kg", "40kg", 10, 1, 0, "snatch"));
        lista_crossfit.add(new Crossfit("Power Clean", "40kg", "55kg", 14, 1, 0, "clean"));
        lista_crossfit.add(new Crossfit("Jerk", "50kg", "55kg", 3, 1, 0, "jerk"));
        lista_crossfit.add(new Crossfit("Balón pared", "7kg", "", 100, 3, 35, "balon"));
        lista_crossfit.add(new Crossfit("Sumo remo alto", "40g", "50kg", 15, 1, 0, "remo"));
        lista_crossfit.add(new Crossfit("Pistols", "Sin peso", "2kg", 10, 1, 10, "pistol"));
        lista_crossfit.add(new Crossfit("Sit up", "10kg", "", 100, 2, 20, "situp"));
        lista_crossfit.add(new Crossfit("Bíceps", "10kg", "15kg", 10, 0, 45, "biceps"));
        lista_crossfit.add(new Crossfit("Press banca", "10kg", "55kg", 10, 0, 35, "press"));






    }

}
