package com.example.avni.project1_quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void startButton(View view) {

        EditText editText = (EditText)findViewById(R.id.editTextName);
        Intent quizIntent = new Intent(MainActivity.this, QuizActivity.class);
        quizIntent.putExtra("Name",editText.getText().toString());
        startActivity(quizIntent);
    }

}
