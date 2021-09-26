package com.example.madd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class IT20226664_AddCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide top action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_it20226664_add_category);
    }
}