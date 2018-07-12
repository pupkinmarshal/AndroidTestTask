package com.example.user.testtask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ItemsActivity extends BaseActivity{
    Spinner spinner2;
    Spinner spinner;
    TextView tV;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        spinner=(Spinner)findViewById(R.id.spinner);
        tV=(TextView)findViewById(R.id.textView);
        String id = getIntent().getExtras().getString("id",null);

        if(id!=null) {
            int i=0;
            for(String s : getResources().getStringArray(R.array.categories_array))
            {
                if(id.equals(s))
                    break;
                i++;
            }
            spinner2.setSelection(i);
        }
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ArrayAdapter<CharSequence> adapter;
                switch(i)
                {
                    case 0:

                        adapter=  ArrayAdapter.createFromResource(ItemsActivity.this, R.array.first_array, android.R.layout.simple_spinner_item);
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner.setAdapter(adapter);
                        break;
                    case 1:
                        adapter=  ArrayAdapter.createFromResource(ItemsActivity.this, R.array.second_array, android.R.layout.simple_spinner_item);
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner.setAdapter(adapter);
                        break;
                    case 2:
                        adapter=  ArrayAdapter.createFromResource(ItemsActivity.this, R.array.snacks_array, android.R.layout.simple_spinner_item);
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner.setAdapter(adapter);
                        break;
                    case 3:
                        adapter=  ArrayAdapter.createFromResource(ItemsActivity.this, R.array.deserts_array, android.R.layout.simple_spinner_item);
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner.setAdapter(adapter);
                        break;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
String[] array=getResources().getStringArray(R.array.items_array);

                switch(i)
                {
                    case 0:
                        tV.setText(SplitArray(array)[0]);
                        break;
                    case 1:
                        tV.setText(SplitArray(array)[1]);
                        break;
                    case 2:
                        tV.setText(SplitArray(array)[2]);
                        break;
                    case 3:
                        tV.setText(SplitArray(array)[3]);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
    String[] SplitArray(String[] ar)
    {
        int spinner2Id=(int)spinner2.getSelectedItemId();
        return ar[spinner2Id].split("OwO",0);
    }
}
