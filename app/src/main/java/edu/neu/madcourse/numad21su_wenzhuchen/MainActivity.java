package edu.neu.madcourse.numad21su_wenzhuchen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set About button onClickListener
        Button btnAboutDialog = findViewById(R.id.btnAbout);
        btnAboutDialog.setOnClickListener(new View.OnClickListener() {
            //  set AboutMe info dialog
            @Override
            public void onClick(View view) {
                AlertDialog.Builder aboutMe = new AlertDialog.Builder(MainActivity.this);
                aboutMe.setTitle("About me:");
                aboutMe.setMessage("Name: Wenzhu Chen \nEmail: chen.wenzh@northeastern.edu");
                aboutMe.setCancelable(true);
                aboutMe.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                aboutMe.create();
                aboutMe.show();
            }
        });
    }

}