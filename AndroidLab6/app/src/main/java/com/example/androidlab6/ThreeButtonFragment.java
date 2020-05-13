package com.example.androidlab6;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ThreeButtonFragment extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String button1String = "Нажата перша кнопка";
        String button2String = "Нажата друга кнопка";
        String button3String = "Нажата третя кнопка";

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Діалог")
                .setMessage("Діалог з трьома кнопками")
                .setCancelable(true)
                .setPositiveButton("перша кнопка",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                Toast.makeText(getActivity(), "Перша кнопка", Toast.LENGTH_SHORT)
                                        .show();
                                dialog.cancel();
                            }
                        })
                .setNeutralButton("Претя кнопка",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                Toast.makeText(getActivity(), "Третя кнопка", Toast.LENGTH_SHORT)
                                        .show();
                                dialog.cancel();
                            }
                        })
                .setNegativeButton("Друга кнопка",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                Toast.makeText(getActivity(), "Друга кнопка", Toast.LENGTH_SHORT)
                                        .show();
                                dialog.cancel();
                            }
                        });
        return builder.create();
    }
}
