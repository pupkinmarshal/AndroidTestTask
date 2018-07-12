package com.example.user.testtask;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class BaseActivity  extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shared_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
//        switch (id) {
//            case R.id.action_menu:
//                return true;
//            case R.id.action_cat:
//                Intent intent = new Intent(this, CategoriesActivity.class);
//                startActivity(intent);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
        return true;
    }
    public void onStartupClick(MenuItem item)
    {
        Intent intent = new Intent(this, CategoriesActivity.class);
        startActivity(intent);
    }
    public void onGroupClick(MenuItem item)
    {
        String id=item.getTitle().toString();
        Intent intent = new Intent(this, ItemsActivity.class);
        intent.putExtra("id",id);
        startActivity(intent);

    }
}
