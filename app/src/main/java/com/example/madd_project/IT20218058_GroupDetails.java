package com.example.madd_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class IT20218058_GroupDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide top action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_it20218058_group_details);
    }
    public void changeFragment(View v){

        Fragment fragment = new IT20218058_Group();

        if(v==findViewById(R.id.btn_group)){

            fragment = new IT20218058_Group();

        }else if(v==findViewById(R.id.btn_goal)){

            fragment = new IT20218058_Goal();

        }else if(v==findViewById(R.id.btn_rank)){

            fragment = new IT20218058_Ranking();

        }else if(v==findViewById(R.id.btn_friends)){

        fragment = new IT20218058_Friends();

    }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainerView,fragment);
        ft.commit();
    }
}