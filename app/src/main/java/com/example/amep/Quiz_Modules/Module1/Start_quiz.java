package com.example.amep.Quiz_Modules.Module1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.amep.R;

import java.util.Timer;
import java.util.TimerTask;

public class Start_quiz extends AppCompatActivity {
    ProgressBar timerProgress;
    TextView timerText;

    Timer t;

    int second = 0;

    String currentOption = "";
    Button submitAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        initialize();
        startTimer();
    }

    private void initialize() {
        timerProgress = (ProgressBar) findViewById(R.id.progressBar);
        timerText = (TextView) findViewById(R.id.time);
        submitAnswer = (Button) findViewById(R.id.submit);
        timerProgress.setMax(100);
        timerProgress.setIndeterminate(false);

        submitAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentOption.isEmpty()) {
                    Toast.makeText(Start_quiz.this, "Please select an Option", Toast.LENGTH_SHORT).show();
                } else {
                    //submit

                }
            }
        });


    }

    public void startTimer() {
        t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (second == 15) {
                            t.cancel();
                            return;
                        }
                        timerText.setText("second" + (15 - second));
                        int prog = (int) ((second / 15.0) * 100.0);
                        timerProgress.setProgress(prog);
                        second++;

                    }
                });

            }
        }, 0, 1000);
    }

    public void optionSelected(View v) {
        RadioButton btn = (RadioButton) v;


        currentOption = (String) btn.getText();

    }

}

