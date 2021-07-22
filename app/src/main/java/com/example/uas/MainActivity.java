package com.example.uas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Battle start = new Battle();
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        final TextView text = findViewById(R.id.announcement);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = start.war();
                if (result == 1){
                    text.setText("Player 1 Wins Battle 1");
                }
                else if (result == 2){
                    text.setText("Player 2 Wins Battle 1");
                }
                else {
                    text.setText("Draw");
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = start.war1();
                if (result == 1){
                    text.setText("Player 1 Wins Battle 2");
                }
                else if (result == 2){
                    text.setText("Player 2 Wins Battle 2");
                }
                else {
                    text.setText("Draw");
                }
            }
        });
    }
}