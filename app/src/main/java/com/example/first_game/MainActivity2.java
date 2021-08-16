package com.example.first_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private ImageView one;
    private ImageView two;
    private ImageView three;
    private ImageView four;
    private ImageView five;
    private ImageView six;
    private ImageView seven;
    private ImageView eight;
    private ImageView nine;
    int y=0;
    int score=1;
    Handler handler=new Handler();
    public static final String EXTRA="hola.extra.NAME";
    Random random=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        one.setOnClickListener(v -> action(one));
        two.setOnClickListener(v -> action(two));
        three.setOnClickListener(v -> action(three));
        four.setOnClickListener(v -> action(four));
        five.setOnClickListener(v -> action(five));
        six.setOnClickListener(v -> action(six));
        seven.setOnClickListener(v -> action(seven));
        eight.setOnClickListener(v -> action(eight));
        nine.setOnClickListener(v -> action(nine));

    }
    public void action(ImageView imageView)
    {
        int x=generate(imageView);
        y=random.nextInt(9);
        y+=1;
        if(x==y)
        {
            imageView.setImageResource(R.drawable.iron_man);
            String str=Integer.toString(score);
            Intent intent=new Intent(this,MainActivity3.class);
            intent.putExtra(EXTRA,str);
            startActivity(intent);
        }
        else
        {
            score++;
            check_number(y);
        }
    }
    public int generate(ImageView imageView)
    {
        if(imageView==one)
        {
            return 1;
        }
        else if(imageView==two)
        {
            return 2;
        }
        else if(imageView==three)
        {
            return 3;
        }
        else if(imageView==four)
        {
            return 4;
        }
        else if(imageView==five)
        {
            return 5;
        }
        else if(imageView==six)
        {
            return 6;
        }
        else if(imageView==seven)
        {
            return 7;
        }
        else if(imageView==eight)
        {
            return 8;
        }
        else if(imageView==nine)
        {
            return 9;
        }
        else
        {
            return 0;
        }
    }
    public void check_number(int n)
    {
        switch (n)
        {
            case 1:
                one.setImageResource(R.drawable.thor);
                handler.postDelayed(() -> one.setImageResource(R.drawable.hulk),130);
                break;
            case 2:
                two.setImageResource(R.drawable.thor);
                handler.postDelayed(() -> two.setImageResource(R.drawable.hulk),130);
                break;
            case 3:
                three.setImageResource(R.drawable.thor);
                handler.postDelayed(() -> three.setImageResource(R.drawable.hulk),130);
                break;
            case 4:
                four.setImageResource(R.drawable.thor);
                handler.postDelayed(() -> four.setImageResource(R.drawable.hulk),130);
                break;
            case 5:
                five.setImageResource(R.drawable.thor);
                handler.postDelayed(() -> five.setImageResource(R.drawable.hulk),130);
                break;
            case 6:
                six.setImageResource(R.drawable.thor);
                handler.postDelayed(() -> six.setImageResource(R.drawable.hulk),130);
                break;
            case 7:
                seven.setImageResource(R.drawable.thor);
                handler.postDelayed(() -> seven.setImageResource(R.drawable.hulk),130);
                break;
            case 8:
                eight.setImageResource(R.drawable.thor);
                handler.postDelayed(() -> eight.setImageResource(R.drawable.hulk),130);
                break;
            case 9:
                nine.setImageResource(R.drawable.thor);
                handler.postDelayed(() -> nine.setImageResource(R.drawable.hulk),130);
                break;
        }
    }
}