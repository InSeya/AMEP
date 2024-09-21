package com.example.amep.MainScreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.amep.Auth.LoginActivity;
import com.example.amep.Auth.Logout_activity;
import com.example.amep.MainActivity;
import com.example.amep.R;

public class
HomePageActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView NotesCard, QuizCard, HistoryCard, ProfileCard, LogoutCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        NotesCard = (CardView) findViewById(R.id.notesbtn);
        QuizCard = (CardView) findViewById(R.id.quizbtn);
        HistoryCard = (CardView) findViewById(R.id.historybtn);
        ProfileCard = (CardView) findViewById(R.id.profilebtn);
        LogoutCard = (CardView) findViewById(R.id.logoutbtn);

        NotesCard.setOnClickListener(this);
        QuizCard.setOnClickListener(this);
        HistoryCard.setOnClickListener(this);
        ProfileCard.setOnClickListener(this);
        LogoutCard.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.notesbtn:i=new Intent(this, Notes_module.class);startActivity(i);break;
            case R.id.quizbtn:i=new Intent(this, Quiz_module.class);startActivity(i);break;
            case R.id.historybtn:i=new Intent(this, History_module.class);startActivity(i);break;
            case R.id.profilebtn:i=new Intent(this, Profile_module.class);startActivity(i);break;
            case R.id.logoutbtn:i=new Intent(this, LoginActivity.class);startActivity(i);break;
            default:break;
        }

    }

}
