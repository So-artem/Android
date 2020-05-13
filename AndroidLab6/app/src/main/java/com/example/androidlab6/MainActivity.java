package com.example.androidlab6;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    FragmentManager manager = getSupportFragmentManager();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_go_to_second:
                Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent2);

                return true;
            case R.id.action_go_to_third:
                Intent intent3 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent3);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void onClick(View v) {
        OneButtonDialog oneButtonDialog = new OneButtonDialog();
        oneButtonDialog.show(manager, "oneButton");

    }

    public void onClick2(View v) {
        TwoButtonDialog twoButtonDialog = new TwoButtonDialog();
        twoButtonDialog.show(manager, "twoButton");

    }

    public void onClick3(View v) {
        ThreeButtonFragment threeButtonFragment = new ThreeButtonFragment();
        threeButtonFragment.show(manager, "threeButton");
    }

}

