package com.example.android.rockloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        /**
         * DISPLAY TOAST MESSAGE FOR 'ArtistsActivity'
         * 1. Find the Parent View that shows the 'ArtistsActivity'
         * 2. Set a clickListener on that View.
         * 3. Overriding the onClick (Public Method) of View.OnClickListener Interface by
         * 4. defining a 'TOAST' message to be displayed whenever the Parent View is clicked.
         */
        RelativeLayout objArtistsActivity = (RelativeLayout) findViewById(R.id.reloArtistsActivity);
        objArtistsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText
                        (getApplicationContext(), "Sorry, this Activity is under construction." +
                                "\nPlease visit later!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
