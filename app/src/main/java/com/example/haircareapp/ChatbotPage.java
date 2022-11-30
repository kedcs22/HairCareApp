package com.example.haircareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChatbotPage extends AppCompatActivity {

    private ImageButton homePage;
    private ImageButton chatBot;
    private ImageButton profilePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot_page);

        homePage = findViewById(R.id.homePage);
        profilePage = findViewById(R.id.profilePage);
        chatBot = findViewById(R.id.chatBot);

        initHomePage();
        initProfilePage();
        initChatBot();
    }


        private void initHomePage() {
        homePage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ChatbotPage.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initProfilePage() {
        profilePage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ChatbotPage.this, UserProfile.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private void initChatBot() {
        chatBot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(ChatbotPage.this, ChatbotPage.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}