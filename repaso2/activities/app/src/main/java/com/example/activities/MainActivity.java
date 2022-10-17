package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText tBoxizena = findViewById(R.id.izena);
        EditText tBoxabizena = findViewById(R.id.abizena);
        EditText tBoxzen1 = findViewById(R.id.zen1);
        EditText tBoxzen2 = findViewById(R.id.zen2);
        Button btnIgon = findViewById(R.id.btnIgon);

        btnIgon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String izena = tBoxizena.getText().toString();
                String abizena = tBoxabizena.getText().toString();
                int zen1 = Integer.parseInt(tBoxzen1.getText().toString());
                int zen2 = Integer.parseInt(tBoxzen2.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("Izena" , izena);
                intent.putExtra("Abizena" , abizena);
                intent.putExtra("Zen1" , zen1);
                intent.putExtra("Zen2" , zen2);
                startActivity(intent);

            }
        });
    }
}