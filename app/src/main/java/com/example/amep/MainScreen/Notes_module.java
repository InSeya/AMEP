package com.example.amep.MainScreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.amep.Auth.Logout_activity;
import com.example.amep.Notes_Modules.Module1.Notes_Module1;
import com.example.amep.Notes_Modules.Module10.Notes_Module10;
import com.example.amep.Notes_Modules.Module11A.Notes_Module11a;
import com.example.amep.Notes_Modules.Module11B.Notes_Module11b;
import com.example.amep.Notes_Modules.Module12.Notes_Module12;
import com.example.amep.Notes_Modules.Module13.Notes_Module13;
import com.example.amep.Notes_Modules.Module14.Notes_Module14;
import com.example.amep.Notes_Modules.Module15.Notes_Module15;
import com.example.amep.Notes_Modules.Module16.Notes_Module16;
import com.example.amep.Notes_Modules.Module17.Notes_Module17;
import com.example.amep.Notes_Modules.Module2.Notes_Module2;
import com.example.amep.Notes_Modules.Module3.Notes_Module3;
import com.example.amep.Notes_Modules.Module4.Notes_Module4;
import com.example.amep.Notes_Modules.Module5.Notes_Module5;
import com.example.amep.Notes_Modules.Module6.Notes_Module6;
import com.example.amep.Notes_Modules.Module7.Notes_Module7;
import com.example.amep.Notes_Modules.Module8.Notes_Module8;
import com.example.amep.Notes_Modules.Module9.Notes_Module9;
import com.example.amep.R;

public class Notes_module extends AppCompatActivity implements View.OnClickListener {
    private CardView Module1,Module2,Module3,Module4,Module5,Module6,Module7,Module8,Module9;
    private CardView Module10,Module11A,Module11B,Module12,Module13,Module14,Module15,Module16,Module17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_module);

        Module1=(CardView) findViewById(R.id.module1);
        Module2=(CardView) findViewById(R.id.module2);
        Module3=(CardView) findViewById(R.id.module3);
        Module4=(CardView) findViewById(R.id.module4);
        Module5=(CardView) findViewById(R.id.module5);
        Module6=(CardView) findViewById(R.id.module6);
        Module7=(CardView) findViewById(R.id.module7);
        Module8=(CardView) findViewById(R.id.module8);
        Module9=(CardView) findViewById(R.id.module9);
        Module10=(CardView) findViewById(R.id.module10);
        Module11A=(CardView) findViewById(R.id.module11A);
        Module11B=(CardView) findViewById(R.id.module11B);
        Module12=(CardView) findViewById(R.id.module12);
        Module13=(CardView) findViewById(R.id.module13);
        Module14=(CardView) findViewById(R.id.module14);
        Module15=(CardView) findViewById(R.id.module15);
        Module16=(CardView) findViewById(R.id.module16);
        Module17=(CardView) findViewById(R.id.module17);

        Module1.setOnClickListener(this);
        Module2.setOnClickListener(this);
        Module3.setOnClickListener(this);
        Module4.setOnClickListener(this);
        Module5.setOnClickListener(this);
        Module6.setOnClickListener(this);
        Module7.setOnClickListener(this);
        Module8.setOnClickListener(this);
        Module9.setOnClickListener(this);
        Module10.setOnClickListener(this);
        Module11A.setOnClickListener(this);
        Module11B.setOnClickListener(this);
        Module12.setOnClickListener(this);
        Module13.setOnClickListener(this);
        Module14.setOnClickListener(this);
        Module15.setOnClickListener(this);
        Module16.setOnClickListener(this);
        Module17.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.module1:
                i = new Intent(this, Notes_Module1.class);
                startActivity(i);
                break;
            case R.id.module2:
                i = new Intent(this, Notes_Module2.class);
                startActivity(i);
                break;
            case R.id.module3:
                i = new Intent(this, Notes_Module3.class);
                startActivity(i);
                break;
            case R.id.module4:
                i = new Intent(this, Notes_Module4.class);
                startActivity(i);
                break;
            case R.id.module5:
                i = new Intent(this, Notes_Module5.class);
                startActivity(i);
                break;
            case R.id.module6:
                i = new Intent(this, Notes_Module6.class);
                startActivity(i);
                break;
            case R.id.module7:
                i = new Intent(this, Notes_Module7.class);
                startActivity(i);
                break;
            case R.id.module8:
                i = new Intent(this, Notes_Module8.class);
                startActivity(i);
                break;
            case R.id.module9:
                i = new Intent(this, Notes_Module9.class);
                startActivity(i);
                break;
            case R.id.module10:
                i = new Intent(this, Notes_Module10.class);
                startActivity(i);
                break;
            case R.id.module11A:
                i = new Intent(this, Notes_Module11a.class);
                startActivity(i);
                break;
            case R.id.module11B:
                i = new Intent(this, Notes_Module11b.class);
                startActivity(i);
                break;
            case R.id.module12:
                i = new Intent(this, Notes_Module12.class);
                startActivity(i);
                break;
            case R.id.module13:
                i = new Intent(this, Notes_Module13.class);
                startActivity(i);
                break;
            case R.id.module14:
                i = new Intent(this, Notes_Module14.class);
                startActivity(i);
                break;
            case R.id.module15:
                i = new Intent(this, Notes_Module15.class);
                startActivity(i);
                break;
            case R.id.module16:
                i = new Intent(this, Notes_Module16.class);
                startActivity(i);
                break;
            case R.id.module17:
                i = new Intent(this, Notes_Module17.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}
