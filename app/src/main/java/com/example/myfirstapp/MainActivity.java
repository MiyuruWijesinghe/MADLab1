package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt1;
    TextView txt2;
    TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.textStdId);
        txt2 = findViewById(R.id.textStdName);
        txt3 = findViewById(R.id.textBatchName);
        btn = findViewById(R.id.btnOk);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("IT19020990");
                txt2.setText("Miyuru");
                txt3.setText("Metro Weekend");
            }
        });
    }
}