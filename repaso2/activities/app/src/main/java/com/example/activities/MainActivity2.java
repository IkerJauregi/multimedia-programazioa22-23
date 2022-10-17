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

        String izena = getIntent().getStringExtra("Izena");
        String abizena = getIntent().getStringExtra("Abizena");
        int zen1 = getIntent().getIntExtra("tvZen1");
        int zen2 = Integer.parseInt(getIntent().getIntExtra("tvZen2"));

        tvIzena.setText(izena);
        tvAbizena.setText(abizena);
        tvZen1.setText(zen1);
        tvZen2.setText(zen2);

    }
}