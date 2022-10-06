package com.example.aldagaiapasatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText zen1, zen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Zenbakiak aldagaietan sartu
        zen1 = (EditText)findViewById(R.id.zen1);
        zen2 = (EditText)findViewById(R.id.zen2);
    }
    public void gehitu(View v){
        Intent intent = new Intent(this, JasoActivity.class);
        intent.putExtra("KEY_SENDER", zen1.getText().toString());
        startActivity(intent);
    }
}