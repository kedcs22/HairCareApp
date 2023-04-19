package com.example.haircareapp;


import android.content.Intent;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

import android.widget.Button;
import android.widget.ImageButton;


import java.util.ArrayList;

public class MainActivity extends YouTubeBaseActivity {

    String api_key = "AIzaSyDYtzNF6N_4N2HK5efkC0pLxw4eiZS8was";

    private YouTubePlayer youTubePlayer;
    private String video_ID;

    private ImageButton homePage;
    private ImageButton chatBot;
    private ImageButton profilePage;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference to the view of Video player

        homePage = findViewById(R.id.homePage);
        profilePage = findViewById(R.id.profilePage);
        chatBot = findViewById(R.id.chatBot);

        button1 = findViewById(R.id.btnOne);
        button2 = findViewById(R.id.btnTwo);
        button3 = findViewById(R.id.btnThree);
        button4 = findViewById(R.id.btnFour);
        button5 = findViewById(R.id.btnFive);



        initHomePage();
        initChatBot();
        initProfilePage();
        //initButtonOne();

        // Get reference to the view of Video player
        YouTubePlayerView ytPlayerView = (YouTubePlayerView) findViewById(R.id.ytPlayer);

        ytPlayerView.initialize(
                api_key,
                new YouTubePlayer.OnInitializedListener() {
                    // Implement two methods by clicking on red
                    // error bulb inside onInitializationSuccess
                    // method add the video link or the playlist
                    // link that you want to play In here we
                    // also handle the play and pause
                    // functionality

                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
                        initButtonOne();
                        initButtonTwo();
                        initButtonThree();
                        initButtonFour();
                        initButtonFive();
                    }


                    // Inside onInitializationFailure
                    // implement the failure functionality
                    // Here we will show toast
                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                                        YouTubeInitializationResult
                                                                youTubeInitializationResult)
                    {
                        Toast.makeText(getApplicationContext(), "Video player Failed", Toast.LENGTH_SHORT).show();
                    }
                });


    }

    private void initButtonOne() {
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "Pj3V86MCMJg", 0, true, false);
                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initButtonTwo() {
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "GfSluWrVH20", 0, true, false);
                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initButtonThree() {
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "fGODBDMt-_E", 0, true, false);
                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initButtonFour() {
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "Gs4Y-M4aCek", 0, true, false);
                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initButtonFive() {
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "x_tU_e5puSM", 0, true, false);
                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
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