package com.example.androidlab6;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class TwoButtonDialog extends AppCompatDialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title = "Діалог";
        String message = "Діалог з двома кнопками";
        String button1String = "Ок";
        String button2String = "Відміна";

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getActivity(), "Ок",
                        Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getActivity(), "Відміна", Toast.LENGTH_LONG)
                        .show();
            }
        });
        builder.setCancelable(true);

        return builder.create();
    }
}
