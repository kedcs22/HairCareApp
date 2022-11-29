package com.example.haircareapp;


import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton homePage;
    private ImageButton chatBot;
    private ImageButton profilePage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homePage = findViewById(R.id.homePage);
        profilePage = findViewById(R.id.profilePage);
        chatBot = findViewById(R.id.chatBot);

        initHomePage();
        initChatBot();
        initProfilePage();

        Uri uri = Uri.parse("https://www.youtube.com/watch?v=tYS-PSkzi7c");
        VideoView discoveryVideo = (VideoView) findViewById(R.id.discoveryVideo);
        discoveryVideo.setVideoURI(uri);
        discoveryVideo.start();
    }


    private void initHomePage() {
        homePage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initProfilePage() {
        profilePage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UserProfile.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initChatBot() {
        chatBot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChatbotPage.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

}