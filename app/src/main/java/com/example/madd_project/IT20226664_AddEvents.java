package com.example.madd_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class IT20226664_AddEvents extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide top action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_it20226664_add_events);
    }




    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);

        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3:
                Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4:
                Toast.makeText(this, "Item 4 clicked", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return false;
        }

    }

}