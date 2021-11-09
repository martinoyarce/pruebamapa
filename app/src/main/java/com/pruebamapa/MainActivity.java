package com.pruebamapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner origen;
    Button btn;
    ArrayList<String> valores = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        origen = (Spinner)findViewById(R.id.spinner);
        btn = (Button) findViewById(R.id.btn);

        valores.add("...");
        valores.add("viña del mar");
        valores.add("paris");
        valores.add("china");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,valores);
        origen.setAdapter(adaptador);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (origen.getSelectedItem() == "...") {
                    Toast.makeText(getApplicationContext(), "Debe seleccionar un origen", Toast.LENGTH_LONG).show();
                }
                if (origen.getSelectedItem() == "viña del mar") {
                    String or = origen.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(), MainActivity2.class);
                    I.putExtra("SOrigen", or);
                    startActivity(I);
                }
                if (origen.getSelectedItem() == "paris") {
                    String or = origen.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(), MainActivity3.class);
                    I.putExtra("SOrigen", or);
                    startActivity(I);
                }
                if (origen.getSelectedItem() == "china") {
                    String or = origen.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(), MainActivity4.class);
                    I.putExtra("SOrigen", or);
                    startActivity(I);
                }

            }
        });
    }
}