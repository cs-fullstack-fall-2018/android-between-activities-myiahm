package com.example.student.over5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private int count1=0;
    private TextView showCount1;

    public static final String EXTRA_MESSAGE =
            "You Won!!! Total of ";
    private EditText mMessageEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount1 = (TextView) findViewById(R.id.textView);

    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, YouWon.class);
        if (count1>=5) {


        }

        startActivity(intent);


    }

    public void showCount(View view) {
        ++count1;
        if (showCount1 != null)
            showCount1.setText(Integer.toString(count1));
    }
}
