package com.example.android.archquiz02;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class Quiz extends AppCompatActivity {

    RadioButton rb1, rb2, rb3;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12;
    EditText question4FamousPeople, question7Nagpra;

    Button buttonScore;
    int score = 0;



    boolean appBarExpanded = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        buttonScore = findViewById(R.id.buttonScore);
        buttonScore.setOnClickListener(scoreButtonOnClickListener);

        rb1 = findViewById(R.id.question1MC);
        rb2 = findViewById(R.id.question3Artifacts);
        rb3 = findViewById(R.id.question8TF1);

        cb1 = findViewById(R.id.question2Classicarch);
        cb2 = findViewById(R.id.question2CRM);
        cb3 = findViewById(R.id.question2garbology);
        cb4 = findViewById(R.id.question2paleo);
        cb5 = findViewById(R.id.question5Trowel);
        cb6 = findViewById(R.id.question5Screen);
        cb7 = findViewById(R.id.question5Gps);
        cb8 = findViewById(R.id.question5Driver);
        cb9 = findViewById(R.id.question6crmFirm);
        cb10 = findViewById(R.id.question6Shpo);
        cb11 = findViewById(R.id.question6Hospital);
        cb12 = findViewById(R.id.question6Egypt);

        question4FamousPeople = findViewById(R.id.question4FamousPeople);
        question7Nagpra = findViewById(R.id.question7Nagpra);

        CollapsingToolbarLayout collapsingToolbar;
        AppBarLayout appBarLayout;
        appBarLayout = findViewById(R.id.app_bar);

        collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(getString(R.string.app_name));

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {

                //  Vertical offset == 0 indicates appBar is fully expanded.
                if (Math.abs(verticalOffset) > 200) {
                    appBarExpanded = false;
                    invalidateOptionsMenu();
                } else {
                    appBarExpanded = true;
                    invalidateOptionsMenu();
                }
            }
        });

    }


    private void questionOne() {
        boolean Q1_ANSWERChecked = rb1.isChecked();
        if (Q1_ANSWERChecked) {
            score += 1;

        }
    }

    private void questionTwo() {
        boolean questionTwoClassicalChecked = cb1.isChecked();
        boolean questionTwoCRMChecked = cb2.isChecked();
        boolean questionTwoGarbologyChecked = cb3.isChecked();
        boolean questionTwoPaleoChecked = cb4.isChecked();

        if (questionTwoClassicalChecked && questionTwoCRMChecked && questionTwoGarbologyChecked && questionTwoPaleoChecked) {
            score += 1;
        }

    }

    private void questionThree() {
        boolean Q3_ANSWERChecked = rb2.isChecked();
        if (Q3_ANSWERChecked) {
            score += 1;
        }
    }

    private String getQuestionFourUser() {
        String Q4_ANSWER = question4FamousPeople.getText().toString();
        return Q4_ANSWER;

    }

    private void questionFour() {
        String Q4_ANSWER = getQuestionFourUser();
        if (Q4_ANSWER.trim().equalsIgnoreCase("Indiana Jones")) {
            score += 1;
        }


    }

    private void questionFive() {
        boolean questionFiveTrowelChecked = cb5.isChecked();
        boolean questionFiveScreenChecked = cb6.isChecked();
        boolean questionFiveGPSChecked = cb7.isChecked();
        boolean questionFiveDriverChecked = cb8.isChecked();

        if (questionFiveTrowelChecked && questionFiveScreenChecked && questionFiveGPSChecked && !questionFiveDriverChecked) {
            score += 1;
        }

    }

    private void questionSix() {
        boolean questionSixCRMFirmChecked = cb9.isChecked();
        boolean questionSixSHPOChecked = cb10.isChecked();
        boolean questionSixHospChecked = cb11.isChecked();
        boolean questionSixEgyptChecked = cb12.isChecked();

        if (questionSixCRMFirmChecked && questionSixSHPOChecked && !questionSixHospChecked && questionSixEgyptChecked) {
            score += 1;
        }
    }

    private String getQuestionSevenUser() {
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

    public void resetAnswers(){
        score = 0;
        rb1.setChecked(false);
        rb2.setChecked(false);
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);
        cb5.setChecked(false);
        cb6.setChecked(false);
        cb7.setChecked(false);
        cb8.setChecked(false);
        cb9.setChecked(false);
        cb10.setChecked(false);
        cb11.setChecked(false);
        cb12.setChecked(false);
        question4FamousPeople.setText("");
        question7Nagpra.setText("");

    }

    final View.OnClickListener scoreButtonOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            checkAnswers();
            Toast.makeText(Quiz.this, "You got " + score + "/8 answers right.", Toast.LENGTH_LONG).show();
            resetAnswers();

        }
    };



}
