package com.example.haircareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class UserProfile extends AppCompatActivity {

    private ImageButton homePage;
    private ImageButton chatBot;
    private ImageButton profilePage;

    private Button savedVideos;
    private Button savedArticles;
    private Button followedCreators;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        homePage = findViewById(R.id.homePage);
        profilePage = findViewById(R.id.profilePage);
        chatBot = findViewById(R.id.chatBot);

        initProfilePage();
        initHomePage();
        initChatBot();

        savedVideos = (Button) findViewById(R.id.button);
        savedArticles = findViewById(R.id.button2);
        followedCreators = findViewById(R.id.button3);

        initSavedArticles();
        initSavedVideos();
        initFollowedCreators();

    }


    private void initSavedArticles () {
        homePage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(UserProfile.this, SavedVideos.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initSavedVideos () {
        homePage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(UserProfile.this, SavedVideos.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initFollowedCreators() {
        homePage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(UserProfile.this, FollowedCreators.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initHomePage() {
        homePage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(UserProfile.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initProfilePage() {
        profilePage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(UserProfile.this, UserProfile.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initChatBot() {
        chatBot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(UserProfile.this, ChatbotPage.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }


}