package com.example.android.rockloud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Opening/Clicking 'AllsongsActivity' from 'MainActivity' i.e.
         * 1. Find the View that shows the 'All songs'
         * 2. Set a clickListener on the 'objAllsongs' RelativeLayout
         * 3. Overriding the onClick (Public Method) of View.OnClickListener Interface by
         * 4. defining a new 'iAallsongs' intent to open the AllsongsActivity.
         */

        RelativeLayout objAllsongs = (RelativeLayout) findViewById(R.id.reloAllSongs);
        objAllsongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iAallsongs = new Intent(MainActivity.this, AllsongsActivity.class);
                startActivity(iAallsongs);
            }
        });

        // Opening/Clicking 'ArtistsActivity' from 'MainActivity' i.e.
        RelativeLayout objArtists = (RelativeLayout) findViewById(R.id.reloArtists);
        objArtists.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the 'rlAllSongs' RelativeLayout is clicked
            @Override
            public void onClick(View view) {
                Intent iArtists = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(iArtists);
            }
        });

        // Opening/Clicking 'AlbumsActivity' from 'MainActivity' i.e.
        RelativeLayout objAlbums = (RelativeLayout) findViewById(R.id.reloAlbums);
        objAlbums.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the 'rlAllSongs' RelativeLayout is clicked
            @Override
            public void onClick(View view) {
                Intent iAlbums = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(iAlbums);
            }
        });

        // Opening/Clicking 'FoldersActivity' from 'MainActivity' i.e.
        RelativeLayout objFolders = (RelativeLayout) findViewById(R.id.reloFolders);
        objFolders.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the 'rlAllSongs' RelativeLayout is clicked
            @Override
            public void onClick(View view) {
                Intent iFolders = new Intent(MainActivity.this, FoldersActivity.class);
                startActivity(iFolders);
            }
        });

        // Opening/Clicking 'PlaylistsActivity' from 'MainActivity' i.e.
        RelativeLayout objPlaylists = (RelativeLayout) findViewById(R.id.reloPlalists);
        objPlaylists.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the 'rlAllSongs' RelativeLayout is clicked
            @Override
            public void onClick(View view) {
                Intent iPlaylists = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(iPlaylists);
            }
        });

        // Opening/Clicking 'ScanmediaActivity' from 'MainActivity' i.e.
        RelativeLayout objScanmedia = (RelativeLayout) findViewById(R.id.reloScanmedia);
        objScanmedia.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the 'rlAllSongs' RelativeLayout is clicked
            @Override
            public void onClick(View view) {
                Intent iScanmedia = new Intent(MainActivity.this, ScanmediaActivity.class);
                startActivity(iScanmedia);
            }
        });

        // Opening/Clicking 'EqualizerActivity' from 'MainActivity' i.e.
        RelativeLayout objEqualizer = (RelativeLayout) findViewById(R.id.reloEqualizer);
        objEqualizer.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the 'rlAllSongs' RelativeLayout is clicked
            @Override
            public void onClick(View view) {
                Intent iEqualizer = new Intent(MainActivity.this, EqualizerActivity.class);
                startActivity(iEqualizer);
            }
        });


        // Opening/Clicking 'SleepActivity' from 'MainActivity' i.e.
        RelativeLayout objSleep = (RelativeLayout) findViewById(R.id.reloSleep);
        objSleep.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the 'rlAllSongs' RelativeLayout is clicked
            @Override
            public void onClick(View view) {
                Intent iSleep = new Intent(MainActivity.this, SleepActivity.class);
                startActivity(iSleep);
            }
        });

        // Opening/Clicking 'SettingsActivity' from 'MainActivity' i.e.
        RelativeLayout objSettings = (RelativeLayout) findViewById(R.id.reloSettings);
        objSettings.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the 'rlAllSongs' RelativeLayout is clicked
            @Override
            public void onClick(View view) {
                Intent iSettings = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(iSettings);
            }
        });

        // Opening/Clicking 'NowplayingActivity' from 'MainActivity' i.e.
        LinearLayout objNowplaying = (LinearLayout) findViewById(R.id.leloNowPlaying);
        objNowplaying.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the 'rlAllSongs' RelativeLayout is clicked
            @Override
            public void onClick(View view) {
                Intent iNowplaying = new Intent(MainActivity.this, NowplayingActivity.class);
                startActivity(iNowplaying);
            }
        });

    }
}
