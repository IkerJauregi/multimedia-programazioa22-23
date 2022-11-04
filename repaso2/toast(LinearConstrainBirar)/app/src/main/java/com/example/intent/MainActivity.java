package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int zenKontadorea = 0;
    TextView kontadorea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGehitu = findViewById(R.id.gehitu);
        Button btnGarbitu = findViewById(R.id.garbitu);
        Button btnMezua = findViewById(R.id.mezua);

        kontadorea = findViewById(R.id.kontadorea);
        //si el valor guardado es diferente a null
        if(savedInstanceState !=null) {
            if (savedInstanceState.getInt("count") != 0) {
                //Recoge el int de la variable temporal
                zenKontadorea = savedInstanceState.getInt("count");
                //Lo paso a string para poder imprimirlo correctamente
                String numeroNuevo = Integer.toString(zenKontadorea);
                kontadorea.setText(numeroNuevo);
            }
        }
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
        //El toast
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
    //Guarda el numero que esta en el contador en una variable temporal llamada "count"
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("count" , zenKontadorea);
    }
//    @Override
//    protected void onSaveInstanceState(Bundle outState){
//        super.onSaveInstanceState(outState);
//        outState.putString("count" , kontadorea.getText().toString());
//    }
@Override
public void onStart(){
    super.onStart();
    Context context = getApplicationContext();
    Toast toast = Toast.makeText(context, "onStart", Toast.LENGTH_SHORT);
    toast.show();
}
    @Override
    public void onRestart() {
        super.onRestart();
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onRestart", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    public void onResume() {
        super.onResume();
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onResume", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    public void onPause() {
        super.onPause();
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onPause", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    public void onStop() {
        super.onStop();
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onStop", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onDestroy", Toast.LENGTH_SHORT);
        toast.show();
    }
}