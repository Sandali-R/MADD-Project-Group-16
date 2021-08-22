package com.example.madd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IT20218058_LogAndRegister extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it20218058_log_and_register);

        btn = findViewById(R.id.btn_login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_home_page(v);
            }
        });

    }

    private void open_home_page(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}