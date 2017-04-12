package com.example.android.fracturedspacescorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamAAlpha = 0;
    int scoreTeamABeta = 0;
    int scoreTeamBAlpha = 0;
    int scoreTeamBBeta = 0;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A Alpha.
     */
    public void displayForTeamAAlpha(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_alpha_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A Beta.
     */
    public void displayForTeamABeta(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_beta_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addAlphaForTeamA(View view) {
        scoreTeamAAlpha = scoreTeamAAlpha + 1;
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayForTeamAAlpha(scoreTeamAAlpha);
    }

    public void addBetaForTeamA(View view) {
        scoreTeamABeta = scoreTeamBBeta + 1;
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayForTeamABeta(scoreTeamABeta);
    }

    public void addGammaForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B Alpha.
     */
    public void displayForTeamBAlpha(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_alpha_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B Beta.
     */
    public void displayForTeamBBeta(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_beta_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addAlphaForTeamB(View view) {
        scoreTeamBAlpha = scoreTeamBAlpha + 1;
        scoreTeamB = scoreTeamB + 1;
        displayForTeamBAlpha(scoreTeamBAlpha);
        displayForTeamB(scoreTeamB);
    }

    public void addBetaForTeamB(View view) {
        scoreTeamBBeta = scoreTeamBBeta + 1;
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        displayForTeamBBeta(scoreTeamBBeta);
    }

    public void addGammaForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }



    /*
    * Reset Button
    * */
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreTeamAAlpha = 0;
        scoreTeamABeta = 0;
        scoreTeamBAlpha = 0;
        scoreTeamBBeta = 0;
        displayForTeamAAlpha(scoreTeamAAlpha);
        displayForTeamABeta(scoreTeamABeta);
        displayForTeamBAlpha(scoreTeamBAlpha);
        displayForTeamBBeta(scoreTeamBBeta);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
