package com.example.zenbakiabidali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aldagaiapasatu.R;

public class SecondActivity extends AppCompatActivity {

    private TextView tv1;
    private EditText edit2;
    public String hasierakoZenbakia = getIntent().getStringExtra("zenbakia");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = (TextView) findViewById(R.id.tv1);

        String zenbakia = getIntent().getStringExtra("zenbakia");
        tv1.setText(zenbakia);

        String hasierakoZenbakia = getIntent().getStringExtra("zenbakia");
    }

    public void bueltatu(View view){


        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("hasierakoZenbakia", hasierakoZenbakia);
        intent.putExtra("zenbakiBerria", edit2.getText().toString());



        startActivity(intent);
    }
}