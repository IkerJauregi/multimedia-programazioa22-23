package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText bPagina;
    private EditText bLocalizacion;
    private EditText bTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bPagina = findViewById(R.id.bPagina);
        bLocalizacion = findViewById(R.id.bLocalizacion);
        bTexto = findViewById(R.id.bTexto);
    }
    public void abrirPagina(View view){
        //Recibir la url del texto
        String url = bPagina.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if(intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Cant't handle this!");
        }
    }public void abrirLocalizacion(View view){
        String loc = bLocalizacion.getText().toString();
        Uri adressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, adressUri);

        if(intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        }else{
            Log.d("implicit Intents" , "Cant handle this intent!");
        }
    } public void shareText(View view){
        String txt = bTexto.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder.from(this).setType(mimeType).setChooserTitle(R.string.bTexto).setText(txt).startChooser();
    }
}