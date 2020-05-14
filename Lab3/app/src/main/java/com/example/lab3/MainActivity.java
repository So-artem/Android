package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private String getScreenOrientation(){
        if(getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_PORTRAIT)
            return "Портретна орієнтація";
        else if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE)
            return "Альбомна орієнтація";
        else
            return "";
    }
    public void onClick1(View v) {
        Toast.makeText(this, getScreenOrientation(), Toast.LENGTH_SHORT).show();
    }
    }


