package com.example.lab8;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class oneButtonDialog extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Додаткова інформація")
                .setMessage("Для того щоб відкрити уже створений запис потрібно натиснути на \"Відкрити\" " +
                        "\n Для зберігання потрібно натиснути \"Зберегти\", у цьому випадку попередній запис буде замінений новим" +
                        "\n\n Проект створив студент групи ІПЗ-17-1 Собко Артем")
                .setPositiveButton("ОК", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        return builder.create();
    }
}
