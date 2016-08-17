package com.example.android.rockloud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView imgvRing = (ImageView) findViewById(R.id.ring);

        // Creating an Animation object
        Animation animRing = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);

        // Now Starting animation on Image 'ring' by calling 'startAnimation' method and passing animation param and
        // Setting animation Listener
        imgvRing.startAnimation(animRing);
        animRing.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Nothing to declare/perform
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent iStartMainActivity = new Intent(getBaseContext(), MainActivity.class);
                startActivity(iStartMainActivity);
                finish(); // This will close the Splash Screen
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Nothing to declare/perform
            }
        });
    }
}