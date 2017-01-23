package com.usaid.alpha.tap;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void goToTwenty(View view) {
        Intent i = new Intent(MainActivity.this, BestTwenty.class);
        startActivity(i);

    }

    public void goToForty(View view) {
        Intent i = new Intent(MainActivity.this, bestForty.class);
        startActivity(i);

    }

    public void goToSixty(View view) {
        Intent i = new Intent(MainActivity.this, BestSixty.class);
        startActivity(i);
    }

    public void goToHundred(View view) {
        Intent i = new Intent(MainActivity.this, BestHundred.class);
        startActivity(i);
    }

    public void goToHard(View view) {
        Intent i = new Intent(MainActivity.this, levelDifficult.class);
        startActivity(i);

    }

    public void goToSecret(View view) {
        Intent i = new Intent(MainActivity.this, secretMode.class);
        startActivity(i);
    }

    public void shareTapTap(View view) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Let's have a Tap Tap match. Download here: ";
        String shareSub = "Tap Tap";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share using"));
    }

}
