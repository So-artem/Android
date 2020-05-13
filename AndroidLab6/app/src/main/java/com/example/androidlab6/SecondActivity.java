package com.example.androidlab6;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    FragmentManager manager = getSupportFragmentManager();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_go_to_first:
                Intent intent1 = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent1);

                return true;
            case R.id.action_go_to_third:
                Intent intent3 = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent3);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void onClick4(View v) {
        ListDialog listDialog = new ListDialog();
        listDialog.show(manager, "listDialog");
    }

    public void onClick5(View v) {
        RadioDialog radioDialog = new RadioDialog();
        radioDialog.show(manager, "radioDialog");
    }

    public void onClick6(View v) {
        CheckDialog checkDialog = new CheckDialog();
        checkDialog.show(manager, "checkDialog");
    }


}
