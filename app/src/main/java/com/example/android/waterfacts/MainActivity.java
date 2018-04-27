package com.example.android.waterfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void printScore (View view) {

        String nameField;
        EditText text = (EditText) findViewById(R.id.editTextName);
        nameField = text.getText().toString();

        //Checks question 1
        RadioButton q1 = findViewById(R.id.question_1);
        boolean q1Answer = q1.isChecked();
        if (q1Answer) {
            score = score + 25;
        }

        //Checks question 2
        EditText q2 = findViewById(R.id.h2o);
        String q2answer = q2.getText().toString();
        if (q2answer.equals("H2O")) {
            score = score + 25;
        }

        //Checks question 3
        RadioButton q3 = findViewById(R.id.question_3);
        boolean q3Answer = q1.isChecked();

        if (q3Answer) {
            score = score + 25;
        }

        //Checks question 4
        CheckBox qFourOne = findViewById(R.id.q4_1);
        boolean qFourOneChecked = qFourOne.isChecked();

        CheckBox qFourTwo = findViewById(R.id.q4_2);
        boolean qFourTwoChecked = qFourTwo.isChecked();

        CheckBox qFourThree = findViewById(R.id.q4_3);
        boolean qFourThreeChecked = qFourThree.isChecked();

        CheckBox qFourFour = findViewById(R.id.q4_4);
        boolean qFourFourChecked = qFourFour.isChecked();

        CheckBox qFourFive = findViewById(R.id.q4_5);
        boolean qFourFiveChecked = qFourFive.isChecked();

        if (qFourOneChecked && qFourTwoChecked && qFourThreeChecked && qFourFourChecked && qFourFiveChecked) {
            score = score + 25;
            if (score > 100) {
                score = 100;
            }
        }

        //Makes a toast displaying the users name and the score earned.

        Toast.makeText(this, "Hello " + nameField + ", your score is " + score + "%",Toast.LENGTH_LONG).show();

    }




}
