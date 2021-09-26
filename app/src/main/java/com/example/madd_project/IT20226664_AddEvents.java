package com.example.madd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class IT20226664_AddEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide top action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_it20226664_add_events);
    }

    public void open_edit_event_page(View view) {

        setContentView(R.layout.activity_it20226664_edit_events);
    }

    public void open_event_page(View view) {

        setContentView(R.layout.activity_it20226664_my_events);
    }
}