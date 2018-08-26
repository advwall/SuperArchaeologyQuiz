package com.example.android.archquiz02;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Quiz extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb9, cb10, cb12;

    EditText yourAnswerHere, question7Nagpra;

    Button buttonScore;


    int Q1_ANSWER = R.id.question1MC;
    int Q2_ANSWER = R.id.classicarch, crm, garbology, paleo;
    int Q3_ANSWER = R.id.question3Artifacts;
    String Q4_ANSWER = "Indiana Jones";
    int Q5_ANSWER = R.id.question5Trowel, question5Gps, question5Screen;
    int Q6_ANSWER = R.id.question6crmFirm, question6shpo, question6Egypt;
    String Q7_ANSWER = "Native American Graves Repatriation Act";
    int Q8_ANSWER = R.id.question8TF1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_quiz);

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


        cb1 = findViewById(R.id.classicarch);
        cb2 = findViewById(R.id.crm);
        cb3 = findViewById(R.id.garbology);
        cb4= findViewById(R.id.paleo);
        cb5 = findViewById(R.id.question5Trowel);
        cb6 = findViewById(R.id.screen);
        cb7 = findViewById(R.id.question5Gps);
        cb9 = findViewById(R.id.question6crmFirm);
        cb10 = findViewById(R.id.question6Shpo);
        cb12 = findViewById(R.id.question6Egypt);


        buttonScore = findViewById(R.id.buttonScore);
    }

    public void buttonScore(View view) {
        ArrayList<String> incorrectAnswersList = new ArrayList<>();

        int score = 0;

        if( checkQuestion1() ){
            score++;
        } else {
            incorrectAnswersList.add("Question 1");
        }

        if( checkQuestion2() ){
            score++;
        } else {
            incorrectAnswersList.add("Question 2");
        }

        if( checkQuestion3() ){
            score++;
        } else {
            incorrectAnswersList.add("Question 3");
        }

        if( checkQuestion4() ){
            score++;
        } else {
            incorrectAnswersList.add("Question 4");
        }

        if( checkQuestion5() ){
            score++;
        } else {
            incorrectAnswersList.add("Question 5");
        }

        if( checkQuestion6() ){
            score++;
        } else {
            incorrectAnswersList.add("Question 6");
        }

        if( checkQuestion7() ){
            score++;
        } else {
            incorrectAnswersList.add("Question 7");
        }

        if( checkQuestion8() ){
            score++;
        } else {
            incorrectAnswersList.add("Question 8");
        }


        StringBuilder sb = new StringBuilder();
        for (String s : incorrectAnswersList)
        {
            sb.append(s);
            sb.append("\n");
        }

        Context context = getApplicationContext();
        CharSequence text = "You got " + score + "/8 answers right.\n Recheck the following:\n" + sb.toString();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //Calculates Score

    private boolean checkQuestion1() {
        RadioGroup rb = (RadioGroup) findViewById(R.id.radioQuestion1);

        if( rb.getCheckedRadioButtonId() == Q1_ANSWER ) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion2() {
//        cb1 = findViewById(R.id.classicarch);
//        cb2 = findViewById(R.id.crm);
//        cb3 = findViewById(R.id.garbology);
//        cb4= findViewById(R.id.paleo);

        if ( Q2_ANSWER.isChecked() ) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion3() {
        RadioGroup rb = findViewById(R.id.radioQuestion3);

        if ( rb.getCheckedRadioButtonId() == Q3_ANSWER) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion4() {
        EditText et = (EditText)findViewById(R.id.yourAnswerHere);

        return et.getText().toString().equalsIgnoreCase(Q4_ANSWER);
    }

    private boolean checkQuestion5() {
//        cb5 = findViewById(R.id.question5Trowel);
//        cb6 = findViewById(R.id.screen);
//        cb7 = findViewById(R.id.question5Gps);

        if( cb5.isChecked() && cb6.isChecked() && cb7.isChecked() ) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion6() {
        cb9 = findViewById(R.id.question6crmFirm);
        cb10 = findViewById(R.id.question6Shpo);
        cb12 = findViewById(R.id.question6Egypt);

        if( cb5.isChecked() && cb6.isChecked() && cb7.isChecked() ) {
            return true;
        }

        return false;
    }

    private boolean checkQuestion7() {
        EditText et = (EditText)findViewById(R.id.question7Nagpra);

        return et.getText().toString().equalsIgnoreCase(Q7_ANSWER);
    }

    private boolean checkQuestion8() {
        RadioGroup rb = findViewById(R.id.radioQuestion8);

        if ( rb.getCheckedRadioButtonId() == Q8_ANSWER) {
            return true;
        }

        return false;
    }

    //Resets the answers to play again

    private void buttonScore (View view) {
        buttonScore = 0;

    }









}

//    // This displays the quiz
//    RadioGroup radioGroup1, radioGroup3, radioGroup8;
//
//    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12;
//
//    RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10;
//
//    EditText yourAnswerHere, question7Nagpra;
//
//    Button buttonScore;
//
//    int score = 0;


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_quiz);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

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
//
//
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
//        cb11 = findViewById(R.id.question6Hospital);
//        cb12 = findViewById(R.id.question6Egypt);
//
//        radioGroup1 = findViewById(R.id.radioQuestion1);
//        radioGroup3 = findViewById(R.id.radioQuestion3);
//        radioGroup8 = findViewById(R.id.radioQuestion8);
//
//        buttonScore = findViewById(R.id.score);

        //This method is called when the scoring Button is selected.

//        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                // find which radio button is selected
//                if(checkedId == R.id.question1MC) {
//                    score = score + 1;
//                } else {
//                    score = score;
//                }
//            }
//            });
//
//        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                // find which radio button is selected
//                if(checkedId == R.id.question3Artifacts) {
//                    score = score + 1;
//                } else {
//                    score = score;
//                }
//            }
//
//            });
//
//        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                // find which radio button is selected
//                if(checkedId == R.id.question8TF1) {
//                    score = score + 1;
//                } else {
//                    score = score;
//                }
//            }
//
//        });
//
//        }
//
//        buttonScore = (Button)findViewById(R.id.score);
//        button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                int selected = radioGroup.getCheckedRadioButtonId();
//
//            }
//        });
//
//
//
//
//        //Question 1
//
////        boolean hasRB1 = rb1.isChecked();
////        boolean hasRB2 = rb2.isChecked();
//        boolean hasRB3 = rb3.isChecked();
////        boolean hasRB4 = rb4.isChecked();
//
//
//        //This method is called when question 2 is answered
//
//        boolean hasCB1 = cb1.isChecked();
//        boolean hasCB2 = cb2.isChecked();
//        boolean hasCB3 = cb3.isChecked();
//        boolean hasCB4 = cb4.isChecked();
//
//
//
////        if (cb1.isChecked() && cb2.isChecked() && cb3.isChecked() && cb4.isChecked()) {
////            return;
////        }
//
//
////        boolean hasRB5 = rb5.isChecked();
////        boolean hasRB6 = rb6.isChecked();
////        boolean hasRB7 = rb7.isChecked();
//        boolean hasRB8 = rb8.isChecked();
//
////        //This method is called when question 4 is answered
////        EditText question4 = (EditText) findViewById(yourAnswerHere);
////        Editable question4Editable = question4.getText();
////        String names = question4Editable.compareTo();
//
////        result.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                s1 = (EditText) findViewById(yourAnswerHere);
////                s2 = (EditText) findViewById(yourAnswerHere);
////                s3 = (EditText) findViewById(question7Nagpra);
////                    }
////                });
//
//        //Question 5
//
//        boolean hasCB5 = cb5.isChecked();
//        boolean hasCB6 = cb6.isChecked();
//        boolean hasCB7 = cb7.isChecked();
////        boolean hasCB8 = cb8.isChecked();
//
//
////        if (cb5.isChecked() && cb6.isChecked() && cb7.isChecked()) {
////            return;
////        }
//
//        //Question 6
//
//        boolean hasCB9 = cb9.isChecked();
//        boolean hasCB10 = cb10.isChecked();
//        boolean hasCB11 = cb11.isChecked();
//        boolean hasCB12 = cb12.isChecked();
//
////        if (cb9.isChecked() && cb10.isChecked() && cb12.isChecked()) {
////            return;
////        }
//        //Question 8
//        rb9 = findViewById(R.id.question8TF1);
//        rb10 = findViewById(R.id.question8TF2);
////        boolean hasRB9 = rb9.isChecked();
//        boolean hasRB10 = rb10.isChecked();
//
////        }
//
//
//        int score = calculateScoreTotal
//                (hasCB1, hasCB2, hasCB3, hasCB4, hasCB5, hasCB6, hasCB7, hasCB9, hasCB10,
//                        hasCB11, hasCB12, hasRB3, hasRB8, hasRB10);
//
//        String message = createResults(score, hasCB1, hasCB2, hasCB3, hasCB4, hasCB5, hasCB6, hasCB7, hasCB9, hasCB10,
//                hasCB11, hasCB12, hasRB3, hasRB8, hasRB10);
//    }
//
//    //This calculates the final score
//    private int calculateScoreTotal(boolean getCB1, boolean getCB2, boolean getCB3, boolean getCB4,
//                                    boolean getCB5, boolean getCB6, boolean getCB7,
//                                    boolean getCB9, boolean getCB10, boolean getCB12,
//                                    boolean getRB3, boolean getRB8, boolean getRB10) {
//
//        // First calculate the start points
//        int baseScore = 0;
//
//        // If the user gets a radio button question correct
//        if (getCB1) {
//            baseScore = baseScore + 1;
//        }
//
//        if (getCB2) {
//            baseScore = baseScore + 1;
//        }
//
//        if (getCB3) {
//            baseScore = baseScore + 1;
//        }
//
//        if (getCB4) {
//            baseScore = baseScore + 1;
//        }
//        if (getCB5) {
//            baseScore = baseScore + 1;
//        }
//        if (getCB6) {
//            baseScore = baseScore + 1;
//        }
//        if (getCB7) {
//            baseScore = baseScore + 1;
//        }
//
//        if (getCB9) {
//            baseScore = baseScore + 1;
//        }
//
//        if (getCB10) {
//            baseScore = baseScore + 1;
//        }
//
//        if (getCB12) {
//            baseScore = baseScore + 1;
//        }
//
//        if (getRB3) {
//            baseScore = baseScore + 1;
//        }
//
//        if (getRB8) {
//            baseScore = baseScore + 1;
//        }
//
//        if (getRB10) {
//            baseScore = baseScore + 1;
//        }
//
//        // Calculate the total order price by multiplying by the quantity
//        return baseScore;
//    }
//
//    private String createResults(int baseScore, boolean getCB1, boolean getCB2, boolean getCB3, boolean getCB4,
//                                 boolean getCB5, boolean getCB6, boolean getCB7, boolean getCB8,
//                                 boolean getCB9, boolean getCB10, boolean getCB12,
//                                 boolean getRB3, boolean getRB8, boolean getRB10) {
//
//         String endScore = getString(R.string.finalScoreMessage);
//
//         return endScore;
//
//    }
//
//    // This needs set to function with this code. this is a copy pasta
//
//
//
////    public class QuestionList {
////
////        private String Questions [] = {
////                "Archaeology is the study of what?",
////                "Select fields of archaeology from the options below:",
////                "Archaeologists who primarily do field work, often find what?",
////                "Name a well known fictional archaeologist.",
////                "What are some tools archaeologists in the United States often use? Select from the options below:",
////                "Where do archaeologists work?",
////                "Archaeologists often work with NAGPRA. What does this acronym stand for?",
////                "Archaeologists often do work for engineering firms."
////        };
////
////        private String Answers [] [] = {
////                {"Dinosaurs", "Spiders", "Material Culture", "Relics"},
////                {"Classical Archaeology", "CRM", "Garbology", "Paleoethnobotany"},
////                {"Gold", "Native American Spiritual Relics", "Dinosaur Bones", "Artifacts"},
////                {"Lara Croft", "Indiana Jones"},
////                {"Trowel", "Screen", "GPS", "Bulldozer"},
////                {"Cultural Resource Management Firms", "Your local State Historic Preservation Office", "Hospitals", "Egypt"},
////                {"Native American Graves Repatriation Act"},
////                {"True", "False"}
////        };
////
////        private String Correct [] ={
////                "Material Culture",
////                "Classical Archaeology", "CRM", "Garbology", "Paleoethnobotany",
////                "Artifacts",
////                "Lara Croft", "Indiana Jones",
////                "Trowel", "Screen", "GPS",
////                "Cultural Resource Management Firms", "Your local State Historic Preservation Office", "Egypt",
////                "Native American Graves Repatriation Act",
////                "True"
////        };
////
////        public String getQuestion (int a) {
////            String question = Questions[a];
////            return question;
////        }
////
////        public String getAnswers1(int a) {
////            String answers1 = Answers[a][1];
////            return answers1;
////        }
////
////        public String getCorrect(int a) {
////            String correct = Correct[a];
////            return correct;
////        }
//
//
//
////    @Override
////    public boolean onCreateOptionsMenu(Menu menu) {
////        // Inflate the menu; this adds items to the action bar if it is present.
////        getMenuInflater().inflate(R.menu.menu_quiz, menu);
////        return true;
////    }
////
////    @Override
////    public boolean onOptionsItemSelected(MenuItem item) {
////        // Handle action bar item clicks here. The action bar will
////        // automatically handle clicks on the Home/Up button, so long
////        // as you specify a parent activity in AndroidManifest.xml.
////        int id = item.getItemId();
////
////        //noinspection SimplifiableIfStatement
////        if (id == R.id.action_settings) {
////            return true;
////        }
////        return super.onOptionsItemSelected(item);
////    }
//
//
//    }


