package com.kevinhermawan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreTeamA(int score) {
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamAScore.setText(String.valueOf(score));
    }

    public void teamA3Point(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA(scoreTeamA);
    }

    public void teamA2Point(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA(scoreTeamA);
    }

    public void teamAFreeThrow(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }

    public void displayScoreTeamB(int score) {
        TextView teamAScore = (TextView) findViewById(R.id.teamBScore);
        teamAScore.setText(String.valueOf(score));
    }

    public void teamB3Point(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreTeamB(scoreTeamB);
    }

    public void teamB2Point(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB(scoreTeamB);
    }

    public void teamBFreeThrow(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}
