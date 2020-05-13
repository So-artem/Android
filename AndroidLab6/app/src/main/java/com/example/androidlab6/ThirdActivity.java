package com.example.androidlab6;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_third, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_go_to_first:
                Intent intent1 = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intent1);

                return true;
            case R.id.action_go_to_second:
                Intent intent2 = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent2);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void showRatingDialog(View v) {

        final AlertDialog.Builder ratingdialog = new AlertDialog.Builder(this);

        ratingdialog.setIcon(android.R.drawable.btn_star_big_on);
        ratingdialog.setTitle("Голосування");

        View linearlayout = getLayoutInflater().inflate(R.layout.ratingdialog, null);
        ratingdialog.setView(linearlayout);

        final RatingBar ratingBar = (RatingBar)linearlayout.findViewById(R.id.ratingbar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

                Toast.makeText(ThirdActivity.this, "Рейтинг: " + String.valueOf(rating),
                        Toast.LENGTH_SHORT).show();
            }
        });
        ratingdialog.create();
        ratingdialog.show();
    }
}
