package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int points = 0;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz (View view) {

        // Figure out if Lisbon is selected
        RadioButton lisbonButton = this.findViewById(R.id.lisbon);
        boolean answer1 = lisbonButton.isChecked();
        if (answer1) {
            points = 2;
        } else {
            points = 0;
        }

        // Figure out if Nigeria is selected
        RadioButton nigeriaButton = this.findViewById(R.id.nigeria);
        boolean answer2 = nigeriaButton.isChecked();
        if (answer2) {
            points = points + 2;
        } else {
            points = points + 0;
        }

        // Figure out if Suez Canal is selected
        RadioButton suezCanalButton = this.findViewById(R.id.suezCanal);
        boolean answer3 = suezCanalButton.isChecked();
        if (answer3) {
            points = points + 2;
        } else {
            points = points + 0;
        }

        // Figure out if Sicily is selected
        RadioButton sicilyButton = this.findViewById(R.id.sicily);
        boolean answer4 = sicilyButton.isChecked();
        if (answer4) {
            points = points + 2;
        } else {
            points = points + 0;
        }

        // Figure out if Potiskum was checked
        CheckBox potiskumCheckBox = findViewById(R.id.potiskum);
        boolean answer5a = potiskumCheckBox.isChecked();
        if (answer5a) {
            points = points + 1;
        } else {
            points = points + 0;
        }

        // Figure out if Ikeja was checked
        CheckBox ikejaCheckBox = findViewById(R.id.ikeja);
        boolean answer5b = ikejaCheckBox.isChecked();
        if (answer5b) {
            points = points + 1;
        } else {
            points = points + 0;
        }

        message = "You have " + points + " out of 10 points";

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        return;

    }

}


