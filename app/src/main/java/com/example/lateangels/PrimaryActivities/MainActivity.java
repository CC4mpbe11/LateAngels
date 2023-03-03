package com.example.lateangels.PrimaryActivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lateangels.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enterButtonId = findViewById(R.id.enterButtonId);
        enterButtonId.setOnClickListener(
                v -> openMenuActivity()
        );
    }

    public void openMenuActivity() {
        //Intent intent = new Intent(this, MenuActivity.class);
        //startActivity(intent);
    }

}