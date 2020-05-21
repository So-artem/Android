package com.example.androidlab;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_second, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onClickGoTo(MenuItem item){
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickShowInfo(MenuItem item){
        TextView info = (TextView) findViewById(R.id.textView);
        info.setText(getResources().getText(R.string.information));
    }

    public void onClickChangeColor(MenuItem item){
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#4284D3"));
    }

}
