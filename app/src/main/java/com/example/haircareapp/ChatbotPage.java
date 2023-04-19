package com.example.haircareapp;

import static android.os.Build.USER;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ChatbotPage extends AppCompatActivity {

    private EditText messageBox; //line

    private ImageButton homePage;
    private ImageButton chatBot;
    private ImageButton profilePage;

    // switching between user and bot
    private final int USER = 0;
    private final int BOT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot_page);

        messageBox = findViewById(R.id.messageBox); //line

        homePage = findViewById(R.id.homePage);
        profilePage = findViewById(R.id.profilePage);
        chatBot = findViewById(R.id.chatBot);

        initHomePage();
        initProfilePage();
        initChatBot();
        //sendMessage();

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

    /*
    // send message function function
    private void sendMessage() {
        String msg = messageBox.getText().toString();
        if (msg.trim().isEmpty()) {
            Toast.makeText(ChatbotPage.this, "What Are You Looking For", Toast.LENGTH_LONG).show();
        } else {
            showTextView(msg, USER);
            messageBox.setText("");
        }
    }


    private void showTextView(String message, int type) {
        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        LayoutInflater inflater = LayoutInflater.from(ChatbotPage.this);
        FrameLayout layout;
        switch (type) {
            case USER:
                layout = getUserLayout();
                break;
            case BOT:
                layout = getBotLayout();
                break;
            default:
                layout = getBotLayout();
                break;
        }
        layout.setFocusableInTouchMode(true);
        linearLayout.addView(layout);
        EditText mb = layout.findViewById(R.id.messageBox);
        mb.setText(message);
        layout.requestFocus();
        messageBox.requestFocus();
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm aa",
                Locale.ENGLISH);
        String time = dateFormat.format(date);
        TextView timeTextView = layout.findViewById(R.id.message_time);
        timeTextView.setText(time.toString());
    }
*/



}
