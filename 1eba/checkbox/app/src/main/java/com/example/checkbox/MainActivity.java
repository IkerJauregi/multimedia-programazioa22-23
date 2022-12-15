package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String mezua = "";
    CheckBox cbChocolate;
    CheckBox cbVainilla;
    CheckBox cbFresa;
    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbChocolate = findViewById(R.id.cbChocolate);
        cbVainilla = findViewById(R.id.cbVainilla);
        cbFresa = findViewById(R.id.cbFresa);
        btnToast = findViewById(R.id.btnToast);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chocolate, vainilla, fresa;

                if (cbChocolate.isChecked()) {
                    chocolate = cbChocolate.getText().toString();
                    mezua = mezua + " " + chocolate;
                } else {
                    chocolate = "";
                }
                if (cbVainilla.isChecked()) {
                    vainilla = cbVainilla.getText().toString();
                    mezua = mezua + " " + vainilla;
                } else {
                    vainilla = "";
                }
                if (cbFresa.isChecked()) {
                    fresa = cbFresa.getText().toString();
                    mezua = mezua + " " + fresa;
                } else {
                    fresa = "";
                }
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, mezua, Toast.LENGTH_SHORT);
                toast.show();
                mezua = "";

            }
        });
    }
}