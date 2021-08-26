package com.example.android_8_notifications_example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final NotificationHelper notificationHelper = new NotificationHelper(this);

        Button notifyBtn = findViewById(R.id.notify_btn);

        notifyBtn.setOnClickListener((View.OnClickListener) view -> notificationHelper.notify("Notification message", "Title"));
    }
}