package com.example.amep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.amep.Auth.LoginActivity;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    FirebaseFirestore firestore;

    private static int SPLASH_SCREEN_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent i= new Intent(MainActivity.this,
                                                  LoginActivity.class);
                                          startActivity(i);

                                          finish();
                                      }
                                  },
                SPLASH_SCREEN_TIME_OUT);

//
//        Map<String,Object> users = new HashMap<>();
//        users.put("FirstName", "Aaisha");
//        users.put("LastName", "Aaisha");
//        users.put("description", "Aaisha");




    }
}