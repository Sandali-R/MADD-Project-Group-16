package com.example.madd_project.it20255756_interfaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.madd_project.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class IT20255756_ModuleList extends AppCompatActivity {

    RecyclerView recyclerView;
    IT20255756_ModuleAdapter it20255756_moduleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide top action bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_it20255756_module_list);

        recyclerView = (RecyclerView)findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<IT20255756_ModuleModel> options = new FirebaseRecyclerOptions.Builder<IT20255756_ModuleModel>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("Module"),IT20255756_ModuleModel.class)
                .build();

        it20255756_moduleAdapter = new IT20255756_ModuleAdapter(options);
        recyclerView.setAdapter(it20255756_moduleAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        it20255756_moduleAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        it20255756_moduleAdapter.stopListening();
    }
}