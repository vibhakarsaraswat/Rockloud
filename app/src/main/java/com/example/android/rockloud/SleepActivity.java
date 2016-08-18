package com.example.android.rockloud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class SleepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);


        // Initializing a new Instance of 'LocalTime' to fetch Current LocalTime
        final LocalTime rightNow = new LocalTime();

        // Initializing a new Instance of 'DateTimeFormatter' to remove default MilliSeconds in 'LocalTime'.
        final DateTimeFormatter fmt = DateTimeFormat.forPattern("HH:mm:ss");

        /**
         * Display the Current Local Time on Button Click
         * 1. Find the Button (View) having ID = btnShowLocalDateTime
         * 2. Set a clickListener on that View.
         * 3. Overriding the onClick (Public Method) of View.OnClickListener Interface by
         * 4. Finding the TextView having ID = txvShowLocalTime and then
         * 5. Setting the Text equal to value present in 'rightNow' variable with Formatting as Current Local TIme
         */
        final Button objBTNSLDT = (Button) findViewById(R.id.btnShowLocalTime);
        objBTNSLDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView objTXVSLDT = (TextView) findViewById(R.id.txvShowLocalTime);
                objTXVSLDT.setText(fmt.print(rightNow));
            }
        });


        /**
         * DISPLAY TOAST MESSAGE FOR 'SleepActivity'
         * 1. Find the Parent View that shows the 'SleepActivity'
         * 2. Set a clickListener on that View.
         * 3. Overriding the onClick (Public Method) of View.OnClickListener Interface by
         * 4. defining a 'TOAST' message to be displayed whenever the Parent View is clicked.
         */
        ImageView objSleepActivity = (ImageView) findViewById(R.id.imgSleep);
        objSleepActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText
                        (getApplicationContext(), "Sorry, this Activity is under construction." +
                                "\nPlease visit later!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
