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

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
    Button btnCome;
    Button btnMol;
   Button btnNteb;

    int score1;
    int score2;
    int score3;
    int score4;

    private RadioGroup radGroup1,radGroup2,radGroup3,radGroup4;
    Quiz quiz =new Quiz() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnCome =(Button)findViewById(R.id.btnLiz) ;
        btnCome.setOnClickListener(this) ;

        btnMol =(Button)findViewById(R.id.btnCancel) ;
        btnMol.setOnClickListener(this) ;

        btnNteb =(Button)findViewById(R.id.button2) ;
        btnNteb.setOnClickListener(this) ;

        radGroup1 = (RadioGroup) findViewById(R.id.radG1 );
        radGroup2 = (RadioGroup) findViewById(R.id.radG2 );
        radGroup3 = (RadioGroup) findViewById(R.id.radG3 );
        radGroup4 = (RadioGroup) findViewById(R.id.radG4);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnCancel) {
            Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.btnLiz) {
            quiz.setOption1(1);
            quiz.setOption2(0);
            quiz.setOption3(0);
            quiz.setOption4(0);

            if (radGroup1.getCheckedRadioButtonId() == R.id.radio01) {
                score1 = quiz.getOption1();
            } else if (radGroup1.getCheckedRadioButtonId() == R.id.radio02) {
                score1 = quiz.getOption2();
            } else if (radGroup1.getCheckedRadioButtonId() == R.id.radio03) {
                score1 = quiz.getOption3();
            } else if (radGroup1.getCheckedRadioButtonId() == R.id.radio04) {
                score1 = quiz.getOption4();
            }

            if (radGroup2.getCheckedRadioButtonId() == R.id.radio07) {
                score2 = quiz.getOption1();
            } else if (radGroup2.getCheckedRadioButtonId() == R.id.radio06) {
                score2 = quiz.getOption2();
            } else if (radGroup2.getCheckedRadioButtonId() == R.id.radio05) {
                score2 = quiz.getOption3();
            } else if (radGroup2.getCheckedRadioButtonId() == R.id.radio08) {
                score2 = quiz.getOption4();
            }

            if (radGroup3.getCheckedRadioButtonId() == R.id.radio09) {
                score3 = quiz.getOption1();
            } else if (radGroup3.getCheckedRadioButtonId() == R.id.radio010) {
                score3 = quiz.getOption2();
            } else if (radGroup3.getCheckedRadioButtonId() == R.id.radio011) {
                score3 = quiz.getOption3();
            } else if (radGroup3.getCheckedRadioButtonId() == R.id.radio012) {
                score3 = quiz.getOption4();
            }

            if (radGroup4.getCheckedRadioButtonId() == R.id.radio015) {
                score4 = quiz.getOption1();
            } else if (radGroup4.getCheckedRadioButtonId() == R.id.radio014) {
                score4 = quiz.getOption2();
            } else if (radGroup4.getCheckedRadioButtonId() == R.id.radio013) {
                score4 = quiz.getOption3();
            } else if (radGroup4.getCheckedRadioButtonId() == R.id.radio016) {
                score4 = quiz.getOption4();
            }
            int total = score1 + score2 + score3 + score4;
            Toast.makeText(this, "You Scored" + total, Toast.LENGTH_SHORT).show();

            EditText nameField=(EditText)  findViewById(R.id .nameEditText);
            String names=nameField.getText() .toString();

            AlertDialog.Builder dialog = new AlertDialog.Builder(Main4Activity.this);
            dialog.setTitle("Score Results");
            dialog.setMessage( names +" \n You have scored: " + total + " Points");


            dialog.setPositiveButton("Next questions", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
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
          if (v.getId() == R.id.button2) {
            Intent intent = new Intent(Main4Activity.this, Main3Activity.class);
            startActivity(intent);

        }
    }}

