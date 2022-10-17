package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvIzena = findViewById(R.id.tvIzena);
        TextView tvAbizena = findViewById(R.id.tvAbizena);
        TextView tvZen1 = findViewById(R.id.tvZen1);
        TextView tvZen2 = findViewById(R.id.tvZen2);

        TextView tvIzenOsoa = findViewById(R.id.tvIzenOsoa);
        TextView tvBatuketa = findViewById(R.id.tvEmaitza);

        //Con esto cogeremos los datos de las variables temporales enviadas en el MainActivity y les asignaremos una variable atemporal.
        String izena = getIntent().getStringExtra("Izena");
        String abizena = getIntent().getStringExtra("Abizena");
        String zen1 = getIntent().getStringExtra("Zen1");
        String zen2 = getIntent().getStringExtra("Zen2");

        String izenOsoa = izena + " " + abizena;
        String batuketa = Integer.toString(Integer.parseInt(zen1) + Integer.parseInt(zen2));

        tvIzena.setText(izena);
        tvAbizena.setText(abizena);
        tvZen1.setText(zen1);
        tvZen2.setText(zen2);
        tvIzenOsoa.setText(izenOsoa);
        tvBatuketa.setText(batuketa);

    }
}