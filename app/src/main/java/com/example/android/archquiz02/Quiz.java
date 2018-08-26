package com.example.android.archquiz02;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class Quiz extends AppCompatActivity {

    //    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12;
//
//    EditText yourAnswerHere, question7Nagpra;
//
    Button buttonScore;
    int score = 0;

    int Q1_ANSWER = R.id.question1MC;
    int Q3_ANSWER = R.id.question3Artifacts;
    int Q8_ANSWER = R.id.question8TF1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_quiz);

        buttonScore = (Button) findViewById(R.id.buttonScore);
        buttonScore.setOnClickListener(scoreButtonOnClickListener);

//        rb1 = findViewById(R.id.question1Dinos);
//        rb2 = findViewById(R.id.question1spoods);
//        rb3 = findViewById(R.id.question1MC);
//        rb4 = findViewById(R.id.question1AT);
//        rb5 = findViewById(R.id.question3Gold);
//        rb6 = findViewById(R.id.question3Natives);
//        rb7 = findViewById(R.id.question3DinoBones);
//        rb8 = findViewById(R.id.question3Artifacts);
//        rb9 = findViewById(R.id.question8TF1);
//        rb10 = findViewById(R.id.question8TF2);


//        cb1 = findViewById(R.id.classicarch);
//        cb2 = findViewById(R.id.crm);
//        cb3 = findViewById(R.id.garbology);
//        cb4= findViewById(R.id.paleo);
//        cb5 = findViewById(R.id.question5Trowel);
//        cb6 = findViewById(R.id.screen);
//        cb7 = findViewById(R.id.question5Gps);
//        cb8 = findViewById(R.id.question5Driver);
//        cb9 = findViewById(R.id.question6crmFirm);
//        cb10 = findViewById(R.id.question6Shpo);
////        cb11 = findViewById(R.id.question6Hospital);
//        cb12 = findViewById(R.id.question6Egypt);

    }

    private void questionOne() {
        RadioGroup rg1 = findViewById(R.id.radioQuestion1);

        if (rg1.getCheckedRadioButtonId() == Q1_ANSWER) {
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
        RadioGroup rg2 = findViewById(R.id.radioQuestion3);

        if (rg2.getCheckedRadioButtonId() == Q3_ANSWER) {
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
        CheckBox cb6 = (CheckBox) findViewById(R.id.screen);
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
        RadioGroup rg3 = findViewById(R.id.radioQuestion3);

        if (rg3.getCheckedRadioButtonId() == Q8_ANSWER) {
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

    private void resetAnswers() {
        score = 0;
    }

    final View.OnClickListener scoreButtonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            checkAnswers();
            Toast.makeText(Quiz.this, "You got " + score + "/8 answers right.", Toast.LENGTH_LONG).show();
            resetAnswers();

        }
    };


}






//
//    public void buttonScore(View view) {
//        ArrayList<String> incorrectAnswersList = new ArrayList<>();
//
//        if( checkQuestion1() ){
//            score++;
//        } else {
//            incorrectAnswersList.add("Question 1");
//        }
//
//        if( checkQuestion2() ){
//            score++;
//        } else {
//            incorrectAnswersList.add("Question 2");
//        }
//
//        if( checkQuestion3() ){
//            score++;
//        } else {
//            incorrectAnswersList.add("Question 3");
//        }
//
//        if( checkQuestion4() ){
//            score++;
//        } else {
//            incorrectAnswersList.add("Question 4");
//        }
//
//        if( checkQuestion5() ){
//            score++;
//        } else {
//            incorrectAnswersList.add("Question 5");
//        }
//
//        if( checkQuestion6() ){
//            score++;
//        } else {
//            incorrectAnswersList.add("Question 6");
//        }
//
//        if( checkQuestion7() ){
//            score++;
//        } else {
//            incorrectAnswersList.add("Question 7");
//        }
//
//        if( checkQuestion8() ){
//            score++;
//        } else {
//            incorrectAnswersList.add("Question 8");
//        }
//
//
//        StringBuilder sb = new StringBuilder();
//        for (String s : incorrectAnswersList)
//        {
//            sb.append(s);
//            sb.append("\n");
//        }
//
//        Context context = getApplicationContext();
//        CharSequence text = "You got " + score + "/8 answers right.\n Recheck the following:\n" + sb.toString();
//        int duration = Toast.LENGTH_LONG;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();
//
//
//
//
//    }
//
////    ToDo Double Check that the user answers can be read.
//    private boolean checkQuestion4() {
//        EditText et = findViewById(R.id.yourAnswerHere);
//
//        return et.getText().toString().equalsIgnoreCase(Q4_ANSWER);
//    }
//
////ToDo Fix question 5. Error is with the "onClick" method.
//    private boolean checkQuestion5() {
//        cb5 = findViewById(R.id.question5Trowel);
//        cb6 = findViewById(R.id.screen);
//        cb7 = findViewById(R.id.question5Gps);
//        cb8 = findViewById(R.id.question5Driver);
//
//        boolean checkQuestion5 = cb5.isChecked() && cb6.isChecked() && cb7.isChecked() && !cb8.isChecked();
//        if (checkQuestion5) {
//            return true;
//        }
//
//        return false;
//
//    }
//
//
//
//    private boolean checkQuestion6() {
//        cb9 = findViewById(R.id.question6crmFirm);
//        cb10 = findViewById(R.id.question6Shpo);
//        cb12 = findViewById(R.id.question6Egypt);
//
//        if (cb5.isChecked() && cb6.isChecked() && cb7.isChecked()) {
//            return true;
//        }
//
//        return false;
//
//    }
//
//    private boolean checkQuestion7() {
//        EditText et = findViewById(R.id.question7Nagpra);
//
//        return et.getText().toString().equalsIgnoreCase(Q7_ANSWER);
//    }
//
//    private boolean checkQuestion8() {
//
//
//    }
//

