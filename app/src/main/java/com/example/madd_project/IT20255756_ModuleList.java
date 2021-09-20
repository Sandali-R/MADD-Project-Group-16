package com.example.madd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IT20255756_ModuleList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide top action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_it20255756_module_list);
    }
}