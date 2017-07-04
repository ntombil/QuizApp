package com.example.lisbeth.quizapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener   {
ImageView imageA,imageB,imageC,imageD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

         imageA =(ImageView) findViewById(R.id.image4);
        imageA .setOnClickListener(this);

         imageB=(ImageView)findViewById(R.id.image2) ;
        imageB .setOnClickListener(this);

         imageC =(ImageView)findViewById(R.id.imageView7);
        imageC .setOnClickListener(this);

        imageD =(ImageView)findViewById(R.id.image6);
        imageD .setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.image4) {
            Intent intent = new Intent(Main5Activity.this, Main4Activity.class);
            startActivity(intent);
       }
        else if (v.getId() == R.id.imageView7) {
            Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
           startActivity(intent);
        }
        else if (v.getId() ==R.id.image2) {
                Intent intent = new Intent(Main5Activity.this, Main2Activity.class);
        startActivity(intent);
    }
        else if (v.getId() ==R.id.image6) {
        Intent intent = new Intent(Main5Activity.this, Main3Activity.class);
        startActivity(intent);}
}  }





