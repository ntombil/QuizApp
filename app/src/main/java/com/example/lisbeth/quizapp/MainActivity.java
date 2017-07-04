package com.example.lisbeth.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnDetails;
    private Button btnPl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPl = (Button) findViewById(R.id.btnPlay);
        btnPl.setOnClickListener(this);

        btnDetails = (Button) findViewById(R.id.next);
        btnDetails.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("How to play");
        dialog.setMessage("Welcome to  QuizApp. \n All you need to do you must click on any\n of the picture quiz to test your knowledge.\n One click per answer.\nWhen you are done answering them \nplease check your results.\n Hope you will Enjoy my questions.");
        dialog.show();
        dialog.setPositiveButton("Next questions", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(intent);
                //intent
                dialog.dismiss();
            }
        });
        dialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //closing finish
                dialog.dismiss();
            }
        });
        dialog.show();


        if(v.getId()==R.id.next)
    {
        Intent intent = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(intent);

    }
}
    }








