package com.example.aldagaiapasatu;

import android.os.Bundle;
import android.widget.TextView;

public class JasoActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        textView = (TextView) findViewById(R.id.textView1);

        Intent intent = getIntent();

    }
}
