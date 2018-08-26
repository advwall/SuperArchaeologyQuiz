package com.example.android.archquiz02;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class Quiz extends AppCompatActivity {

    Button buttonScore;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_quiz);

        buttonScore = (Button) findViewById(R.id.buttonScore);
        buttonScore.setOnClickListener(scoreButtonOnClickListener);

    }

    private void questionOne() {
        RadioButton rb1 = findViewById(R.id.question1MC);
        boolean Q1_ANSWERChecked = rb1.isChecked();
        if (Q1_ANSWERChecked) {
            score += 1;
        }
    }

    private void questionTwo() {
        CheckBox cb1 = (CheckBox) findViewById(R.id.classicarch);
        CheckBox cb2 = (CheckBox) findViewById(R.id.crm);
        CheckBox cb3 = (CheckBox) findViewById(R.id.garbology);
        CheckBox cb4 = (CheckBox) findViewById(R.id.paleo);
        boolean questionTwoClassicalChecked = cb1.isChecked();
        boolean questionTwoCRMChecked = cb2.isChecked();
        boolean questionTwoGarbologyChecked = cb3.isChecked();
        boolean questionTwoPaleoChecked = cb4.isChecked();

        if (questionTwoClassicalChecked && questionTwoCRMChecked && questionTwoGarbologyChecked && questionTwoPaleoChecked) {
            score += 1;
        }

    }

    private void questionThree() {
        RadioButton rb2 = findViewById(R.id.question3Artifacts);
        boolean Q3_ANSWERChecked = rb2.isChecked();
        if (Q3_ANSWERChecked) {
            score += 1;
        }
    }

    private String getQuestionFourUser() {
        EditText userFamousPeople = (EditText) findViewById(R.id.yourAnswerHere);
        String Q4_ANSWER = userFamousPeople.getText().toString();
        return Q4_ANSWER;

    }

    private void questionFour() {
        String Q4_ANSWER = getQuestionFourUser();
        switch (Q4_ANSWER) {
            case "Indiana Jones":
            case "Lara Croft":
                break;

        }

    }

    private void questionFive() {
        CheckBox cb5 = (CheckBox) findViewById(R.id.question5Trowel);
        CheckBox cb6 = (CheckBox) findViewById(R.id.question5Screen);
        CheckBox cb7 = (CheckBox) findViewById(R.id.question5Gps);
        CheckBox cb8 = (CheckBox) findViewById(R.id.question5Driver);
        boolean questionFiveTrowelChecked = cb5.isChecked();
        boolean questionFiveScreenChecked = cb6.isChecked();
        boolean questionFiveGPSChecked = cb7.isChecked();
        boolean questionFiveDriverChecked = cb8.isChecked();

        if (questionFiveTrowelChecked && questionFiveScreenChecked && questionFiveGPSChecked && !questionFiveDriverChecked) {
            score += 1;
        }

    }

    private void questionSix() {
        CheckBox cb9 = findViewById(R.id.question6crmFirm);
        CheckBox cb10 = findViewById(R.id.question6Shpo);
        CheckBox cb11 = findViewById(R.id.question6Hospital);
        CheckBox cb12 = findViewById(R.id.question6Egypt);
        boolean questionSixCRMFirmChecked = cb9.isChecked();
        boolean questionSixSHPOChecked = cb10.isChecked();
        boolean questionSixHospChecked = cb11.isChecked();
        boolean questionSixEgyptChecked = cb12.isChecked();

        if (questionSixCRMFirmChecked && questionSixSHPOChecked && !questionSixHospChecked && questionSixEgyptChecked) {
            score += 1;
        }
    }

    private String getQuestionSevenUser() {
        EditText question7Nagpra = (EditText) findViewById(R.id.question7Nagpra);
        String Q7_ANSWER = question7Nagpra.getText().toString();
        return Q7_ANSWER;
    }

    private void questionSeven() {
        String Q7_ANSWER = getQuestionSevenUser();
        if (Q7_ANSWER.trim().equalsIgnoreCase("Native American Graves Repatriation Act")) {
            score += 1;
        }
    }

    private void questionEight() {
        RadioButton rb3 = findViewById(R.id.question8TF1);
        boolean Q8_ANSWERChecked = rb3.isChecked();
        if (Q8_ANSWERChecked) {
            score += 1;
        }
    }

    private void checkAnswers() {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        questionSeven();
        questionEight();
    }

    private void resetAnswers(){
        score = 0;
    }

    final View.OnClickListener scoreButtonOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            checkAnswers();
            Toast.makeText(Quiz.this, "You got " + score + "/8 answers right.", Toast.LENGTH_LONG).show();
            resetAnswers();

        }
    };

}
