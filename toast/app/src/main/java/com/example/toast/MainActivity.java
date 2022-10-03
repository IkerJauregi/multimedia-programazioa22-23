package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int nCount = 0;
    private TextView nShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nShowCount = findViewById(R.id.showCount);
    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view){
        nCount++;
        if(nShowCount !=null) {
            nShowCount.setText(Integer.toString(nCount));
        }
    }
    public void clear(View view){
        nCount = 0;
        nShowCount.setText(Integer.toString(nCount));
    }
}