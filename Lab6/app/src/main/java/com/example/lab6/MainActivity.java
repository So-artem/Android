package com.example.lab6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int IDD_THREE_BUTTONS = 2 ;
    AlertDialog.Builder ad;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        String title = "Вибір є завжди";
        String message = "Віберіть відповідь";
        String button1String = "Здам лабораторну";
        String button2String = "Ні, не здам";

        ad = new AlertDialog.Builder(context);
        ad.setTitle(title); // заголовок
        ad.setMessage(message); // повідомлення
        ad.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                Toast.makeText(context, "Ви зробили вірний вибір",
                        Toast.LENGTH_LONG).show();
            }
        });
        ad.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int arg1) {
                Toast.makeText(context, "Можливо…", Toast.LENGTH_LONG)
                        .show();
            }
        });
        ad.setCancelable(true);
        ad.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialog) {
                Toast.makeText(context, "Ви не зробили вибір!",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
    public void onClick(View v) {
       // ad.show();
        showDialog(IDD_THREE_BUTTONS);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case 0:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Виберіть правильну відповідь")
                        .setCancelable(false)
                        .setPositiveButton("Так",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        dialog.cancel();
                                    }
                                })
                        .setNeutralButton("Ні",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        dialog.cancel();
                                    }
                                })
                        .setNegativeButton("Невідомо!",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        dialog.cancel();
                                    }
                                });

                return builder.create();

            case 1:

                final String[] mLab6Name ={"Здам", "Не здам", "До дому піду"};
                builder = new AlertDialog.Builder(this);
                builder.setTitle("Варіанти дій"); // заголовок для діалогу
                builder.setItems(mLab6Name, new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {
                        // TODO Auto-generated method stub
                        Toast.makeText(getApplicationContext(),
                                "Вибраний варіант: " + mLab6Name[item],
                                Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setCancelable(false);
                return builder.create();
            case 2:
                final String[] mChooselab6 = {"Здам", "Не здам", "До дому піду"};
                builder = new AlertDialog.Builder(this);
                builder.setTitle("Виберіть варіант дій")
                        .setCancelable(false)
                        // додаємо одну кнопку для закриття діалогу
                        .setNeutralButton("Назад",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        dialog.cancel();
                                    }
                                })
                        // додаємо перемикачі
                        .setSingleChoiceItems(mChooselab6, -1, new DialogInterface.OnClickListener() {
                            @Override
                                    public void onClick(DialogInterface dialog,
                                                        int item) {
                                        Toast.makeText(
                                                getApplicationContext(),
                                                "Вибрали: "
                                                        + mChooselab6[item],
                                                Toast.LENGTH_SHORT).show();
                                    }
                                });
                return builder.create();

            default:
                return null;
        }

    }

    }






