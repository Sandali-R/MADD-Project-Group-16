package com.example.madd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IT20218058_MyHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide top action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_it20218058_my_history);
    }
}