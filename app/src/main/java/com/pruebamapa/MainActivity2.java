package com.pruebamapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageButton uno;
    ImageButton dos;
    ImageButton map;
    Button volver;
    String sorigen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        uno = (ImageButton)findViewById(R.id.imageButton);
        dos = (ImageButton)findViewById(R.id.imageButton2);
        map = (ImageButton)findViewById(R.id.imageButton4);
        volver = (Button)findViewById(R.id.volver);

        Bundle b = getIntent().getExtras();
        sorigen = b.getString("SOrigen");
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(), mar2.class);
                startActivity(I);
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(), mar1.class);
                startActivity(I);
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(I);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(I);
            }
        });
    }
}