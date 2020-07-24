package com.maochun.sidemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.PopupMenu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_main_item1:
                Toast.makeText(this, "Menu item1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_main_item2:
                Toast.makeText(this, "Menu item2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_main_item3:
                Toast.makeText(this, "Menu item3", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }


    public void onMenuButtonClick(View v){

        Context wrapper = new ContextThemeWrapper(this, R.style.AccountOptPopupMenuStyle);
        PopupMenu popup = new PopupMenu(wrapper, v);

        //PopupMenu popup = new PopupMenu(this, v);

        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_main, popup.getMenu());
        popup.setOnMenuItemClickListener(this);
        popup.show();
    }
}