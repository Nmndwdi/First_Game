package com.example.first_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button button;
    @Override
    public void onBackPressed () {
        Intent intent2 = new Intent(MainActivity3.this, MainActivity2.class);
        intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent=getIntent();
        String str=intent.getStringExtra(MainActivity2.EXTRA);
        TextView textView = findViewById(R.id.textView);
        String st;
        if(str.equals("1"))
        {
            st="Wow man! You can catch me in "+str+" chance";
        }
        else
        {
            st = "You can catch me in " + str + " chances";
        }
        textView.setText(st);
        button=findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent3 = new Intent(MainActivity3.this, MainActivity2.class);
            intent3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent3);
        });
    }
}