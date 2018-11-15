package com.example.student.over5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class YouWon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_won);
        Intent intent = getIntent();
        String message = " You Won!!! Total of ", count1;
        TextView textView =(TextView)findViewById(R.id.textView);
        textView.setText(message);
    }
}
