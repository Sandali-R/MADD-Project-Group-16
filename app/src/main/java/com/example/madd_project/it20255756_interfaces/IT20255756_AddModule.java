package com.example.madd_project.it20255756_interfaces;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.madd_project.R;
import com.thebluealliance.spectrum.SpectrumPalette;

import java.util.ArrayList;

public class IT20255756_AddModule extends AppCompatActivity {

    SpectrumPalette palette;

    int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide top action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_it20255756_add_module);

        palette = findViewById(R.id.palette);

        palette.setOnColorSelectedListener(
                clr -> color = clr
        );

        //Default colour setup
        palette.setSelectedColor(getResources().getColor(R.color.colour1));
        color = getResources().getColor(R.color.colour1);


    }
/*
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.save:

            int color = this.color;

            if

        return super.onOptionsItemSelected(item);
    }*/
}