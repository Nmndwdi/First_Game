package com.example.first_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intento=new Intent(this,MainActivity2.class);
        Intent intenti=new Intent(this,MainActivity4.class);
        Button button = findViewById(R.id.button2);
        Button button2 = findViewById(R.id.button3);
        button.setOnClickListener(v -> startActivity(intento));
        button2.setOnClickListener(v -> startActivity(intenti));
    }
}