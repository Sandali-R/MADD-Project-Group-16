package com.example.madd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IT20225674_CalenderView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide top action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_it20225674_calender_view);
    }
}