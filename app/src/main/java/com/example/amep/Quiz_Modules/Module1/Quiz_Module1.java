package com.example.amep.Quiz_Modules.Module1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.amep.R;


public class Quiz_Module1 extends AppCompatActivity {
    Button start,previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_module1);

        start= (Button) findViewById(R.id.startbtn1);
        previous= (Button) findViewById(R.id.prebtn1);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("EROOR","i am in");
                Intent i= new Intent(Quiz_Module1.this, Start_quiz.class);
                startActivity(i);
                Log.d("EROOR","i am in out");
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Quiz_Module1.this, Previous.class);
                startActivity(i);
            }
        });
    }
}
