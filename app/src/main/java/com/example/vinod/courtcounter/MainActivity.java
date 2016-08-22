package com.example.vinod.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Set the variables for team A and team B .
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the  score for Team A By 3.
     */
        public void addThreeForTeamA(View v){
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the  score for Team A By 2.
     */

        public void addTwoForTeamA(View v){
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the  score for Team A By 1.
     */

        public void addOneForTeamA(View v){
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the  score for Team B By 3.
     */

    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the  score for Team B By 2.
     */

    public void addTwoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the  score for Team B By 1.
     */

    public void addOneForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA (int score) {
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB (int score) {
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
