package com.example.haircareapp;


import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri uri = Uri.parse("https://cs.widener.edu/~fischbac/test");
        VideoView discoveryVideo = (VideoView) findViewById(R.id.discoveryVideo);
        //discoveryVideo.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.testvid));
        discoveryVideo.setVideoURI(uri);
        discoveryVideo.start();
    }
}