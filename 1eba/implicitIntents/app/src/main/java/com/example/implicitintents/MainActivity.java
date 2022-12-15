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
    private EditText bPagina1;
    private EditText bLocalizacion1;
    private EditText bTexto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bPagina1 = findViewById(R.id.webText);
        bLocalizacion1 = findViewById(R.id.localizationText);
        bTexto1 = findViewById(R.id.shareText);
    }
    public void abrirPagina(View view){
        //Recibir la url del texto
        String url = bPagina1.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if(intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Cant't handle this!");
        }
    }public void abrirLocalizacion(View view){
        String loc = bLocalizacion1.getText().toString();
        Uri adressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, adressUri);

        if(intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        }else{
            Log.d("implicit Intents" , "Cant handle this intent!");
        }
    } public void shareText(View view){
        String txt = bTexto1.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder.from(this).setType(mimeType).setChooserTitle(R.string.bTexto1).setText(txt).startChooser();
    }
}