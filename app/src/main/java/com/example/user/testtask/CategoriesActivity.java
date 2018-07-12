package com.example.user.testtask;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class CategoriesActivity extends BaseActivity{
    Spinner spinner2;
    Spinner spinner;
    TextView tV;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }
    public void onGroupClick(View v)
    {
        String id=((Button) v).getText().toString();
        Intent intent = new Intent(this, ItemsActivity.class);
        intent.putExtra("id",id);
        startActivity(intent);
    }

}
