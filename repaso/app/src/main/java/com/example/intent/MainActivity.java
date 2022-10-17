package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int zenKontadorea = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGehitu = findViewById(R.id.gehitu);
        Button btnGarbitu = findViewById(R.id.garbitu);
        Button btnMezua = findViewById(R.id.mezua);

        TextView kontadorea = findViewById(R.id.kontadorea);

        btnGehitu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zenKontadorea++;
                kontadorea.setText(Integer.toString(zenKontadorea));
            }
        });

        btnGarbitu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zenKontadorea = 0;
                kontadorea.setText(Integer.toString(0));
            }
        });

        btnMezua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String mezua = zenKontadorea + " Biderrez klikatu duzu.";
                Toast toast = Toast.makeText(context, mezua, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}