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
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;

    private Button activeButton;



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
        button6 = findViewById(R.id.btnSix);
        button7 = findViewById(R.id.btnSeven);
        button8 = findViewById(R.id.btnEight);
        button9 = findViewById(R.id.btnNine);
        button10 = findViewById(R.id.btnTen);
        button11 = findViewById(R.id.btnEleven);

        activeButton = button1;
        button1.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));



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
                        player.loadVideo("Pj3V86MCMJg");

                        youTubePlayer = player;
                        initButtonOne();
                        initButtonTwo();
                        initButtonThree();
                        initButtonFour();
                        initButtonFive();
                        initButtonSix();
                        initButtonSeven();
                        initButtonEight();
                        initButtonNine();
                        initButtonTen();
                        initButtonEleven();
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

            private boolean playVideo = false;

            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);

                activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                button1.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                activeButton = button1;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "Pj3V86MCMJg", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("Pj3V86MCMJg");
                    button1.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                }
                playVideo = !playVideo;
            }
        });
    }

    private void initButtonTwo() {
        button2.setOnClickListener(new View.OnClickListener() {

            private boolean playVideo = false;

            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);

                activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                button2.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                activeButton = button2;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "gHjO8qyg_cA", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("gHjO8qyg_cA");
                    button2.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                }
                playVideo = !playVideo;
            }
        });
    }

    private void initButtonThree() {
        button3.setOnClickListener(new View.OnClickListener() {

            private boolean playVideo = false;


            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);

                activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                button3.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                activeButton = button3;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "PlGbPj_7BO8", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("PlGbPj_7BO8");
                    button3.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                }
                playVideo = !playVideo;
            }
        });
    }

    private void initButtonFour() {
        button4.setOnClickListener(new View.OnClickListener() {

            private boolean playVideo = false;

            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);

                activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                button4.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                activeButton = button4;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "Uj2E7w8Ge4E", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("Uj2E7w8Ge4E");
                    button4.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                }
                playVideo = !playVideo;
            }
        });
    }

    private void initButtonFive() {

        button5.setOnClickListener(new View.OnClickListener() {


            private boolean playVideo = false;


            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);


                    activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                    button5.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                    activeButton = button5;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "RKFwHMfBwa0", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("RKFwHMfBwa0");
                    button5.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));

                }
                playVideo = !playVideo;

            }
        });
    }

    private void initButtonSix() {
        button6.setOnClickListener(new View.OnClickListener() {

            private boolean playVideo = false;

            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);

                activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                button6.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                activeButton = button4;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "5ElUtEe6Luk", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("5ElUtEe6Luk");
                    button6.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                }
                playVideo = !playVideo;
            }
        });
    }

    private void initButtonSeven() {
        button7.setOnClickListener(new View.OnClickListener() {

            private boolean playVideo = false;

            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);

                activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                button7.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                activeButton = button7;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "1Ff1q9kKXkQ", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("1Ff1q9kKXkQ");
                    button7.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                }
                playVideo = !playVideo;
            }
        });
    }

    private void initButtonEight() {
        button8.setOnClickListener(new View.OnClickListener() {

            private boolean playVideo = false;

            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);

                activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                button8.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                activeButton = button8;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "YZW3Yky128w", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("YZW3Yky128w");
                    button8.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                }
                playVideo = !playVideo;
            }
        });
    }

    private void initButtonNine() {
        button9.setOnClickListener(new View.OnClickListener() {

            private boolean playVideo = false;

            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);

                activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                button9.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                activeButton = button9;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "ZU8Xl04-ZIE", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("ZU8Xl04-ZIE");
                    button9.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                }
                playVideo = !playVideo;
            }
        });
    }

    private void initButtonTen() {
        button10.setOnClickListener(new View.OnClickListener() {

            private boolean playVideo = false;

            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);

                activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                button10.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                activeButton = button10;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "HGmIb5hDweg", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("HGmIb5hDweg");
                    button10.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                }
                playVideo = !playVideo;
            }
        });
    }

    private void initButtonEleven() {
        button11.setOnClickListener(new View.OnClickListener() {

            private boolean playVideo = false;

            public void onClick(View view) {
                //Intent intent = new Intent(MainActivity.this, MainActivity.class);

                activeButton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                button11.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                activeButton = button11;

                if (playVideo) {
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity.this, api_key, "hs60YpxuAzE", 0, true, false);
                    startActivity(intent);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    youTubePlayer.loadVideo("hs60YpxuAzE");
                    button11.setBackgroundColor( getResources().getColor(android.R.color.holo_red_light));
                }
                playVideo = !playVideo;
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