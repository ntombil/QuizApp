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

    public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
        Button btnNext;
        Button btnScore;
        Button btnGo;
        int score1;
        int score2;
        int score3;
        int score4;

        private RadioGroup radGroup1,radGroup2,radGroup3,radGroup4;
        Quiz quiz =new Quiz() ;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);

            btnNext =(Button)findViewById(R.id.btncancel) ;
            btnNext.setOnClickListener(this) ;

            btnGo=(Button)findViewById(R.id.btnAfter) ;
            btnGo.setOnClickListener(this) ;

            btnScore =(Button)findViewById(R.id.btnScore ) ;
            btnScore.setOnClickListener(this) ;

            radGroup1 = (RadioGroup) findViewById(R.id.radioGrp1 );
            radGroup2 = (RadioGroup) findViewById(R.id.radioGrp2 );
            radGroup3 = (RadioGroup) findViewById(R.id.radioGrp3 );
            radGroup4 = (RadioGroup) findViewById(R.id.radioGrp4);
        }
        @Override
        //used this method for going back to the previous screen
        public void onClick(View v) {
            if (v.getId() == R.id.btncancel) {
                Intent intent = new Intent(Main3Activity.this, Main5Activity.class);
                startActivity(intent);
        //this method is used when you want to get the score
            } else {
                if (v.getId() == R.id.btnScore) {
                    quiz.setOption1(1);
                    quiz .setOption2(0) ;
                    quiz .setOption3(0) ;
                    quiz .setOption4(0) ;

                    if (radGroup1.getCheckedRadioButtonId()==R.id.radioG1 ){
                        score1 =quiz.getOption1();
                    }
                    else if (radGroup1.getCheckedRadioButtonId()==R.id.radioG2){
                        score1 =quiz.getOption2();
                    }
                    else if (radGroup1.getCheckedRadioButtonId()==R.id.radioG3){
                        score1 =quiz.getOption3();
                    }
                    else if (radGroup1.getCheckedRadioButtonId()==R.id.radioG4){
                        score1 =quiz.getOption4();
                    }

                    if (radGroup2.getCheckedRadioButtonId()==R.id.radioG9){
                        score2 =quiz.getOption1();
                    }
                    else if (radGroup2.getCheckedRadioButtonId()==R.id.radioG7 ){
                        score2 =quiz.getOption2();
                    }
                    else if (radGroup2.getCheckedRadioButtonId()==R.id.radioG6){
                        score2 =quiz.getOption3();
                    }
                    else if (radGroup2.getCheckedRadioButtonId()==R.id.radioG8){
                        score2 =quiz.getOption4();
                    }

                    if (radGroup3.getCheckedRadioButtonId()==R.id.radioG12 ){
                        score3 =quiz.getOption1();
                    }
                    else if (radGroup3.getCheckedRadioButtonId()==R.id.radioG5){
                        score3 =quiz.getOption2();
                    }
                    else if (radGroup3.getCheckedRadioButtonId()==R.id.radioG11){
                        score3 =quiz.getOption3();
                    }
                    else if (radGroup3.getCheckedRadioButtonId()==R.id.radioG13){
                        score3 =quiz.getOption4();
                    }

                    if (radGroup4.getCheckedRadioButtonId()==R.id.radioG16){
                        score4 =quiz.getOption1();
                    }
                    else if (radGroup4.getCheckedRadioButtonId()==R.id.radioG10){
                        score4 =quiz.getOption2();
                    }
                    else if (radGroup4.getCheckedRadioButtonId()==R.id.radioG14){
                        score4 =quiz.getOption3();
                    }
                    else if (radGroup4.getCheckedRadioButtonId()==R.id.radioG15){
                        score4 =quiz.getOption4();
                    }
                    int total=score1+score2+score3+score4;
                    Toast.makeText(this,"You Scored" + total, Toast.LENGTH_SHORT).show();


                    EditText nameField=(EditText)  findViewById(R.id .editTextName);
                    String names=nameField.getText() .toString();

                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main3Activity.this);
                    dialog.setTitle("Score Results");
                    dialog.setMessage( names +" \n You have scored: " + total + " Points");


                    dialog.setPositiveButton("Next questions", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Main3Activity.this, Main5Activity.class);
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
                if (v.getId() == R.id.btnAfter) {
                    Intent intent = new Intent(Main3Activity.this, Main6Activity.class);
                    startActivity(intent);



            }

            }
        }}