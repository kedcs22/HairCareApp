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
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=tYS-PSkzi7c");
        VideoView discoveryVideo = (VideoView) findViewById(R.id.discoveryVideo);
        discoveryVideo.setVideoURI(uri);
        discoveryVideo.start();
    }
}