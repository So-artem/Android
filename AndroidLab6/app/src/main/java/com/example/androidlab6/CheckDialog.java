package com.example.androidlab6;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class CheckDialog extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] NamesArray = {"Елемент 1", "Елемент 2", "Елемент 3"};
        final boolean[] checkedItemsArray = {false, false, false};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Виберіть елемент")
                .setMultiChoiceItems(NamesArray, checkedItemsArray,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which, boolean isChecked) {
                                checkedItemsArray[which] = isChecked;
                            }
                        })
                .setPositiveButton("Ок",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                StringBuilder state = new StringBuilder();
                                for (int i = 0; i < NamesArray.length; i++) {
                                    //state.append(NamesArray[i]);
                                    if (checkedItemsArray[i])
                                        state.append(NamesArray[i] + " обраний\n");
                                }
                                Toast.makeText(getActivity(),
                                        state.toString(), Toast.LENGTH_LONG)
                                        .show();
                            }
                        })

                .setNegativeButton("Відміна",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                dialog.cancel();
                            }
                        });

        return builder.create();
    }
}
