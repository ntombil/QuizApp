package com.example.lisbeth.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener {
    Button btnMel;
    Button btnNtebo;

    int score1;
    int score2;
    int score3;
    int score4;

    private RadioGroup radGroup1,radGroup2,radGroup3,radGroup4;
    Quiz quiz =new Quiz() ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        btnMel =(Button)findViewById(R.id.btnBuck ) ;
        btnMel.setOnClickListener(this) ;


        btnNtebo  =(Button)findViewById(R.id.btnZcore ) ;
        btnNtebo .setOnClickListener(this) ;


        radGroup1 = (RadioGroup) findViewById(R.id.RdGrd0);
        radGroup2 = (RadioGroup) findViewById(R.id.RdGrd00);
        radGroup3 = (RadioGroup) findViewById(R.id.RdGrd000);
        radGroup4 = (RadioGroup) findViewById(R.id.RdGrd0000);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnBuck ) {
            Intent intent = new Intent(Main6Activity.this, Main5Activity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.btnZcore) {
            quiz.setOption1(1);
            quiz.setOption2(0);
            quiz.setOption3(0);
            quiz.setOption4(0);


            if (radGroup1.getCheckedRadioButtonId() == R.id.radioButt04) {
                score1 = quiz.getOption1();
            } else if (radGroup1.getCheckedRadioButtonId() == R.id.radioButt02) {
                score1 = quiz.getOption2();
            } else if (radGroup1.getCheckedRadioButtonId() == R.id.radioButt01) {
                score1 = quiz.getOption3();
            } else if (radGroup1.getCheckedRadioButtonId() == R.id.radioButt03) {
                score1 = quiz.getOption4();
            }

            if (radGroup2.getCheckedRadioButtonId() == R.id.radioButt05) {
                score2 = quiz.getOption1();
            } else if (radGroup2.getCheckedRadioButtonId() == R.id.radioButt06) {
                score2 = quiz.getOption2();
            } else if (radGroup2.getCheckedRadioButtonId() == R.id.radioButt07) {
                score2 = quiz.getOption3();
            } else if (radGroup2.getCheckedRadioButtonId() == R.id.radioButt08) {
                score2 = quiz.getOption4();
            }

            if (radGroup3.getCheckedRadioButtonId() == R.id.radioButt10) {
                score3 = quiz.getOption1();
            } else if (radGroup3.getCheckedRadioButtonId() == R.id.radioButt09) {
                score3 = quiz.getOption2();
            } else if (radGroup3.getCheckedRadioButtonId() == R.id.radioButt011) {
                score3 = quiz.getOption3();
            } else if (radGroup3.getCheckedRadioButtonId() == R.id.radioButt012) {
                score3 = quiz.getOption4();
            }

            if (radGroup4.getCheckedRadioButtonId() == R.id.radioButt013) {
                score4 = quiz.getOption1();
            } else if (radGroup4.getCheckedRadioButtonId() == R.id.radioButt014) {
                score4 = quiz.getOption2();
            } else if (radGroup4.getCheckedRadioButtonId() == R.id.radioButt015) {
                score4 = quiz.getOption3();
            } else if (radGroup4.getCheckedRadioButtonId() == R.id.radioButt016) {
                score4 = quiz.getOption4();
            }
            int total = score1 + score2 + score3 + score4;
            Toast.makeText(this, "You Scored" + total, Toast.LENGTH_SHORT).show();


            EditText nameField=(EditText)  findViewById(R.id .nameEditText);
            String names=nameField.getText() .toString();

            AlertDialog.Builder dialog = new AlertDialog.Builder(Main6Activity.this);
            dialog.setTitle("Score Results");
            dialog.setMessage( names +" \n you have scored: " + total + " Points");


            dialog.setPositiveButton("Next questions", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Main6Activity.this, Main5Activity.class);
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


        }
    }}
