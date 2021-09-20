package com.example.madd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IT20218058_MyGroups extends AppCompatActivity {

    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide top action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_it20218058_my_groups);

        imgView = findViewById(R.id.imgv_addbtn);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_createGroup_page(v);
            }
        });

        imgView = findViewById(R.id.imgv_info1);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_groupDetails_page(v);
            }
        });

    }

    public void open_createGroup_page(View view) {
        Intent intent = new Intent(this,IT20218058_CreateGroup.class);
        startActivity(intent);
    }

    public void open_groupDetails_page(View view) {
        Intent intent = new Intent(this,IT20218058_GroupDetails.class);
        startActivity(intent);
    }
}