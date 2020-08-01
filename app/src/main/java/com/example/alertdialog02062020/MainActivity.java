package com.example.alertdialog02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnAlertDialog = findViewById(R.id.buttonAlertDialog);

        mBtnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Ban muon chon con vat nao ?");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(false);

                // single choice
                final String[] arrayAnimal = {"Meo","Cho","Ga","Heo","Vit"};
                builder.setSingleChoiceItems(arrayAnimal, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,arrayAnimal[which] , Toast.LENGTH_SHORT).show();
                    }
                });

                builder.show();
            }
        });

    }
}