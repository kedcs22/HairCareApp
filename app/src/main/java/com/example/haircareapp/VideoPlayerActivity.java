package com.example.haircareapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class VideoPlayerActivity extends YouTubeBaseActivity {

    String api_key = "AIzaSyDYtzNF6N_4N2HK5efkC0pLxw4eiZS8was";

    @Override
    protected void
    onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        // Get reference to the view of Video player
        YouTubePlayerView ytPlayer = (YouTubePlayerView)findViewById(R.id.videoPlayer);

        ytPlayer.initialize( api_key,
                new YouTubePlayer.OnInitializedListener() {

                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
                    {
                        youTubePlayer.loadVideo("bHpPQcCiKJ8", 0);
                        //youTubePlayer.play();
                    }

                    // Inside onInitializationFailure
                    // implement the failure functionality
                    // Here we will show toast
                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
                    {
                        Toast.makeText(getApplicationContext(), "Video player Failed", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    public static class practice_page {
    }
}

// Implement two methods by clicking on red
// error bulb inside onInitializationSuccess
//<VideoView
//                        android:id="@+id/discoveryVideo"
//                        android:layout_width="375dp"
//                        android:layout_height="250dp"
//                        android:layout_marginStart="10dp"
//                        android:layout_marginTop="10dp"
//                        android:layout_marginEnd="20dp"
//                        android:layout_marginBottom="10dp" />
// method add the video link or the playlist
// link that you want to play In here we
// also handle the play and pause
// functionality