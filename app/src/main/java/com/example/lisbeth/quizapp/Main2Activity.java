package com.example.lisbeth.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    int score1;
    int score2;
    int score3;
    int score4;

    private RadioGroup radGroup1,radGroup2,radGroup3,radGroup4;
    Quiz quiz=new Quiz();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            radGroup1 = (RadioGroup) findViewById(R.id.group1);
            radGroup2 = (RadioGroup) findViewById(R.id.group2);
            radGroup3 = (RadioGroup) findViewById(R.id.group3);
            radGroup4 = (RadioGroup) findViewById(R.id.group4);

        }
        //this method is used when the score button is clicked
        public void  liz(View view){
            quiz.setOption1(1);
            quiz .setOption2(0);
            quiz.setOption3(0);
            quiz.setOption4(0);

            if (radGroup1.getCheckedRadioButtonId()==R.id.rad1 ){
                score1 =quiz.getOption1();
            }
            else if (radGroup1 .getCheckedRadioButtonId()==R.id.rad2){
                score1 =quiz .getOption2() ;
            }
            else if (radGroup1 .getCheckedRadioButtonId() ==R.id.rad3){
                score1 =quiz.getOption3() ;
            }
            else if (radGroup1 .getCheckedRadioButtonId() ==R.id.rad4){
                score1 =quiz .getOption4() ;
            }


            if (radGroup2.getCheckedRadioButtonId()==R.id.rad5 ){
                score2 =quiz.getOption2();
            }
            else if (radGroup2 .getCheckedRadioButtonId()==R.id.rad7){
                score2 =quiz .getOption1() ;
            }
            else if (radGroup2 .getCheckedRadioButtonId() ==R.id.rad6){
                score2 =quiz.getOption3() ;
            }
            else if (radGroup2 .getCheckedRadioButtonId() ==R.id.rad8){
                score2 =quiz .getOption4() ;
            }

            if (radGroup3.getCheckedRadioButtonId()==R.id.rad14 ){
                score3 =quiz.getOption1();
            }
            else if (radGroup3 .getCheckedRadioButtonId()==R.id.rad13){
                score3 =quiz .getOption2() ;
            }
            else if (radGroup3 .getCheckedRadioButtonId() ==R.id.rad15){
                score3 =quiz.getOption3() ;
            }
            else if (radGroup3 .getCheckedRadioButtonId() ==R.id.rad16){
                score3 =quiz .getOption4() ;
            }

            if (radGroup4.getCheckedRadioButtonId()==R.id.rad10 ){
                score4 =quiz.getOption1();
            }
            else if (radGroup4 .getCheckedRadioButtonId()==R.id.rad9){
                score4 =quiz .getOption2() ;
            }
            else if (radGroup4 .getCheckedRadioButtonId() ==R.id.rad11){
                score4 =quiz.getOption3() ;
            }
            else if (radGroup4 .getCheckedRadioButtonId() ==R.id.rad12){
                score4 =quiz .getOption4() ;
            }

            int total=score1+score2+score3+score4;
            Toast.makeText(this, "You Scored" + total, Toast.LENGTH_SHORT).show();

            EditText nameField=(EditText)  findViewById(R.id .nameEditText);
            String names=nameField.getText() .toString();

            AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
            dialog.setTitle("Score Results");
            dialog.setMessage( names +" \n You have scored: " + total + " Points");


            dialog.setPositiveButton("Next questions", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Main2Activity.this, Main5Activity.class);
                    startActivity(intent);
                    //intent
                    dialog.dismiss();
                }
            });

            dialog.setNegativeButton("Exit Please", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //closing finish
                    dialog.dismiss();
                }
            });

            dialog.show();

        }
        //this method is used when the next button is clicked
        public void more (View view){
            Intent intent=new Intent(Main2Activity.this,Main4Activity.class);
            startActivity(intent);

        }
        //this method is used when the back button is clicked
        public void rev (View view){
                Intent intent=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(intent);
            }

        }


