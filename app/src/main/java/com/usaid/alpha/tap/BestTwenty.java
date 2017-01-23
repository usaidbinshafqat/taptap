package com.usaid.alpha.tap;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BestTwenty extends AppCompatActivity {

    int scoreP1 = 0;
    int scoreP2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_twenty);
    }

    public void increaseP1(View view) {
        scoreP1 = scoreP1 + 1;
        displayscore1(scoreP1);
        if (scoreP1 == 20) {
            scoreP1 = 0;
            displayscore1(scoreP1);

            scoreP2 = 0;
            displayscore2(scoreP2);

            double rand = Math.random();
            if (rand < 0.25) {
                showMessage("Blue Won!", "Your Friend Is a Loser");
            }
            else if (rand > 0.25 && rand < 0.5) {
                showMessage("Blue Won!", "You are awesome.");
            }
            else if (rand > 0.5 && rand <0.75) {
                showMessage("Blue Won!", "Red Player, you suck. ");
            }
            else {
                showMessage("Blue Won!", "Care for a rematch?");
            }
        }

    }

    public void increaseP2(View view) {
        scoreP2 = scoreP2 + 1;
        displayscore2(scoreP2);
        if (scoreP2 == 20) {
            scoreP1 = 0;
            displayscore1(scoreP1);

            scoreP2 = 0;
            displayscore2(scoreP2);

            double rand = Math.random();
            if (rand < 0.25) {
                showMessage("Red Won!", "Your Friend Is a Loser");
            } else if (rand > 0.25 && rand < 0.5) {
                showMessage("Red Won!", "You are awesome.");
            } else if (rand > 0.5 && rand < 0.75) {
                showMessage("Red Won!", "Blue Player, you suck. ");
            } else {
                showMessage("Red Won!", "Care for a rematch?");
            }

        }

    }

    private void displayscore1(int number) {
        TextView scoreP1 = (TextView)
                findViewById(
                        R.id.scoreP1);
        scoreP1.setText("Score " + number);

    }

    private void displayscore2(int number) {
        TextView scoreP2 = (TextView) findViewById(R.id.scoreP2);
        scoreP2.setText("Score " + number);
    }

    public void showMessage(String title, String message){
        android.support.v7.app.AlertDialog.Builder builder1 = new android.support.v7.app.AlertDialog.Builder(BestTwenty.this);
        builder1.setTitle(title);
        builder1.setMessage(message);
        builder1.setCancelable(true);

        builder1.setPositiveButton("Rematch", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //This will run when you tap the Okay button write any code here
                dialog.cancel();
            }
        });

        builder1.setNegativeButton("New Game", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //This will run when you tap the Okay button write any code here
                finish();
            }
        });

        android.support.v7.app.AlertDialog alert11 = builder1.create();
        alert11.setCanceledOnTouchOutside(false);
        alert11.show();

    }

}
