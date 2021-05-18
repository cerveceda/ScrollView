package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton btnAbeja, btnGato, btnElefante, btnKoala, btnLeon, btnPajaro, btnVaca, btnZorro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbeja = findViewById(R.id.btnAbeja);
        btnGato =findViewById(R.id.btnGato);
        btnLeon = findViewById(R.id.btnLeon);

        btnAbeja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Es una abejita", Toast.LENGTH_SHORT).show();
            }
        });

        btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Maullar();
            }
        });

        btnLeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rugido();
            }
        });
    }

    public void Maullar(){
        MediaPlayer mpGato = MediaPlayer.create(MainActivity.this, R.raw.miau);
        mpGato.start();
    }

    public void Rugido(){
        MediaPlayer mpLeon = MediaPlayer.create(MainActivity.this, R.raw.leon);
        mpLeon.start();
    }
}