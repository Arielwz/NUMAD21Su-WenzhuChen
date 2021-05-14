package edu.neu.madcourse.numad21su_wenzhuchen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnAboutClick (View view) {
        TextView myInfo = findViewById(R.id.txtAboutInfo);
        myInfo.setText("Wenzhu Chen \nchen.wenzh@northeastern.edu");
    }
}