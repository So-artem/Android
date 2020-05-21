package com.example.androidlab;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ImageView imageView = findViewById(R.id.imageView2);
         imageView.setOnClickListener(viewClickListener);
    }


    View.OnClickListener viewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showPopupMenu(v);
        }
    };

    private void showPopupMenu(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.inflate(R.menu.popupmenu);

        popupMenu
                .setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu1:
                                activityChanger();
                                Toast.makeText(getApplicationContext(),
                                        "Інша активність",
                                        Toast.LENGTH_SHORT).show();

                                return true;
                            case R.id.menu2:
                                informator();
                                Toast.makeText(getApplicationContext(),
                                        "Додаткова інформація",
                                        Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.menu3:
                                colorChanger("#4284D3");
                                Toast.makeText(getApplicationContext(),
                                        "Колір змінено",
                                        Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.menu4:


                                Toast toast = Toast.makeText(getApplicationContext(),
                                        "Це є toast з tostом",
                                        Toast.LENGTH_SHORT);
                                toast.setGravity(Gravity.CENTER, 0, 0);
                                LinearLayout toastContainer = (LinearLayout) toast.getView();
                                ImageView tostImageView = new ImageView(getApplicationContext());
                                tostImageView.setImageResource(R.drawable.tost);
                                toastContainer.addView(tostImageView,0);
                                toast.show();
                                return true;
                            default:
                                return false;
                        }
                    }
                });

        popupMenu.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void colorChanger(String color){
        getWindow().getDecorView().setBackgroundColor(Color.parseColor(color));
    }

    public void activityChanger(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void informator(){
        TextView info = findViewById(R.id.textView);
        info.setText(getResources().getText(R.string.information));
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_info:
                informator();
                return true;
            case R.id.action_go_to:
                activityChanger();
                return true;
            case R.id.action_change_color:
                colorChanger("#4284D3");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
